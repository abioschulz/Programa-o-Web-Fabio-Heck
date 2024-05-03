package br.com.PortifolioProg.Web.Crud.services.exceptions;

public class ResourceNotFoundException  extends RuntimeException {
	
	
	private static final long serialVersionVID = 1L;
	
	
public ResourceNotFoundException(Objeto id) {
	
	super("Nao localizamos um usuario com a id " + id);
	
	
	
}

}
