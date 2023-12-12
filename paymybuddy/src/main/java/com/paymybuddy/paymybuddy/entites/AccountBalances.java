package com.paymybuddy.paymybuddy.entites;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "account_balances")
public class AccountBalances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int balanceId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private double balance;

    public AccountBalances() {
    }

    public int getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(int balanceId) {
        this.balanceId = balanceId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
