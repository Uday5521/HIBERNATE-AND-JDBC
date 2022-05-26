package com.ty.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ty.shopping.dto.User;
import com.ty.shopping.util.AES;
import com.ty.shopping.util.ConnectionObject;
import static com.ty.shopping.util.AppConstatnts.SECRETE_KEY;

public class UserDao {
	
	public User validateUser(String email,String password) {
		
		String sql = "SELECT * FROM user WHERE email=? and password = ?";
		Connection connection = ConnectionObject.getConnection();
		try {
			String enc = AES.encrypt(password, SECRETE_KEY);
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, enc);
			
			ResultSet resultSet  = preparedStatement.executeQuery();
			if(resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setEmail(resultSet.getString(3));
				user.setMobile(resultSet.getLong(5));
				return user;
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	
	public int updateUser(int id, User user) {
		return 0;
	}
	public int deleteUserById(int id) {
		return 0;
	}
	
	public List<User> getAllUser() {
		return null;
	}
	
	public User getUserById(int id) {
		return null;
	}
	
	public int saveUser(User user) {
		String sql = "INSERT INTO user VALUES(?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			String enc = AES.encrypt(user.getPassword(), SECRETE_KEY);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, enc);
			preparedStatement.setLong(5,user.getMobile());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
}
