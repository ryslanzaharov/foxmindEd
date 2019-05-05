package com.example.blockchain.utils;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;

public class TextToByte {

    public static byte[] toBytes(String text) {
        return text.getBytes();
    }

    public static String toHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static byte[] fromHex(String text) {
         return DatatypeConverter.parseHexBinary(text);

    }

    public static String toString(byte[] bytes) throws UnsupportedEncodingException {
        String str = new String(bytes, "UTF-8");
        return str;
    }

}
