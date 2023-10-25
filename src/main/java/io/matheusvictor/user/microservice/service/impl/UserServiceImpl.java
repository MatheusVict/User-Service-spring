package io.matheusvictor.user.microservice.service.impl;

import io.matheusvictor.user.microservice.domain.user.User;
import io.matheusvictor.user.microservice.producers.UserProducer;
import io.matheusvictor.user.microservice.producers.UserProducerImpl;
import io.matheusvictor.user.microservice.repository.UserRepository;
import io.matheusvictor.user.microservice.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final UserProducer userProducer;

    public UserServiceImpl(UserRepository userRepository, UserProducer userProducerImpl) {
        this.userRepository = userRepository;
        this.userProducer = userProducerImpl;
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        User userSaved = userRepository.save(user);
        userProducer.publishMessageEmail(userSaved);
        return userSaved;
    }
}
