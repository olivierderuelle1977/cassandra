package test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.cql.CqlTemplate;
import org.springframework.data.cassandra.core.cql.RowMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.utils.UUIDs;

import test.model.Book;
import test.service.TestService;

@RequestMapping("/test")
@RestController
@Validated
public class TestRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestRestController.class);

	@Autowired
	private Session session;

	@Autowired
	private CassandraOperations cassandraOperations;

	@RequestMapping(method = RequestMethod.GET, path = "/create", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> create() {
		LOGGER.debug("create");
		session.execute("CREATE TABLE book (id uuid primary key, title text)");
		String json="{\"response\":\"ok\"}";
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/insert/{title}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> insert(@PathVariable String title) {
		LOGGER.debug("insert");
		UUID uuid = UUIDs.timeBased();
		String insertCql = "insert into book (id, title) values (" + uuid + ", '"+title+"')";
		session.execute(insertCql);
		String json="{\"response\":\"ok\"}";
		return new ResponseEntity<String>(json, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/read", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> read() {
		LOGGER.debug("read");
		//String title=cassandraOperations.getCqlOperations().queryForObject("SELECT title FROM book", String.class);
				
		List<Book> list = cassandraOperations.getCqlOperations().query(
		"SELECT title FROM book",
		new RowMapper<Book>() {
			public Book mapRow(Row row, int rowNum) {
				Book book = new Book();
				book.setTitle(row.getString("title"));
				return book;
			}
		});

		//String json="{\"response\":\""+title+"\"}";
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}

}