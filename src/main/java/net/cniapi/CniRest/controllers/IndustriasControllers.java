package net.cniapi.CniRest.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
 
import org.springframework.web.bind.annotation.*;

import net.cniapi.CniRest.models.Industrias;
import net.cniapi.CniRest.service.IndustriasService;



@RestController
public class IndustriasControllers {
	 @Autowired
	  private IndustriasService service;
	 
	 @GetMapping("/industrias")
	 public List<Industrias> list() {
	     return service.listAll();
	 }
	 
	 @GetMapping("/industria/{id}")
	 public  Optional<Industrias> industria(@PathVariable Integer id) {
		 
	     return service.get(id);
	 }
	 
	 @PostMapping("/novaindustria")
	 public String novaIndustria(@RequestBody Industrias industria) {
		 service.save(industria);
		 return "{mensagem:'salvo com sucesso'}";
	 }
	 
	 @PutMapping("/editarindustria")
	 public String editarEmpresa(@RequestBody Industrias industria) {
		 service.save(industria);
		 return "{mensagem:'editar com sucesso'}";
	 }
	     
	  
	  @DeleteMapping("/deletarindustria/{id}")
	  public String deletarIndustria(@PathVariable Integer id) {
			 service.delete(id);
			 return "{mensagem:'apagado com sucesso'}";
		 }
	 
	 
}
