package com.ruturaj.restApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ruturaj.restApi.modal.SignupModal;

public interface SignupRepository extends JpaRepository<SignupModal, Integer> {
    // SignupModal findById(int Id);
    Optional<SignupModal> findByUsername(String username);

    Optional<SignupModal> findByEmail(String email);
}
