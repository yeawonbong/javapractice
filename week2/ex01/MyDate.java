package week2.ex01;

public class MyDate{

    private int day;
    private int month;
    private int year;
    boolean validDate;
    boolean leapYear;

    MyDate(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        int a = month % 2;

        if (month <= 0 || year <= 0 || day <= 0)
            validDate = false;
        else if (month == 2) {
            if ((leapYear == true && day <= 29) || (leapYear == false && day < 28)) {
                validDate = true;
            }
            else {
                validDate = false;
            }
        }
        else {
            switch (a) {
                case 1:
                    if ((a > 7 && day <= 30) || (a <= 7 && day <= 31)) {
                        validDate = true;
                    }
                    break;
                case 0:
                    if ((a > 7 && day <= 31) || (a <= 7 && day <= 30)) {
                        validDate = true;
                    }
            }
        }
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month) {
        if ((1 <= month) && (month <= 12)) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
            if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0) {
                leapYear = true;
            }
            else {
                leapYear = false;
            }
        }
    }


    public String isValid(){
        if (validDate)
            return this.year + "년" + this.month + "월" + this.day + "일은 유효한 날짜 입니다";
        else
            return this.year + "년" + this.month + "월" + this.day + "일은 유효하지 않은 날짜 입니다";
    }
}


