package com.Corboncell.AuthAPIService.service;


import com.Corboncell.AuthAPIService.security.user.CustomUserDetails;
import org.springframework.stereotype.Service;

@Service
public interface ITokenService {

    void buildTokenDetails(String token, CustomUserDetails userDetail);
}
