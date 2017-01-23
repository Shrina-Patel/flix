package io.egen.flix_projectt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.egen.flix_projectt.entity.User;
import io.egen.flix_projectt.service.UserService;


@RestController
@RequestMapping(value="User")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.POST)
	public User create(@RequestBody User user){
		return userService.create(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="{id}")
	public User update(@PathVariable("id") String uId, @RequestBody User user){
		return userService.update(uId,user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="{id}")
	public void delete(@PathVariable("id") String uId){
		userService.delete(uId);
	}

}
