package com.david.service;

import java.util.List;

import com.david.vo.UserVO;

public interface UserService {

	void save(UserVO vo);

	UserVO update(UserVO vo);

	void delete(Integer id);

	List<UserVO> findAll();

	UserVO findById(Integer id);

}
