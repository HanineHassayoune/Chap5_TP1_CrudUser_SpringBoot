package edu.polytech.chap5_tp1;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer>{


    @Query("from User u where u.email=:givenEmail")
    public List<User>findAllByEmail(String givenEmail);

    public List<User> findUserByName(String name);

    public List<User> findUserByNameAndEmail(String name, String email);
}
