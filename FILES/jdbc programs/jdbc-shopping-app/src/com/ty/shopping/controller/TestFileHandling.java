package com.ty.shopping.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ty.shopping.util.ConnectionObject;

public class TestFileHandling {
	public static void main(String[] args) throws Exception {
		
		Connection connection = ConnectionObject.getConnection();
		
		String sql = "INSERT INTO my_file VALUES(?,?,?)";
		InputStream inputStream = new FileInputStream(new File("qsp.png"));
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, 1);
		preparedStatement.setBlob(2, inputStream);
		preparedStatement.setString(3, "demo");
		
		preparedStatement.execute();
		System.out.println("Done");
	}
}
