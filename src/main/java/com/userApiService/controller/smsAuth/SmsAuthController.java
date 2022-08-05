package com.userApiService.controller.smsAuth;

import static com.userApiService.util.constants.ResponseConstants.CREATED;
import com.userApiService.dto.smsAuth.SmsAuthDto.SmsAuthRequset;
import com.userApiService.service.smsAuth.SmsAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/api/auth")
@RestController
public class SmsAuthController {
    private final SmsAuthService smsAuthService;

    @PostMapping("/sms-auth/send")
    public ResponseEntity<Void> requestSmsAuth(@Valid @RequestBody SmsAuthRequset smsAuthRequset){
        smsAuthService.issueSmsAuthNum(smsAuthRequset);
        return CREATED;
    }
}
