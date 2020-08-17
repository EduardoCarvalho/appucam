package com.appucam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.appucam.entities.Empresa;
import com.appucam.repositories.EmpresaRepository;

@SpringBootApplication
public class AppucamApplication implements CommandLineRunner {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppucamApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		empresaRepository.save(new Empresa("Silva ME", "SporTech"));
		empresaRepository.save(new Empresa("Carvalho Eireli", "FinTech"));
		empresaRepository.save(new Empresa("three", "one"));
		
	}

}
