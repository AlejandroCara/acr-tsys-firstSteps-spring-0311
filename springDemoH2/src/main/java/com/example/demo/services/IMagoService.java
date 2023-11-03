package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Mago;

public interface IMagoService {
	
	//Listar todos
	public List<Mago> listAll();
	
	//Listar por id
	public Mago listOne(int id);
	
	//Guardar
	public void save(Mago mago);
	
	//Actualizar por id
	public void updateOne(Mago mago);
	
	//Eliminar por id
	public void deleteOne(int id);
	
}
