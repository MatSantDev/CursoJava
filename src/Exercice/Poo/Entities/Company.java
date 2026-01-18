package Exercice.Poo.Entities;

public class Company extends TaxPayer{

    private int numberOfEmployee;

    public Company() {}

    public Company(String name, Double anualIncome, int numberOfEmployee) {
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public Double tax() {
        if (numberOfEmployee > 10){
            return getAnualIncome() * 0.14;
        }

        return getAnualIncome() * 0.16;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
}
