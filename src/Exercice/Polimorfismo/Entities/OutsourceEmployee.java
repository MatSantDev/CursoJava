package Exercice.Polimorfismo.Entities;

import java.math.BigDecimal;

public class OutsourceEmployee extends Employee{

    private Double additionalCharge;

    public OutsourceEmployee() {}

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + additionalCharge * 1.1;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public String toString() {
        return "OutsourceEmployee{" +
                "additionalCharge=" + additionalCharge +
                '}';
    }
}
