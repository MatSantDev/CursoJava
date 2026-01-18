package Exercice.Composicao.Entities;

import Exercice.Composicao.Entities.Enums.WorkedLevel;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {

    private String name;
    private WorkedLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {}

    public Worker(String name, WorkedLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = this.baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts){
            calendar.setTime(contract.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_month = 1 + calendar.get(Calendar.MONTH);

            if(year == c_year && month == c_month){
                sum += contract.totalValue();
            }

        }

        return sum;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkedLevel getLevel() {
        return level;
    }

    public void setLevel(WorkedLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", BaseSalary=" + baseSalary +
                ", contracts=" + contracts +
                ", department=" + department +
                '}';
    }
}
