package com.example.expensetrackerApi.Service;

import com.example.expensetrackerApi.Entity.Expense;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface expenseService {
    List<Expense> getAllExpenses(Expense expense);
    Expense ExpensesById(Long user);
    public void DeleteExpenseById(Long user);
    public Expense SaveExpenseDetails(Expense expense);
    public Expense updateExpenseDetails(Expense expense, Long id);

}
