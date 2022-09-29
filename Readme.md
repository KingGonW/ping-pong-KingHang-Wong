## Creat a Java Spring boot project

This project is aiming to return String "pong" when open "localhost:8080/ping"

1. Clone or Download this GitHub repositories to your local machine
2. This project used JDK 18 Oracle OpenJDK and Java
3. Go to [file](src/main/java/com/example/pingpongkinghangwong/PingPongKingHangWongApplication.java) and run the Application
4. Click this website http://localhost:8080/ping
5. The website should display **pong** as a result

## Code 

```java
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
