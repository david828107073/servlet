package com.david.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.david.connection.ConnectionConfig;
import com.david.vo.UserVO;

public class UserServiceImpl implements UserService {
	private static final String SELECT_ALL = "SELECT * FROM USER";
	private static final String INSERT = "INSERT INTO USER (NAME,AGE,PHONE) VALUE(?,?,?)";

	@Override
	public void save(UserVO vo) {
		Connection con = null;
		PreparedStatement stat = null;
		try {
			con = ConnectionConfig.getConnection();
			stat = con.prepareStatement(INSERT);
			stat.setString(1, vo.getName());
			stat.setInt(2, vo.getAge());
			stat.setString(3, vo.getPhone());
			stat.execute();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public UserVO update(UserVO vo) {
		return null;
	}

	@Override
	public void delete(Integer id) {

	}

	@Override
	public List<UserVO> findAll() {
		Connection con = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		List<UserVO> users = new ArrayList<>();
		try {
			con = ConnectionConfig.getConnection();
			stat = con.prepareStatement(SELECT_ALL);
			rs = stat.executeQuery();
			while (rs.next()) {
				UserVO vo = new UserVO();
				vo.setId(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setPhone(rs.getString(4));
				users.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;
	}

	public static void main(String[] args) {
	}

	@Override
	public UserVO findById(Integer id) {
		return null;
	}

}
