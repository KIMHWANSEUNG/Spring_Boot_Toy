package com.khs.toy.platform.user.service;

import com.khs.toy.platform.user.dto.response.GetUserInfoResponse;
import com.khs.toy.platform.user.entity.User;
import com.khs.toy.platform.user.function.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetUserService {

    private final UserFinder userFinder;

    public GetUserInfoResponse getUserInfo(String email) {
        Optional<User> user = userFinder.findUserByEmail(email);

        return user.map(GetUserInfoResponse::new).orElse(null);

    }
}
