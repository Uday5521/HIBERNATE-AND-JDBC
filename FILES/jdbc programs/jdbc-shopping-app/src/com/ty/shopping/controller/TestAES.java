package com.ty.shopping.controller;

import com.ty.shopping.util.AES;

public class TestAES {
	public static void main(String[] args) {
		
		String secret = "tyapp";
		
		String enc = AES.encrypt("asdf", secret);
		System.out.println("Encrypted data is "+enc);
		
		String dec = AES.decrypt("SHHMPQpP8TCmBZ03/vXvOQ==", secret);
		System.out.println(dec);
		
	}
}
