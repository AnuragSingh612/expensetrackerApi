package com.example.expensetrackerApi.modal;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserModalClass {
    @NotBlank(message="Name should not be empty")
    String name;
    @NotNull(message="Email Should not be Empty")
    @Email(message = "Enter a valid email")
    String email;
    @NotNull(message="Password should not be empty")
    @Size(min=5,message="Password should be atleast 5 character")
    String password;
    Long age=0l;
}
