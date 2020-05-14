public classs EmpWageCompuatation {

public static void main(String args[]){
        //constants
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HR = 20;

        //VARIABLES
        int empHrs = 0;
        int empWage = 0;

        //COMPUTATION
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == IS_FULL_TIME){
            empHrs = 8;
        }
        else{
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Employee Wage: "+empWage);
    }
}
