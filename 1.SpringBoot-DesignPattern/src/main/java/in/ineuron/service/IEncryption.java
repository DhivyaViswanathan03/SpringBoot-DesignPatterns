package in.ineuron.service;

import in.ineuron.enumpackage.EncryptPatternEnum;

public interface IEncryption {
	void encrypt(String toBeEncrypted);
	public EncryptPatternEnum getEncryptionType();

}
