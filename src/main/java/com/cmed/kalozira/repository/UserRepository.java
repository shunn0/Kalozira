package com.cmed.kalozira.repository;

import com.cmed.kalozira.entity.CMUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<CMUser, Long> {
    Optional<CMUser> findByUsername(String username);

}
