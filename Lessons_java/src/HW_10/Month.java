package HW_10;

public class Month {

    private String monthName;
    private int monthDays;
    private int workingDays;

    public Month (String monthName, int monthDays, int workingDays) {
        this.monthName = monthName;
        this.monthDays = monthDays;
        this.workingDays = workingDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getMonthDays() {
        return monthDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }

}