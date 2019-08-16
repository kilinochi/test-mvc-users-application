package app.controller;

import app.dao.UserDao;
import app.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RequestMapping("/users")
@RestController
public final class UsersController {

    @NotNull
    private final UserDao userdao;

    public UsersController(@NotNull final UserDao userdao) {
        this.userdao = userdao;
    }

    @GetMapping("/")
    public User [] getAll() {
        return userdao.getAll();
    }
}