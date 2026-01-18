package Exercice.Polimorfismo.Entities;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee() {}

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double calcularSalario(){
        return valuePerHour * hours;
    }

    public BigDecimal payment() {
        double salario = calcularSalario();
        BigDecimal bigDecimal = new BigDecimal(salario);
        BigDecimal roundedValue = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        return roundedValue;
    }

    public String imprimir(){
        return getName() + " - $ " + this.payment();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", valuePerHour=" + valuePerHour +
                '}';
    }
}
