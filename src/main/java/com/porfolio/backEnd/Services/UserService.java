package com.porfolio.backEnd.Services;

import com.porfolio.backEnd.Model.User;
import com.porfolio.backEnd.Repository.UserRepository;
import com.porfolio.backEnd.Services.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Autowired
    public UserRepository UserRepo;

    @Override
    public List<User> ShowUsers() {
        return UserRepo.findAll();
    }

    @Override
    public Optional<User> ShowUser(Long id) {
        return UserRepo.findById(id);
    }


    @Override
    public void createUser(User Us) {
        UserRepo.save(Us);
    }

    @Override
    public void deleteUser(Long id) {
        UserRepo.deleteById(id);
    }

    @Override
    public Optional<User> findUser(Long id) {
         return UserRepo.findById(id);
    }
}
