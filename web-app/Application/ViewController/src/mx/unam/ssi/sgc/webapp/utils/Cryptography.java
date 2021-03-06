package mx.unam.ssi.sgc.webapp.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cryptography {

    //Ismael Hernandez Millares
    public static String sha1(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] result = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

}
