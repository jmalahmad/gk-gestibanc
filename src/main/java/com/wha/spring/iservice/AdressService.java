package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Adress;

public interface AdressService {
	void saveAdress(Adress adress);

	void updateAdress(Adress adress);

	public List<Adress> findAllAdresses();

	public void deleteAdress(Adress adress);
}
