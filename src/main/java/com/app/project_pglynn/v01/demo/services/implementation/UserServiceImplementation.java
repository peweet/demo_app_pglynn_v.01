package com.app.project_pglynn.v01.demo.services.implementation;

import com.app.project_pglynn.v01.demo.models.User;
import com.app.project_pglynn.v01.demo.repositories.UserRepository;
import com.app.project_pglynn.v01.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

import static java.util.Collections.emptyList;
@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        return (Set<User>) userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return null; //userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
         userRepository.delete(user);
    }
/*   @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(user.getUsername(), user.getPassword());
    }

 */
}
