package test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

@Configuration
public class CassandraConfig {

  /*
   * Use the standard Cassandra driver API to create a com.datastax.driver.core.Session instance.
   */
  public @Bean Session session() {
    Cluster cluster = Cluster.builder().addContactPoints("localhost").build();
    return cluster.connect("odkeyspace");
  }
}

