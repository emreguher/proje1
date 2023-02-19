package com.bilgeadam.proje1;

import java.time.LocalDate;

public class Utility {
	
	private static int x;
	
	public static int yasHesapla(int dogumYili) {
		return LocalDate.now().getYear() - dogumYili;
	}

}
