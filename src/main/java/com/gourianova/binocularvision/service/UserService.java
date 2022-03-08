package com.gourianova.binocularvision.service;

import com.gourianova.binocularvision.exception.UserNotFoundException;
import com.gourianova.binocularvision.model.User;
//import com.gourianova.binocularvision.registration.token.ConfirmationToken;
// import com.gourianova.binocularvision.registration.token.ConfirmationTokenService;
import com.gourianova.binocularvision.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserService {
    private final UserRepo userRepo;
    private final static String USER_NOT_FOUND_MSG =
            "user with login(email) %s not found";
    private final   BCryptPasswordEncoder bCryptPasswordEncoder;
   // private final ConfirmationTokenService confirmationTokenService;


    @Autowired
    public <bCryptPasswordEncoder> UserService(UserRepo userRepo){
                                             // BCryptPasswordEncoder fbCryptPasswordEncoder,
                                               //ConfirmationTokenService confirmationTokenService){
        this.userRepo=userRepo;
       this.bCryptPasswordEncoder = null;
        //this.confirmationTokenService = confirmationTokenService;
    }
    public User addUser(User user){

         return userRepo.save(user);
    }
    public List<User> findAllUsers(){
        return userRepo.findAll();
    }
    public User updateUser(User user){
        return userRepo.save(user);
    }
    public User findUserById(Integer id){
        return userRepo.findUserById(id).
                orElseThrow(()-> new UserNotFoundException("User by id" + id + "not found"));

    }

    public void deleteUser(Integer id){
        userRepo.deleteUserById(id);
    }
    public String signUpUser(User user) {
        boolean userExists = userRepo
                .findUserByLogin(user.getLogin())
                .isPresent();

        if (userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("email already taken");
        }

        String encodedPassword = bCryptPasswordEncoder
                .encode(user.getPassword());

        user.setPassword(encodedPassword);

        userRepo.save(user);

        String token = UUID.randomUUID().toString();

        /*ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
               user
        );

        confirmationTokenService.saveConfirmationToken(
                confirmationToken);
*/
//        TODO: SEND EMAIL

        return token;
    }
    public int enableAppUser(String email) {
       // return userRepo.enableUser(email);
        return 1;
    }
}
  /*
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND_MSG, email)));
    }



   */
//}
