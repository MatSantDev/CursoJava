package Exercice.Interface2.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    private Date dueDate;
    private Double value;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Installment() {}

    public Installment(Date dueDate, Double value) {
        this.dueDate = dueDate;
        this.value = value;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return sdf.format(dueDate) + " - " + value;
    }
}
