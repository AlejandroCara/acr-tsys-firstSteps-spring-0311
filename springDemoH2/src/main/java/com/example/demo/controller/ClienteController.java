package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Mago;
import com.example.demo.services.MagoService;

@RestController
@RequestMapping("/mago")
public class ClienteController {
	
	@Autowired
	MagoService magoService;
	
	@GetMapping("/all")
	public List<Mago> getAll(){
		return magoService.listAll();
	}
	
	@GetMapping("/one/{id}")
	public Mago getOne(@PathVariable(name="id") int id){
		return magoService.listOne(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Mago mago){
		magoService.save(mago);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Mago mago){
		magoService.updateOne(mago);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody int id){
		magoService.deleteOne(id);
	}
}
