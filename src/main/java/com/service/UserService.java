package com.service;


import com.model.User;

import java.util.List;

public interface UserService {
	public List<User> findUserByPhoneNum(String phoneNum);
	public Integer saveUser(User user);//返回个数
}
