package com.app.project_pglynn.v01.demo.services.jpa;



import com.app.project_pglynn.v01.demo.models.User;
import com.app.project_pglynn.v01.demo.repositories.UserRepository;
import com.app.project_pglynn.v01.demo.services.UserService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class UserServiceJpa extends AbstractJpaService<User, UserRepository> implements UserService {

    public UserServiceJpa(UserRepository repository) {
        super(repository);
    }

    //@Override
    public User findByLastName(String lastName) {
//param should be changed to userName, it is currently last name.
        return repository.findByUserName(lastName);
    }



//    @Override
    //  public User findById(ID id) {
    // return repository.findById(id);
    // }

    // @Override
    //   public void deleteById(ID id) {
    //   repository.deleteById(id);
    // }
}