package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class GreetRestController {

	@GetMapping
	public String getGreetMsg() {
		String msg = "Good Morning....!!";
		return msg;
	
	}
	@GetMapping("/Wish")
	public String getWishMsg() {
		String msg="ALL THE BEST....!!";
		return msg;
	}
	@GetMapping("/Quote")
	public String getQuote() {
		String msg="Do and Die ....!!";
		return msg ;
	}

}
