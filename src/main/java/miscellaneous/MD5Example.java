package miscellaneous;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Example {

    public static String md5Encode(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String hash = MD5Example.md5Encode("hello world");
        System.out.println(hash);

        String hash2 = MD5Example.md5Encode("test message");
        System.out.println(hash2);
    }
}
