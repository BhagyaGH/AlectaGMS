package alectagms;

/*
 * This sets the salary details entered by the administrator
 * Basic Salary
 * OT1
 * OT2
 * etc.
 */

public class SalaryAdministrationSetter {
    private int HOURS = 9; //No of maximum hours for work per day
    private int HOURS_SAT = 5; //No of maximum hours for Saturday
    private int OT1 = 2;
    private int OT1_SAT = 5;
    private double salaryOT1 = 12.5;
    private double salaryOT2 = 25;
    private double attendanceAllowance = 1000;

    public int getHOURS() {
        return HOURS;
    }

    public void setHOURS(int HOURS) {
        this.HOURS = HOURS;
    }

    public int getHOURS_SAT() {
        return HOURS_SAT;
    }

    public void setHOURS_SAT(int HOURS_SAT) {
        this.HOURS_SAT = HOURS_SAT;
    }

    public int getOT1() {
        return OT1;
    }

    public void setOT1(int OT1) {
        this.OT1 = OT1;
    }

    public int getOT1_SAT() {
        return OT1_SAT;
    }

    public void setOT1_SAT(int OT1_SAT) {
        this.OT1_SAT = OT1_SAT;
    }

    public double getSalaryOT1() {
        return salaryOT1;
    }

    public void setSalaryOT1(double salaryOT1) {
        this.salaryOT1 = salaryOT1;
    }

    public double getSalaryOT2() {
        return salaryOT2;
    }

    public void setSalaryOT2(double salaryOT2) {
        this.salaryOT2 = salaryOT2;
    }

    public double getAttendanceAllowance() {
        return attendanceAllowance;
    }

    public void setAttendanceAllowance(double attendanceAllowance) {
        this.attendanceAllowance = attendanceAllowance;
    }   
    
}
