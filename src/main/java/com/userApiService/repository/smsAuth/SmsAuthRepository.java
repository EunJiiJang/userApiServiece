package com.userApiService.repository.smsAuth;

import com.userApiService.domain.smsAuth.SmsAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsAuthRepository extends JpaRepository<SmsAuth,Long> {


}
