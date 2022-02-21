package com.gourianova.binocularvision;

import com.gourianova.binocularvision.model.User;
import com.gourianova.binocularvision.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("views/jsp/registration2")
public class CreateServlet extends HttpServlet {
    private static final AtomicLong counter = new AtomicLong();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
 
    getServletContext().getRequestDispatcher("views/jsp/user_register.jsp").forward(request, response);
 //}
     
    //protected void doPost(HttpServletRequest request, HttpServletResponse response)
  //      throws ServletException, IOException {

        String s;
      //  User user= new User();
        try {
            String name = request.getParameter("first_name");
            //user.setFirstName()
            String surname = request.getParameter("last_name");
            String login=request.getParameter("login");
            String password=request.getParameter("password");

            BigDecimal balance = BigDecimal.valueOf(Integer.parseInt(request.getParameter("balance")));


           User user= new User(  balance, LocalDate.now(),name,surname,login,password,3,(counter.incrementAndGet())+1);
      new UserRepo() {
          @Override
          public List<User> findAll() {
              return null;
          }

          @Override
          public List<User> findAll(Sort sort) {
              return null;
          }

          @Override
          public Page<User> findAll(Pageable pageable) {
              return null;
          }

          @Override
          public List<User> findAllById(Iterable<Integer> iterable) {
              return null;
          }

          @Override
          public long count() {
              return 0;
          }

          @Override
          public void deleteById(Integer integer) {

          }

          @Override
          public void delete(User user) {

          }

          @Override
          public void deleteAllById(Iterable<? extends Integer> iterable) {

          }

          @Override
          public void deleteAll(Iterable<? extends User> iterable) {

          }

          @Override
          public void deleteAll() {

          }

          @Override
          public <S extends User> S save(S s) {
              return null;
          }

          @Override
          public <S extends User> List<S> saveAll(Iterable<S> iterable) {
              return null;
          }

          @Override
          public Optional<User> findById(Integer integer) {
              return Optional.empty();
          }

          @Override
          public boolean existsById(Integer integer) {
              return false;
          }

          @Override
          public void flush() {

          }

          @Override
          public <S extends User> S saveAndFlush(S s) {
              return null;
          }

          @Override
          public <S extends User> List<S> saveAllAndFlush(Iterable<S> iterable) {
              return null;
          }

          @Override
          public void deleteAllInBatch(Iterable<User> iterable) {

          }

          @Override
          public void deleteAllByIdInBatch(Iterable<Integer> iterable) {

          }

          @Override
          public void deleteAllInBatch() {

          }

          @Override
          public User getOne(Integer integer) {
              return null;
          }

          @Override
          public User getById(Integer integer) {
              return null;
          }

          @Override
          public <S extends User> Optional<S> findOne(Example<S> example) {
              return Optional.empty();
          }

          @Override
          public <S extends User> List<S> findAll(Example<S> example) {
              return null;
          }

          @Override
          public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
              return null;
          }

          @Override
          public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
              return null;
          }

          @Override
          public <S extends User> long count(Example<S> example) {
              return 0;
          }

          @Override
          public <S extends User> boolean exists(Example<S> example) {
              return false;
          }

          @Override
          public void deleteUserById(Integer id) {

          }

          @Override
          public Optional<User> findUserById(Integer id) {
              return Optional.empty();
          }

          @Override
          public Optional<User> findUserByLogin(String login) {
              return Optional.empty();
          }
      }.save(user);
          //  userRepo.save(user);
           //  @Bean
            //	CommandLineRunner commandLineRunner(UserRepo userRepo){

             // new  UserRepo.save(user);
           // }
            System.out.println("user2"+user);
            response.sendRedirect(request.getContextPath()+"/index");

        }
        catch(Exception ex) {
             
            getServletContext().getRequestDispatcher("views/jsp/user_register.jsp").forward(request, response);
        }
    }
}