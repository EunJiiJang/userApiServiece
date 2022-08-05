package com.userApiService.dto.smsAuth;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.userApiService.domain.smsAuth.SmsAuth;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class SmsAuthDto {

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SmsAuthRequset {
        @NotBlank(message = "휴대폰 번호를 입력해주세요.")
        @Pattern(regexp = "(01[016789])(\\d{3,4})(\\d{4})", message = "올바른 휴대폰 번호를 입력해주세요.")
        private String Phone;
        private int authNum;
        private LocalDateTime issueTime;
        private LocalDateTime expireTime;

        public SmsAuth toEntitiy(String phone, int authNum) {
            return SmsAuth.builder()
                    .phone(phone)
                    .authNum(authNum)
                    .issueTime(LocalDateTime.parse(LocalDateTime.now().toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                    .expireTime(LocalDateTime.parse(LocalDateTime.now().plusMinutes(3).toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                    .build();


        }
    }
}
