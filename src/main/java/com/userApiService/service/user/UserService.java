package com.userApiService.service.user;

import com.userApiService.domain.user.User;
import com.userApiService.exception.user.UserNotFoundException;
import com.userApiService.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public boolean checkUserExist(String phone){
        return userRepository.existsByPhone(phone);
    }

}
