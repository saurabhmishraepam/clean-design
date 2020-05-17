package com.epam.engx.cleandesign;

public class Worker {
    private double dailyRate;
    private double amountPerDay;
    private boolean isJunior = false;
    private static final double SENIOR_SALARY_FACTOR = 1.2;
    private static final double SENIOR_BONUS_FACTOR = 1.5;

    public Worker(double dailyRate, double amountPerDay) {
        this.dailyRate = dailyRate;
        this.amountPerDay = amountPerDay;
    }

    public Worker(double dailyRate, double amountPerDay, boolean isJunior) {
        this.dailyRate = dailyRate;
        this.amountPerDay = amountPerDay;
        this.isJunior = isJunior;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getAmountPerDay() {
        return amountPerDay;
    }

    public boolean isJunior() {
        return isJunior;
    }


    public Double calculateSalary(Double area) {
        int days = (int) Math.ceil(area / getAmountPerDay());
        double baseSalary = getDailyRate() * days;
        if (isJunior())
            return baseSalary;
        return baseSalary * SENIOR_SALARY_FACTOR;
    }

    public double getAssignmentBonus(Assignment ass) {
        if (isJunior())
            return ass.getVendorBonus();
        else
            return ass.getVendorBonus() * SENIOR_BONUS_FACTOR;
    }

}
