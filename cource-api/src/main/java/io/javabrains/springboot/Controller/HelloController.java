package io.javabrains.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
public class HelloController {
	
	@GetMapping(value="/hello")
	public String sayHi(){
		return "Hi";
	}

}
*/

@RestController
public class HelloController {
	/*@GetMapping(value="/welcome")*/
	@RequestMapping("/hello")
	public String SAYHELLO() {
		
		return "hello !!!!!!!!!!!";
	}

}