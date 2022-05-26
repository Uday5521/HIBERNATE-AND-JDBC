package com.ty.shopping.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ty.shopping.util.ConnectionObject;

public class TestFileHandlingRead {
	public static void main(String[] args) throws Exception {
		
		Connection connection = ConnectionObject.getConnection();
		
		String sql = "INSERT INTO my_file VALUES(?,?,?)";
		InputStream inputStream = new FileInputStream(new File("qsp.png"));
		
		PreparedStatement pstmt = connection.prepareStatement("select * from my_file");
		ResultSet rs = pstmt.executeQuery();
		while( rs.next() ) {
		    Blob blob = rs.getBlob(2);
		    System.out.println("Read "+ blob.length() + " bytes ");
		    byte [] array = blob.getBytes( 1, ( int ) blob.length() );
		    File file = new File("my.png");//File.createTempFile("something-", ".binary", new File("."));
		    FileOutputStream out = new FileOutputStream( file );
		    out.write( array );
		    out.close();
		}
		
//		PreparedStatement preparedStatement = connection.prepareStatement(sql);
//		preparedStatement.setInt(1, 1);
//		preparedStatement.setBlob(2, inputStream);
//		preparedStatement.setString(3, "demo");
//		
//		preparedStatement.execute();
		System.out.println("Done");
	}
}
