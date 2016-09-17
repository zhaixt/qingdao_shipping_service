package com.controllter;


import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
    private UserService userService;

    @RequestMapping("/phoneNum/{phoneNum}")
    List<User> findById(@PathVariable String phoneNum) {
        return userService.findUserByPhoneNum(phoneNum);
    }
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    Integer saveUser(@RequestBody final User user) {
      return userService.saveUser(user);
    }
}
