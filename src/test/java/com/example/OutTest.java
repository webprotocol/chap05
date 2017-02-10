package com.example;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class OutTest {

	String url = "http://localhost:8080/out.jsp";
	@Test
	public void test() throws URISyntaxException {
		RestTemplate t = new RestTemplate();
		
//		String html = t.getForObject("http://localhost:8080/out.jsp", String.class);
//		System.out.println(html);
		
//		ResponseEntity<String> response = t.getForEntity(url, String.class);
//
//		response.getHeaders().forEach((n, l)-> {
//			System.out.println(n + ":" + l.get(0));
//		});
		
		new RequestEntity<String>(HttpMethod.GET, new URI(url));
		
		RequestEntity<Void> request = RequestEntity.get(new URI(url)).build();
		
		ResponseEntity<String> response = t.exchange(request, String.class);
		System.out.println(response);
		
		
	}

}
