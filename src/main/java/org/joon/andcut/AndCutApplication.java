package org.joon.andcut;

import java.util.Collections;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AndCutApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndCutApplication.class, args);
	}

	@GetMapping
	public Map<String,String> startPage() {

		return Collections.singletonMap("Hello", "world");
	}

}
