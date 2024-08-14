package io.pn.masterservice.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pn.masterservice.dto.LoginUserDetails;
import io.pn.masterservice.dto.UserToken;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	
	@GetMapping(value = "/get-token",consumes = "application/json", produces = "application/json")
	public ResponseEntity<UserToken> getToken(@RequestBody LoginUserDetails userDetails){
		UserToken userToken = new UserToken(userDetails.username(), "kdl;sfa8i3fakld90i3oj");
		return new ResponseEntity<UserToken>(userToken,HttpStatusCode.valueOf(200));
	}
	
	@GetMapping(value = "/check")
	public String checkController() {
		return "Working fine";
	}
}
