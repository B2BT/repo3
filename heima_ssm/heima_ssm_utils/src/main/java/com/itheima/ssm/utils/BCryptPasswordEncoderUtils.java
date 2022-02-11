package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    public static String encodePasswd(String passwd){
        return bCryptPasswordEncoder.encode(passwd);
    }


    public static void main(String[] args) {
        String ps = "123";
        System.out.println(encodePasswd(ps));
        //$2a$10$aXeXU5unTOYyR7.BHZaut.rCODPj5Es/FW/It3G8ilw1FpZNg1Nfy
        //$2a$10$yhNxX01jHsX5h.K2K0MgduSKhuhFPso.hJfZPn4/bxV.vVocO5RpS
    }

}

