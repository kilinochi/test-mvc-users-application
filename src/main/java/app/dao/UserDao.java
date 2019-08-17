package app.dao;

import app.model.User;
import app.repository.UserRepository;
import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;
import java.util.stream.StreamSupport;

@Component
public class UserDao {

    private final UserRepository userRepository;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User[] getAll() {
        final Iterable <User> users = userRepository.getAllUsers();
        return StreamSupport.stream(users.spliterator(), true).toArray(User[]::new);
    }
}
