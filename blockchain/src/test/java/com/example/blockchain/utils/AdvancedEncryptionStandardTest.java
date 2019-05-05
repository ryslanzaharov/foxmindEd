package com.example.blockchain.utils;

import org.junit.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.login.LoginException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AdvancedEncryptionStandardTest {

    String text = "Hello, this is test.Привіт, це тест.嗨，這是一個測試";

    byte[] byteArray = new byte[] {9, 44, -27, -83, -86, -37, -31, 5, 16, 100, -75, 35, 67, -62, 10};

    @Test
    public void encryptBytesAndDecript() throws LoginException, NoSuchAlgorithmException,
            NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        System.out.println("Byte array " + Arrays.toString(byteArray));

        byte[] encryptedBytes = AdvancedEncryptionStandard.encrypt(key, initVector, byteArray);

        System.out.println("Encrypted: " + Arrays.toString(encryptedBytes));

        byte[] decryptedBytes = AdvancedEncryptionStandard.decrypt(key, initVector, encryptedBytes);

        System.out.println("Decrypted: " + Arrays.toString(decryptedBytes));

        assertArrayEquals(decryptedBytes, byteArray);

    }


    @Test
    public void encryptStringAndDecript() throws LoginException, NoSuchAlgorithmException,
            NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException , UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        System.out.println("Text " + text);

        String encryptedText = AdvancedEncryptionStandard.encrypt(key,initVector, text);

        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = AdvancedEncryptionStandard.decrypt(key,initVector, encryptedText);

        System.out.println("Decrypted: " + decryptedText);

        assertEquals(decryptedText, text);

    }

}