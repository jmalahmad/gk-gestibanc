package com.wha.spring.dao;

import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.AdressDao;
import com.wha.spring.model.Adress;

@Repository("adressDao")
@Transactional
public class AdressDaoImpl extends AbstractDao implements AdressDao {

	public void saveAdress(Adress adress) {
		persist(adress);
	}

	public void updateAdress(Adress adress) {
		getSession().update(adress);
	}

	public List<Adress> findAllAdresses() {
		return null;
	}

	public void deleteAdress(Adress adress) {
		getSession().delete(adress);
	}

}
