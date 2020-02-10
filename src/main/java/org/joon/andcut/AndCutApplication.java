package org.joon.andcut;

import com.example.depcon1.Glitch;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AndCutApplication {

  @Autowired
  private Glitch g;

  public static void main(String[] args) {
    SpringApplication.run(AndCutApplication.class, args);
  }

  @GetMapping
  public Map<String, String> startPage() {

    final Map<String, String> map = new HashMap<>();
    map.put("greeting", "Hello world!");
    map.put("identity", g.identify("me"));

    return map;
  }
}
