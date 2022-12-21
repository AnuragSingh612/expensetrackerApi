package com.example.expensetrackerApi.Service;

import com.example.expensetrackerApi.Entity.User;
import com.example.expensetrackerApi.modal.UserModalClass;

public interface userService {
    User createuser(UserModalClass user);
    User read(Long id);
}
