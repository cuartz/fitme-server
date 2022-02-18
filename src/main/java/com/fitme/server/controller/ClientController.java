package com.fitme.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fitme.server.model.*;
import com.fitme.server.repository.ClienteRepo;

@RestController
@RequestMapping("/api/v1/")
public class ClientController {

	@Autowired
	private ClienteRepo clienteRepo;
	
	@CrossOrigin
	@GetMapping("cliente")
	public List<Cliente> getAllClients() {
		return clienteRepo.findAll();
	}
			
}
