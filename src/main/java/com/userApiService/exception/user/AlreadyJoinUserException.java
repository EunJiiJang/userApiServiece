package com.userApiService.exception.user;

public class AlreadyJoinUserException extends RuntimeException{

    public AlreadyJoinUserException(String message) {
        super(message);
    }
}
