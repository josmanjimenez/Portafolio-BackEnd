package com.porfolio.backEnd.Services.Interface;

import com.porfolio.backEnd.Model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {


    public List<User> ShowUsers ();
    public Optional<User> ShowUser(Long id);
    public void createUser(User Us);
    public void deleteUser(Long id );
    public Optional<User> findUser(Long id );

}
