package service;

import model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> login(String email,String password);
    void register(String email,String password);
}
