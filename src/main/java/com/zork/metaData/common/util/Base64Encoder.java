package com.zork.metaData.common.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Encoder {
    /**
     * base64加密
     *
     * @param str
     * @return
     */
    public static String encrypt(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * base64解密
     *
     * @param str
     * @return
     */
    public static String decrypt(String str) {
        return new String(Base64.getDecoder().decode(str), StandardCharsets.UTF_8);
    }

}
