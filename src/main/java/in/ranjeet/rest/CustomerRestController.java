package in.ranjeet.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ranjeet.binding.Customer;

@RestController
public class CustomerRestController {

	@GetMapping(value = "/customer", produces = { "application/xml", "application/json" }// this is get Method can
																						// produce the response in
																						// the XML format are Json
																						// format.
	)
	// client take the customer data in the xml format and client can take the data
	// in the Json format.
	public Customer getCustomer() {

		Customer c = new Customer();
		c.setName("Jhon");
		c.setEmail("jhon@gmail.com");
		c.setGender("Male");

		return c; // return Customer Object
	}

	@PostMapping(value = "/customer", consumes = { "application/xml", "application/json" }, // client can send the data
																							// in two formate json/xml
			produces = { "text/plain" })
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		// logic to insert customer in db
		return new ResponseEntity<>("Customer Saved", HttpStatus.CREATED);
	}

}
