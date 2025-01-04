package com.ruturaj.restApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruturaj.restApi.modal.LoginModal;
import com.ruturaj.restApi.modal.SignupModal;
import com.ruturaj.restApi.repository.LoginRepository;
import com.ruturaj.restApi.repository.SignupRepository;

@Service
public class SignupService {

    @Autowired
    private SignupRepository signupRepository;

    @Autowired
    private LoginRepository loginRepository;

    public Boolean validateSignup(String username, String password, String email) {
        Optional<SignupModal> existingSignup = signupRepository.findByUsername(username);
        if (existingSignup.isPresent()) {
            return false;
        }
        Optional<SignupModal> existingEmail = signupRepository.findByEmail(email);
        if (existingEmail.isPresent()) {
            return false;
        }
        SignupModal signup = new SignupModal();
        signup.setUsername(username);
        signup.setPassword(password);
        signup.setEmail(email);

        signupRepository.save(signup);

        LoginModal login = new LoginModal();
        login.setUsername(username);
        login.setPassword(password);

        loginRepository.save(login);

        return true;
    }
}
