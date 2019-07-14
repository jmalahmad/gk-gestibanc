package com.wha.spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.AdressDao;
import com.wha.spring.iservice.AdressService;
import com.wha.spring.model.Adress;

@Service("adressService")
@Transactional
public class AdressServiceImpl implements AdressService {

	@Autowired
	AdressDao adressDAO;

	public void saveAdress(Adress adress) {
		adressDAO.saveAdress(adress);
	}

	public void updateAdress(Adress adress) {
		adressDAO.updateAdress(adress);
	}

	public List<Adress> findAllAdresses() {
		return null;
	}

	public void deleteAdress(Adress adress) {
		adressDAO.deleteAdress(adress);

	}
}
