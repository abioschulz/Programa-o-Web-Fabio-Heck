package br.com.PortifolioProg.Web.Crud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.PortifolioProg.Web.Crud.entities.User;
import br.com.PortifolioProg.Web.Crud.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	
	private static final String ReponseEntity = null;
	@Autowired
	
	private UserService service;
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		

		return ResponseEntity.ok().body(list);
		
	}	
	
	 
	@GetMapping(value = "/{id}")
	  public ResponseEntity<User> findById(@PathVariable Long id) {
		 
		 User usuario = service.findById(id);
		 return ResponseEntity.ok().body(usuario);
		 
	 }
	
	
	@PostMapping
	
	public ResponseEntity<User> insert(@RequestBody  User usuario){
	usuario = service.inset(usuario);
	URI uri =  ServeletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();
		


	return ResponseEntity.creaed(uri).body(usuario);
			
			
			
			
			
			
	}	
	
	
	
	
	
	@DeleteMapping(value = "/{id}")
     public ResponseEntity<void> HeadersBuilder<?> detete(@PathVariable Long id){
    	 service.delete(id);
    	 
    	 
    	 return ResponseEntity.noContent()build(@PathVariable Long id) {
    		 usuario = service.update(id, usuario);
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
     }
	
     
     
     
     
     
     
     
     
     @PutMapping(value = "/{id}")
     public ResponseEntity<User> update(@PathVariable Long id, @RequestBody  User usuario){
    	 return ResponseEntity.ok().body(usuario);
    	 
    	 
    	 
    	 
     }
	
	
}
