package com.example.theater.shared;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class Utils {
    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String generateIdRegizor(int length) {
        return generateRandomString(length);
    }
    public String generateIdPiesa(int length) {
        return generateRandomString(length);
    }
    public String generateIdCont(int length) {
        return generateRandomString(length);
    }

    public String generateIdPremiu(int length) {
        return generateRandomString(length);
    }

    public String generateIdActor(int length) {
        return generateRandomString(length);
    }

    public String generateIdRecenzie(int length) {
        return generateRandomString(length);
    }

    public String generateRandomString(int length) {
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }
}
