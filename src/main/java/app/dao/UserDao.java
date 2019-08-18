package app.dao;

import app.model.User;
import app.repository.UserRepository;
import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDao {

    private final UserRepository userRepository;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User[] getAll() {
        return userRepository.findAllUsers().toArray(new User[0]);
    }
}
