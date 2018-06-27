package Challenges.javaMD5;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        inputString = scanner.nextLine();
        String result;


        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(inputString.getBytes());
        byte[] byteData = messageDigest.digest();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        result = sb.toString();
        System.out.println(result);
    }
}
