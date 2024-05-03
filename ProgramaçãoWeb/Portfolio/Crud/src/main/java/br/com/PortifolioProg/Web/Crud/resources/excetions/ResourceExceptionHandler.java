package br.com.PortifolioProg.Web.Crud.resources.excetions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.PortifolioProg.Web.Crud.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResnponseEntity<StandardError>resourceNotFound(RecorseNotFoundException e,  httpServRequest request){
		
		String erro = "Nao encontrei informação solicitada";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError erro1 = new StandardError(Intant.now(), status.value(), e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(erro1);
	}
	
	
	
	
	

}
