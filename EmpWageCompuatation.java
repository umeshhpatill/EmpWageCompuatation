public class EmpWageCompuatation {

public static void main(String args[]){
        //constants
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HR = 20;
        int IS_PART_TIME = 2;

        //VARIABLES
        int empHrs = 0;
        int empWage = 0;

        //COMPUTATION
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if(empCheck == IS_FULL_TIME){
            empHrs = 8;
        }
        else if(empCheck == IS_PART_TIME){
            empHrs = 4;
        }
        else{
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Employee Wage: "+empWage);
    }
}
