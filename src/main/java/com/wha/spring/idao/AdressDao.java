package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Adress;

public interface AdressDao {
	void saveAdress(Adress adress);
	void updateAdress(Adress adress);
	
	public List<Adress> findAllAdresses();
	
	public void deleteAdress(Adress adress) ;
}
