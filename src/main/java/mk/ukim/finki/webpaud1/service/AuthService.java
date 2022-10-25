package mk.ukim.finki.webpaud1.service;

import mk.ukim.finki.webpaud1.model.User;

public interface AuthService {

    User login(String username, String password);
    User register(String username,String password,String repeatPassword,String name, String surname);

}
