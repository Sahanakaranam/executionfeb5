package com.xworkz.bakery.dao;

import java.util.Iterator;
import java.util.List;
import com.xworkz.bakery.dto.PastryDTO;

public class PastryDAOImpl implements PastryDAO {

	private static final String type = null;
	private List<PastryDTO> pastry;

	public PastryDAOImpl(List<PastryDTO> list) {
		this.pastry = list;
		System.out.println("created PastryDAOImpl");
	}

	public PastryDAOImpl() {

	}

	@Override 
	public boolean save(PastryDTO dto) {
		boolean added = false;
		if(pastry!=null) {
			System.out.println("pastry is not null");
		}else {
			System.out.println("pastry is null");
		}
		boolean contains = this.pastry.contains(dto);
		if (!contains) {
			added = this.pastry.add(dto);
		}
		if (added) {
			System.out.println("pastry added");
		} else {
			System.out.println("pastry not added");
		}
		return added;
	}

	@Override
	public boolean updatePriceByFlavor(int price, String name) {
		System.out.println("updatePriceByFlavor");
		System.out.println("price " + price);
		PastryDTO pastry = this.findByFlavor(price);
		if (pastry != null) {
			System.out.println("can update");
			pastry.setFlavor("mango");
			pastry.setPrice(50);
			return true;
		} else {
			System.out.println("can't update");
		}

		return false;

	}

	private PastryDTO findByFlavor(int price) {
		return null;
	}

	@Override
	public PastryDTO findByflavor(String flavor) {
		System.out.println("invoked findByFlavor");
		System.out.println("Flavor" + flavor);
		for (PastryDTO pastryDTO : this.pastry) {
			String flavorFromDTO = pastryDTO.getFlavor();
			if (flavorFromDTO.equals(flavor)) {
				System.out.println("flavorfound");
				return pastryDTO;
			}else {
				System.out.println("flavor not found");
			}
		}
		return null;

	}

	@Override
	public boolean deleteByFlavor(String flavor) {
		Iterator<PastryDTO> iterator = this.pastry.iterator();
		while (iterator.hasNext()) {
			PastryDTO dto = iterator.next();
			if (dto.getFlavor().equals(flavor)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public List<PastryDTO> getAll() {
		return this.pastry;
	}


}