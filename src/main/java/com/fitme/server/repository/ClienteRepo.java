package com.fitme.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitme.server.model.Cliente;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente,Long>{

}
