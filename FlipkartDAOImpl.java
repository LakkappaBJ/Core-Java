package com.xworkz.java.CRUDOperation;

import java.util.Iterator;

public class FlipkartDAOImpl {
	MobileDTO1 dtos[] = new MobileDTO1[2];
	int i = 0;

	String add(MobileDTO1 lucky) {
		dtos[i] = lucky;
		i++;
		return "Data stored successfully";
	}

	public void printAll() {
		for (int ind = 0; ind < dtos.length; ind++) {
			System.out.println(dtos[ind]);
		}

	}

	public MobileDTO1 getBybrandName(String brandName) {
		MobileDTO1 dataTran = null;
		for (int in = 0; in < dtos.length; in++) {
			if (dtos[in] != null && brandName.equals(dtos[in].getBrandName())) {
				dataTran = dtos[in];
				return dataTran;
			}
		}
		return dataTran;
	}

	public MobileDTO1 deleteByColor(String colr) {
		MobileDTO1 dt = null;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null && colr.equals(dtos[i].getColor())) {
				dtos[i] = null;
			}
		}

		return dt;
	}

	public MobileDTO1 updateBybrandName(String oldName, String newName) {
		MobileDTO1 dt1 = null;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null && oldName.equals(dtos[i].getBrandName())) {
				dtos[i].setBrandName(newName);
			}
			return dtos[i];
		}
		return dt1;
	}
}
