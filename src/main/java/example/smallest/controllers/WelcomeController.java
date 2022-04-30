package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@GetMapping(path = "/")
	public @ResponseBody String helloWorld() {
		
		//Flux
		return "Hello world ---------------- Davy"; //"application/json" mean this is a text not a redirect
	}
}
