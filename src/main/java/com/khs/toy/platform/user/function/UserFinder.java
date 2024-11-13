package com.khs.toy.platform.user.function;

import com.khs.toy.platform.user.entity.User;
import com.khs.toy.platform.user.repository.UserQueryRepository;
import com.khs.toy.platform.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserFinder {

    private final UserRepository userRepository;
    private final UserQueryRepository userQueryRepository;

    public Optional<User> findUserByEmail(String email) {
        return userQueryRepository.findUserByEmail(email);
    }


}
