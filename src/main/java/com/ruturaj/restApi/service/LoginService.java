package com.ruturaj.restApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruturaj.restApi.modal.LoginModal;
import com.ruturaj.restApi.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Boolean validateLogin(String username, String password) {
        Optional<LoginModal> login = loginRepository.findByUsername(username);
        if (login.isPresent()) {
            return login.get().getPassword().equals(password);
        }
        return false;
    }
}
