package lamhd.elk.example.controller;

import org.jboss.logging.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ELKController {

	private static final Logger log = LoggerFactory.getLogger(ELKController.class);

	@GetMapping(value = "/elk")
	public String helloWorld1() {
		MDC.put("url", "/elk");
		MDC.put("username", "admin");
		String message = "[transaction_history] - layer: service - method: POST - input: Version(nameId=1,description=Version Description, modules=[Null]) - output: Create Version Seccess - execution_time: 41 milliseconds - operation: Create Version - status_code: 200";
		log.info(message);
		System.out.println("message: " + message);
		return message;
	}

}
