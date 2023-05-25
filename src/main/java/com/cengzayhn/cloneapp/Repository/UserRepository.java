package com.cengzayhn.cloneapp.Repository;

import com.cengzayhn.cloneapp.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    Users save(Users user);
    Users findByUserId(String userId);
}
