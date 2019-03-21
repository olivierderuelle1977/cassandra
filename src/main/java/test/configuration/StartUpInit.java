package test.configuration;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class StartUpInit {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppContextEventListener.class);
	
	@PostConstruct
	public void init(){
		LOGGER.debug("Creating temp folders...");
	}

}