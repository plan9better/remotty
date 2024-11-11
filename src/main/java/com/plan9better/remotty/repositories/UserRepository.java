package com.plan9better.remotty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plan9better.remotty.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}