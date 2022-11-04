package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WelcomeRestController {

	/*@GetMapping("/Welcome")
	public String getMsg() {
		String msg = "Welcome to Ashok IT...!!";
		return msg;*/
	
		@GetMapping("/Welcome")
		public ResponseEntity<String> getWelcomeMsg() {
			String msg = "Welcome to Ashok IT...!!";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		}

	}

