package com.ty.car;

public class TestA {
	public static void main(String[] args) {
		
		String abs = "apple123";
		char[] ch = abs.toCharArray();
		
		String res = "";
		
		for(int i= ch.length-1;i>=0;i--) {
			res = res+ch[i];
		}
		res = res+"123";
		
		System.out.println(res);
		
		
	}
}
