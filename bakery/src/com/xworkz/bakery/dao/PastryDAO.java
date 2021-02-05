package com.xworkz.bakery.dao;

import java.util.List;

import com.xworkz.bakery.dto.PastryDTO;

public interface PastryDAO {
	
	boolean save(PastryDTO dto);
	boolean updatePriceByFlavor(int price, String flavor);
	boolean deleteByFlavor(String flavor);
	PastryDTO findByflavor(String flavor);
	List<PastryDTO> getAll();
	





}
