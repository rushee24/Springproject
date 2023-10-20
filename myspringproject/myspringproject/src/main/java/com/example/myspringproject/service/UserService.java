
 package com.example.myspringproject.service;
 import java.util.List;
 import com.example.myspringproject.model.User;
public interface UserService {
    public User addUser(User user);

    User getUserById(Long id);
    List<User> getAllUsers();
   


}
