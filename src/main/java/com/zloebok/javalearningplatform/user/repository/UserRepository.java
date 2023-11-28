package com.zloebok.javalearningplatform.user.repository;

import com.zloebok.javalearningplatform.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    public Optional<UserEntity> findByUsername(String username);

}
