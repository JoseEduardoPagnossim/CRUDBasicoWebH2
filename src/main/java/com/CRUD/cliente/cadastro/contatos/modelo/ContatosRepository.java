package com.CRUD.cliente.cadastro.contatos.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContatosRepository extends JpaRepository<Contato, Long> {

}
