package Exercice.Heranca.Entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount() {}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        System.out.println("Update");
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
