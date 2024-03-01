package com.tcs.service.resourse;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class SleuthService {
	
	 private static final  Logger logger = LoggerFactory.getLogger(SleuthService.class);
		@GetMapping("/data")
		public String sendResponse() {
			logger.info("In service : ");
			return "from service";
		}

}
