package com.example.expensetrackerApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="tbl_users")
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="name")
        @NotBlank(message = "Name must not be null")
        private String name;
        @Column(unique = true)
        private String email;
        @Column(name="age")
        private long age;
        @JsonIgnore
        private String password;
        @Column(name="date")
        private Date date;

}
