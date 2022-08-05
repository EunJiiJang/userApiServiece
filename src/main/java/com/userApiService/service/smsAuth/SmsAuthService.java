package com.userApiService.service.smsAuth;
import static com.userApiService.util.auth.RandomNumber.makeRandomNumber;

import com.userApiService.dto.smsAuth.SmsAuthDto.SmsAuthRequset;
import com.userApiService.repository.smsAuth.SmsAuthRepository;
import com.userApiService.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Slf4j
@RequiredArgsConstructor
@Service
public class SmsAuthService {
    private final HttpSession session;
    private final int LIMIT_TIME = 3 * 60;
    private final SmsAuthRepository smsAuthRepository;
    private final UserService userService;

    @Transactional
    public void issueSmsAuthNum(SmsAuthRequset saveRequest){
        boolean userExist = userService.checkUserExist(saveRequest.getPhone());
        if(userExist == true){
        }

        int randomNumber = makeRandomNumber();
        session.setAttribute(saveRequest.getPhone(),randomNumber);
        session.setMaxInactiveInterval(LIMIT_TIME);
        saveRequest.toEntitiy(saveRequest.getPhone(),randomNumber);
        smsAuthRepository.save(saveRequest.toEntitiy(saveRequest.getPhone(),randomNumber));
        log.info("issue smsAuthNum : {}:{}",saveRequest.getPhone(),randomNumber);
    }




}
