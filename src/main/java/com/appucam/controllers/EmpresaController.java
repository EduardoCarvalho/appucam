package com.appucam.controllers;

import java.util.List;
import java.util.Optional;

import com.appucam.entities.Empresa;
import com.appucam.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class EmpresaController {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@GetMapping("/empresas")
	public List<Empresa> getEmpresas() {
		return empresaRepository.findAll();
	}

	@GetMapping("/empresa/{id}")
	public Optional<Empresa> getEmpresa(@PathVariable long id) {
		return empresaRepository.findById(id);
	}

	@DeleteMapping("/empresa/{id}")
	public boolean deleteEmpresa(@PathVariable long id) {
		empresaRepository.deleteById(id);
		return true;
	}

	@PutMapping("/empresa")
	public Empresa updateEmpresa(@RequestBody Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	@PostMapping("/empresa")
	public Empresa createEmpresa(@RequestBody Empresa empresa) {
		return empresaRepository.save(empresa);
	}

}