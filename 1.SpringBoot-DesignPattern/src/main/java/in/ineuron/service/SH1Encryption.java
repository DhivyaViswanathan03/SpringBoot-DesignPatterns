package in.ineuron.service;

import org.springframework.stereotype.Service;

import in.ineuron.enumpackage.EncryptPatternEnum;

@Service
public class SH1Encryption implements IEncryption {

	@Override
	public void encrypt(String toBeEncrypted) {
		System.out.println("SH1Encryption.encrypt()");

	}

	@Override
	public EncryptPatternEnum getEncryptionType() {
		return EncryptPatternEnum.SH1;
	}

}
