package in.ranjeet.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // responsible handle req and res
public class MsgRestController {
	
	public MsgRestController() {
		System.out.println("MsgRestController::Constructor");
	}
	//whenever we are binding the methods to the URL pattern every method should have unique URL pattern 
	@GetMapping("/welcome") // responsible  send msg to client
	public ResponseEntity<String> getWelcomeMsg(){ //taking the ResponseEntity is optional 
		String msg = "Welcome To Ashok IT";
		return new ResponseEntity<>(msg,HttpStatus.OK); //ok means 200 status
	}
	
	//ResponseEntity is a class which is used to set response body and response status code to the client 
	
	//I want to bind this method to get request that's why I am using get mapping 
	@GetMapping("/greet") //this method is binded to a get request 
	public String getGreetMsg() {
		String msg = "Good Evening..!!";
		return msg;
	}

}
