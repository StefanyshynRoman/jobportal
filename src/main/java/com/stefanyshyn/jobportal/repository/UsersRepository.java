package com.stefanyshyn.jobportal.repository;

import com.stefanyshyn.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
