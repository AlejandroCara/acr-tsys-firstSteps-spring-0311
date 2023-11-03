package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMagoDAO;
import com.example.demo.dto.Mago;


@Service
public class MagoService implements IMagoService {
	
	@Autowired
	IMagoDAO iMagoDAO;
	
	@Override
	public List<Mago> listAll() {
		return iMagoDAO.findAll();
	}

	@Override
	public Mago listOne(int id) {
		return iMagoDAO.findById(id).get();
	}

	@Override
	public void save(Mago mago) {
		iMagoDAO.save(mago);
	}

	@Override
	public void updateOne(Mago mago) {
		iMagoDAO.save(mago);
	}

	@Override
	public void deleteOne(int id) {
		iMagoDAO.deleteById(id);
	}

}
