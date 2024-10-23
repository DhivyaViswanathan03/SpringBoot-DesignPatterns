package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.enumpackage.EncryptPatternEnum;
import in.ineuron.factory.StrategyFactory;

@RestController
public class DemoController {
	
	@Autowired
	StrategyFactory factory;
	
	@GetMapping("/encrypt")
	public void encrytWithEncoder(@RequestParam EncryptPatternEnum encryptPatternEnum) {
		factory.findEncryptionType(encryptPatternEnum).encrypt("spring boot program");
	}

}
