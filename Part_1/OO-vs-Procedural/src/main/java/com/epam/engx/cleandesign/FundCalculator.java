package com.epam.engx.cleandesign;

import java.util.List;

import static com.epam.engx.cleandesign.CalculationUtil.summing;

public class FundCalculator {

    private BillCalculator billCalculator = new BillCalculator();

    public double getFundBalance(List<Assignment> assignments){
        double salaries = 0.0;
        double bill = 0.0;
        for (Assignment ass : assignments) {
            double totalArea = summing(ass.getZones(), AreaUtil::getArea);
            salaries += (ass.getWorker().calculateSalary( totalArea) + ass.getWorker().getAssignmentBonus(ass));
            bill += summing(ass.getZones(), billCalculator::calculateZoneBillPrice);
        }
        return bill - salaries;
    }



    public void setBillCalculator(BillCalculator billCalculator) {
        this.billCalculator = billCalculator;
    }
}
