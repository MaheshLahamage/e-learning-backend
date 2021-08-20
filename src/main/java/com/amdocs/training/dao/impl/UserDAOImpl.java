package com.amdocs.training.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.db.DataSourceUtil;
import com.amdocs.training.model.User;
public class UserDAOImpl implements UserDAO {

	DataSource dataSource = DataSourceUtil.dataSource();
	public boolean saveUser(User user) {
		String query = "insert into user values(?,?,?,?,?,?,?,?)";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUser_id());
			ps.setString(2, user.getName());
			ps.setLong(3, user.getPhone_no());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getReg_date());
			ps.setString(7, user.getPassword());
			ps.setString(8, user.getUpload_photo());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public User getUserById(int id) {

		User user = new User();
		String query = "select * from user where user_id= ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user.setUser_id(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPhone_no(rs.getLong(3));
				user.setEmail(rs.getString(4));
				user.setAddress(rs.getString(5));
				user.setReg_date(rs.getString(6));
				user.setPassword(rs.getString(7));
				user.setUpload_photo(rs.getString(8));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<User> findAll() {
		User user = new User();
		List<User> list = new ArrayList<User>();
		String sql = "select * from user";
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				user.setUser_id(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPhone_no(rs.getLong(3));
				user.setEmail(rs.getString(4));
				user.setAddress(rs.getString(5));
				user.setReg_date(rs.getString(6));
				user.setPassword(rs.getString(7));
				user.setUpload_photo(rs.getString(8));
				list.add(user);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean deleteUser(int id) {

		String query = "delete from user where user_id= ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			int rs = ps.executeUpdate();
			System.out.println(rs);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean updateUser(String s) {
		return false;
	}
}
