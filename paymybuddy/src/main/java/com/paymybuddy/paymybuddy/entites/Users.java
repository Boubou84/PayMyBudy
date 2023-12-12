package com.paymybuddy.paymybuddy.entites;

import jakarta.persistence.*;
import org.hibernate.mapping.Set;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String fullName;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private Date creationDate;

    @OneToMany(mappedBy = "sender")
    private Set sentTransactions;

    @OneToMany(mappedBy = "receiver")
    private Set receivedTransactions;

    @OneToMany(mappedBy = "user")
    private Set friendConnections;

    @OneToOne(mappedBy = "user")
    private AccountBalances accountBalance;

    public Users() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set getSentTransactions() {
        return sentTransactions;
    }

    public void setSentTransactions(Set sentTransactions) {
        this.sentTransactions = sentTransactions;
    }

    public Set getReceivedTransactions() {
        return receivedTransactions;
    }

    public void setReceivedTransactions(Set receivedTransactions) {
        this.receivedTransactions = receivedTransactions;
    }

    public Set getFriendConnections() {
        return friendConnections;
    }

    public void setFriendConnections(Set friendConnections) {
        this.friendConnections = friendConnections;
    }

    public AccountBalances getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalances accountBalance) {
        this.accountBalance = accountBalance;
    }
}
