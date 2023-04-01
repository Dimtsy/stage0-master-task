package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        String days = "invalid date";
        if (month > 0 && month <= 12) {
            if (month != 2) {
                if (month%2==0) {
                    days = "30";
                }else {
                    days = "31";
                }
            }else {
                if(year%4==0){
                    days = "29";
                    if(year%100==0&&year%400!=0){
                        days = "28";
                    }
                }else {
                    days = "28";
                }
            }
        }
        System.out.println(days);
    }

}
