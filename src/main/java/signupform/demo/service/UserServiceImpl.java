package signupform.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import signupform.demo.entity.User;
import signupform.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public void saveUser(User user) {
        repository.save(user);
        System.out.println("User Saved Successfully");
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
    }
}
