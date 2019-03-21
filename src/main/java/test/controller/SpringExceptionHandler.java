package test.controller;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.web.bind.MissingServletRequestParameterException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice  
public class SpringExceptionHandler extends ExceptionHandlerExceptionResolver
{

	private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);	

	@ExceptionHandler({
				UserException.class,
				HttpMessageNotReadableException.class,
				MissingServletRequestParameterException.class,
				MethodArgumentNotValidException.class
	})
	protected ResponseEntity<Object> handleUserException(Exception ex) {
		LOGGER.debug("SpringExceptionHandler, handleUserException",ex);
		String jsonEncodedString = JSONObject.quote(ex.getMessage());
		String message = "{\"errorMessage\":"+jsonEncodedString+"}";
		return new ResponseEntity<Object>(message, HttpStatus.BAD_REQUEST);
	}
	
	@SuppressWarnings("unused")
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handleControllerException(Throwable ex, WebRequest req)
	{
		LOGGER.debug("SpringExceptionHandler, handleControllerException",ex);
		String jsonEncodedString = JSONObject.quote(ex.getMessage());
		String message = "{\"errorMessage\":"+jsonEncodedString+"}";
		return new ResponseEntity<String>(message,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}