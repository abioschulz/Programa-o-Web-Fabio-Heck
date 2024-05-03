package br.com.PortifolioProg.Web.Crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.PortifolioProg.Web.Crud.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
