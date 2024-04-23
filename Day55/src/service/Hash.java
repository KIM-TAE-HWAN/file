package service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
	public String getHash(String srcPw) {
						
		String hashPw = null;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.reset();
            md.update(srcPw.getBytes());

            hashPw = String.format("%0128x", new BigInteger(1, md.digest()));
            
        } catch (NoSuchAlgorithmException e) {
           System.out.println("해시 예외 : " + e.getMessage());
        }

        return hashPw;
    }
}
