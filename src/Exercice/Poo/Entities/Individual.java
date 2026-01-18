package Exercice.Poo.Entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual() {}

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double sum = 0;
        if(getAnualIncome() < 20000){
            sum = getAnualIncome() * 0.15;
        } else {
            sum = getAnualIncome() * 0.25;
        }

        if (getHealthExpenditures() > 0){
            sum -= healthExpenditures * 0.5;
        }

        return sum;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
