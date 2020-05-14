public class EmpWageBuilderObject {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkDays;
    private final int maxHrsPerMonth;
    private int totalEmpWage;

    public EmpWageBuilderObject(String company, int empRatePerHr, int numOfWorkDays, int maxHrsPerMonth){
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkDays = numOfWorkDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void totalEmpWage() {
        //VARIABLES
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        //COMPUTATION
        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + " Emp Hours: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        //System.out.println("Total Emp Wage for company company is " + totalEmpWage);
    }

    @Override
    public String toString(){
        return "Total employee wage for company "+company+" is "+totalEmpWage;
    }

    public static void main(String args[]) {
        EmpWageBuilderObject dMart = new EmpWageBuilderObject("DMart", 20, 2, 10);
        EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance", 25, 5, 15);
        dMart.totalEmpWage();
        reliance.totalEmpWage();
        System.out.println(dMart);
        System.out.println(reliance);
    }
}
