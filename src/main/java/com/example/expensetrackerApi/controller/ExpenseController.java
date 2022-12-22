package com.example.expensetrackerApi.controller;

import com.example.expensetrackerApi.Entity.Expense;
import com.example.expensetrackerApi.Service.expenseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    private expenseService expenseService;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(Expense expense) {
        return expenseService.getAllExpenses(expense);
    }

    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable Long id){
        return expenseService.ExpensesById(id);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping("/expenses")
    public void deleteExpenseById(@RequestParam Long id) {
        expenseService.DeleteExpenseById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/expenses")
    public Expense saveExpenseDetails(@Valid @RequestBody Expense expense) {
        return expenseService.SaveExpenseDetails(expense);
    }
}
