package in.ineuron.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.tomcat.util.net.openssl.ciphers.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.enumpackage.EncryptPatternEnum;
import in.ineuron.service.IEncryption;

@Component
public class StrategyFactory {
	Map<EncryptPatternEnum,IEncryption> map;
	
//	@Autowired
	public StrategyFactory(Set<IEncryption> encryptionTypeSet){
		map=new HashMap<EncryptPatternEnum, IEncryption>();
		encryptionTypeSet.stream()
		.forEach(encryptionType->map.put(encryptionType.getEncryptionType(), encryptionType));
		
	}

	public IEncryption findEncryptionType(EncryptPatternEnum patternEnum) {
		return map.get(patternEnum);
		
	}
}
