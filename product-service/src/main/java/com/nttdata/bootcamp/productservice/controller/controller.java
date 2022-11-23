package com.nttdata.bootcamp.productservice.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/*")
public class controller {
	
	/*
	 * @Autowired
		Environment environment

		environment.getProperty("local.server.port")
	 * 
	 */
	
	@Value("${server.port}")
	private String port;

	@RequestMapping(path = "/port", method = RequestMethod.GET)
	public String getPort() {
		return "el puerto del micro es ";
	}
	
}
