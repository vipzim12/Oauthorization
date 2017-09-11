package com.example.OAuthServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
class PrincipalRestController {

	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public Principal principal(Principal principal) {
		return principal;
	}
}
