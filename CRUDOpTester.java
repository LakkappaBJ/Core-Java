package com.xworkz.java.CRUDOperation;

public class CRUDOpTester {
	public static void main(String[] args) {
		MobileDTO1 dto = new MobileDTO1();
		dto.setBrandName("realme");
		dto.setColor("Blue");
		dto.setModelName("7pro");
		dto.setPrice(12999.99f);
		dto.setRam((byte) 4);
		dto.setStorage(128);
		dto.setRatings(4.5f);

		MobileDTO1 dto1 = new MobileDTO1();
		dto1.setBrandName("Redmi");
		dto1.setColor("Black");
		dto1.setModelName("Note 5 pro");
		dto1.setPrice(15000);
		dto1.setRam((byte) 6);
		dto1.setStorage(64);
		dto1.setRatings(4.9f);

		// System.out.println(dto +"\n"+dto1); //to print mobileDTO

		FlipkartDAOImpl dao = new FlipkartDAOImpl();
		String sa = dao.add(dto);
	System.out.println("dao"+" "+sa);
		String sa1 = dao.add(dto1);
	System.out.println("dao1"+" "+sa1);
	System.out.println();

		dao.printAll();
		MobileDTO1 access = dao.getBybrandName("Redmi");
		System.out.println(access);
		
		MobileDTO1 acc=dao.deleteByColor("Black");
		System.out.println(acc);
		
		MobileDTO1 delete=dao.updateBybrandName("Redmi","Oppo");
	System.out.println(delete);

	}
}
