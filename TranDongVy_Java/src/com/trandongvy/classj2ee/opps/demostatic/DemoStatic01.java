package com.trandongvy.classj2ee.opps.demostatic;

public class DemoStatic01 {
	private String sName;
	private String sAddress;
	
	private static String sNameOfUniver = "IMIC";//static chỉ chiếm 1 vùng nhớ duy nhất
	private int countnostatic = 0;
	private static int countstatic = 0;
	
	public DemoStatic01() {
		countnostatic++;
		countstatic++;
	}

	public DemoStatic01(String sName, String sAddress) {
		
		this.sName = sName;
		this.sAddress = sAddress;
	}
	
	public static void main(String[] args) {
		System.out.println("không có static");
		DemoStatic01 sv1 = new DemoStatic01();
		System.out.println(sv1.countnostatic);
		DemoStatic01 sv2 = new DemoStatic01();
		System.out.println(sv2.countnostatic);
		System.out.println("===================================");
		System.out.println("có static");
		DemoStatic01 sv3 = new DemoStatic01();
		System.out.println(sv3.countstatic);
		DemoStatic01 sv4 = new DemoStatic01();
		System.out.println(sv4.countstatic);
		
	}

}
