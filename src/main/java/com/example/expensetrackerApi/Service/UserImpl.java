package com.example.expensetrackerApi.Service;

import com.example.expensetrackerApi.Entity.User;
import com.example.expensetrackerApi.modal.UserModalClass;
import com.example.expensetrackerApi.repository.UserReopsitory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements userService{
    @Autowired
    private UserReopsitory urepo;
    @Override
    public User createuser(UserModalClass user) {
        User user2= new User();
        BeanUtils.copyProperties(user,user2);
        return urepo.save(user2);
    }

    @Override
    public User read(Long id) {
        return urepo.findById(id).orElseThrow(()-> new ExpressionException("User does not exists"));
    }
}
