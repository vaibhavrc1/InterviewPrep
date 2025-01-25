package java8features.base64encode;

import java.util.Base64;

public class EncodeDecodeDemo {
    public static void main(String[] args) {
        String str = "hello world!";
        byte[] encodedBytes = Base64.getEncoder().encode(str.getBytes());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);

        System.out.println("Encoded msg: "+new String(encodedBytes));
        System.out.println("Decoded msg: "+new String(decodedBytes));
    }
}
