package com.xworkz.bakery;


import java.util.LinkedList;
import java.util.List;

import com.xworkz.bakery.dao.PastryDAO;
import com.xworkz.bakery.dao.PastryDAOImpl;
import com.xworkz.bakery.dto.PastryDTO;

public class PastryTester {

	public static void main(String[] args) {
		List<PastryDTO > list=new LinkedList<PastryDTO >();
		PastryDTO pastry = new PastryDTO("pineapple", 50, 1);

		PastryDAO dao = new PastryDAOImpl(list);
		dao.save(pastry);
		PastryDTO pastry1 = new PastryDTO("mango", 60, 1);
		dao.save(pastry1);
		PastryDTO pastry2 = new PastryDTO("blackforest", 60, 1);
		dao.save(pastry2);

		boolean update1 = dao.updatePriceByFlavor(70, "blackforest");
		System.out.println("update " + update1);

		boolean delete = dao.deleteByFlavor("pineapple");
		System.out.println("delete " + delete);
		
 System.out.println(dao.getAll());
 dao.findByflavor("mango");
	 
 }
	}


