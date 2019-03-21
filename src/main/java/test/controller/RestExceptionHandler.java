package test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
  
	private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

	@ExceptionHandler(HttpServerErrorException.class)
	protected ResponseEntity<Object> handleHttpServerErrorException(HttpServerErrorException ex) {
		String responseString = ex.getResponseBodyAsString();
		String msg=responseString;
		LOGGER.error("handleHttpServerErrorException, statusCode: "+ex.getStatusCode()+" msg: "+msg,ex);
		return new ResponseEntity<Object>(msg, ex.getStatusCode());
	}

	@ExceptionHandler(HttpClientErrorException.class)
	protected ResponseEntity<Object> handleHttpClientErrorException(HttpClientErrorException ex) {
		String responseString = ex.getResponseBodyAsString();
		String msg=responseString;
		//LOGGER.error("HttpClientErrorException, statusCode:"+ex.getStatusCode()+" msg:"+msg,ex);
		return new ResponseEntity<Object>(msg, ex.getStatusCode());
	}
		
	@ExceptionHandler(Throwable.class)
	protected ResponseEntity<Object> handleAllThrowables(Throwable ex) {
		String responseString = ex.getMessage();
		String message = "{\"errorMessage\":\""+responseString+"\"}";
		LOGGER.error("handleAllThrowables, Throwable: "+ex.getClass()+" msg: "+message,ex);
		return new ResponseEntity<Object>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}
   
}