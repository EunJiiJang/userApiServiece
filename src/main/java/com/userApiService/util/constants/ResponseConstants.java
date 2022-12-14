package com.userApiService.util.constants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseConstants {
    public static final ResponseEntity<Void> OK =
            ResponseEntity.ok().build();

    public static final ResponseEntity<Void> CREATED =
            ResponseEntity.status(HttpStatus.CREATED).build();

    public static final ResponseEntity<Void> BAD_REQUEST =
            ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    public static final ResponseEntity<String> DUPLICATION_EMAIL =
            new ResponseEntity<>("중복된 이메일입니다.", HttpStatus.CONFLICT);

    public static final ResponseEntity<String> DUPLICATION_NICKNAME =
            new ResponseEntity<>("중복된 닉네임입니다.", HttpStatus.CONFLICT);

    public static final ResponseEntity<String> USER_NOT_FOUND =
            new ResponseEntity<>(
                    "가입하지 않은 아이디이거나, 잘못된 비밀번호입니다.", HttpStatus.NOT_FOUND
            );

    public static final ResponseEntity<String> UNAUTHORIZED_USER =
            new ResponseEntity<>(
                    "Unauthenticated user", HttpStatus.UNAUTHORIZED
            );

    public static final ResponseEntity FAIL_TO_CHANGE_NICKNAME =
            new ResponseEntity<>(
                    "닉네임은 7일에 한번만 변경이 가능합니다.", HttpStatus.BAD_REQUEST
            );

    public static final ResponseEntity<String> WRONG_PASSWORD =
            new ResponseEntity<>("비밀번호를 확인해주세요.", HttpStatus.UNAUTHORIZED);


}
