package com.ruturaj.restApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ruturaj.restApi.modal.LoginModal;

public interface LoginRepository extends JpaRepository<LoginModal, Integer> {
    // LoginModal findById(int Id); //it is default
    Optional<LoginModal> findByUsername(String username);

}
