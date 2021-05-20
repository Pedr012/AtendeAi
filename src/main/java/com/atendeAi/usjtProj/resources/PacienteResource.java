package com.atendeAi.usjtProj.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atendeAi.usjtProj.entities.Paciente;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {
	
	@GetMapping
	public ResponseEntity<Paciente> findAll(){
		Paciente p = new Paciente ("Joao","Paraiba", "75538773", "joao@teste.com", "JOao1234", "05882657", 1, 21, 23466, 21);
		return ResponseEntity.ok().body(p);
		
	}
	
}
