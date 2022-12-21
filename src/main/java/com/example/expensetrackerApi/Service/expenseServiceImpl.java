package com.example.expensetrackerApi.Service;

import com.example.expensetrackerApi.Entity.Expense;
import com.example.expensetrackerApi.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class expenseServiceImpl implements expenseService{
    @Autowired
    private ExpenseRepository expenseRepository;
    @Override
    public List<Expense> getAllExpenses(Expense expense) {
        return expenseRepository.findAll();
    }

    public Expense ExpensesById(Long user)
    {
        Optional<Expense> optional=expenseRepository.findById(user);
        if(optional.isPresent())
        {
            return optional.get();
        }
        throw new RuntimeException("Expense is not found for the id "+ user);
    }

    @Override
    public void DeleteExpenseById(Long user) {
         expenseRepository.deleteById(user);
    }

    @Override
    public Expense SaveExpenseDetails(Expense expense) {
       return expenseRepository.save(expense);

    }

    @Override
    public Expense updateExpenseDetails(Expense expense, Long id) {
        Optional<Expense> optional=expenseRepository.findById(id);
        Expense expense1=optional.get();
        expense1.setAmount(expense.getAmount()!=null? expense.getAmount(): expense1.getAmount());
        expense1.setDate(expense.getDate()!=null? expense.getDate(): expense1.getDate());
        expense1.setDescription(expense.getDescription()!=null? expense.getDescription(): expense1.getDescription());
        expense1.setName(expense.getName()!=null? expense.getName(): expense1.getName());
        expense1.setCategory(expense.getCategory()!=null? expense.getCategory(): expense1.getCategory());
        return expenseRepository.save(expense1);
    }
}
