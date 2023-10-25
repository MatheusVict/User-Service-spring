package io.matheusvictor.user.microservice.service.impl;

import io.matheusvictor.user.microservice.domain.user.User;
import io.matheusvictor.user.microservice.repository.UserRepository;
import io.matheusvictor.user.microservice.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
