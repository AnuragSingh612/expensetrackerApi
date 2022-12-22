package com.example.expensetrackerApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="tbl_expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="expense_name")
    @NotBlank(message = "Expense name must not be null")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="expense_amount")
    private BigDecimal amount;
    @Column(name="category")
    private String category;
    @Column(name="date")
    private Date date;
    @ManyToOne(fetch =FetchType.LAZY, optional=false)
    @JoinColumn(name = "user_id")
    @OnDelete(action= OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;
}
