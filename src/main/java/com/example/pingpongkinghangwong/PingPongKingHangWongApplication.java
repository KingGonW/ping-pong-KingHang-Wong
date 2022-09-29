package com.example.pingpongkinghangwong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PingPongKingHangWongApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingPongKingHangWongApplication.class, args);
	}
	@GetMapping("/ping")
	public String PingPong(){
		return "pong";
	}

}
