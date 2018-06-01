package com.widera.projecteuler.problem019;

class DateIterator {

    private int day = 1;
    private int month = 1;
    private int year = 1900;

    private int weekday = 1;

    private int dayForMonth() {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        }
        return 31;
    }

    private boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                return true;
            } else {
                return year % 100 != 0 || year % 400 == 0;
            }
        }
        return false;
    }

    void nextDay() {
        if (day == dayForMonth()) {
            day = 1;
            nextMonth();
        } else {
            day++;
        }
        nextWeekDay();
    }

    boolean isEnd() {
        return year == 2000 && month == 12 && day == 31;
    }

    private void nextMonth() {
        if (month == 12) {
            month = 1;
            nextYear();
        } else {
            month++;
        }
    }

    private void nextYear() {
        year++;
    }

    private void nextWeekDay() {
        if (weekday == 7) {
            weekday = 1;
        } else {
            weekday++;
        }
    }

    boolean isDayFirstOfMonthAndWeekdayIsSundayAndInRange() {
        return day == 1 && weekday == 7 && isOver();
    }

    private boolean isOver() {
        return year >= 1901 && month >= 1 && day >= 1;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day + " " + weekday;
    }

}
