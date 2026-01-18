package Exercice.Exception2.Modal.Entities;

import Exercice.Exception2.Modal.Exception.AccountException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdarwLimit;

    public Account() {}

    public Account(Integer number, String holder, Double balance, Double withdarwLimit) throws AccountException {
        if(balance < 0){
            throw new AccountException("Saldo abaixo de zero");
        }
        if (withdarwLimit < 0){
            throw new AccountException("Limite abaixo de zero");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdarwLimit = withdarwLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws AccountException{
        if(amount > withdarwLimit){
            throw new AccountException("Saque maior que o limite");
        }
        if(balance < 0){
            throw new AccountException("Saldo abaixo de zero");
        }
        if ((balance - amount) < 0){
            throw new AccountException("Saque maior que o saldo da conta");
        }
        balance -= amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdarwLimit() {
        return withdarwLimit;
    }

    public void setWithdarwLimit(Double withdarwLimit) {
        this.withdarwLimit = withdarwLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdarwLimit=" + withdarwLimit +
                '}';
    }
}
