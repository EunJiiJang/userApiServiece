package com.userApiService.util.auth;

import java.util.Random;

public class RandomNumber {
    public static final int makeRandomNumber(){
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
}
