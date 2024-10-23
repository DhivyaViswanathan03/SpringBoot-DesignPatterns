package in.ineuron.service;

import org.springframework.stereotype.Service;

import in.ineuron.enumpackage.EncryptPatternEnum;

@Service
public class BD5Encryption implements IEncryption {

	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("BD5Encryption.encrypt()");

	}

	@Override
	public EncryptPatternEnum getEncryptionType() {
		return EncryptPatternEnum.BD5;
	}

}
