package test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

	private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

	@Autowired
	private ConfigurationService configurationService;

}