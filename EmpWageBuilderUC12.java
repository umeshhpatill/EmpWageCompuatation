package empwage;
import java.util.ArrayList;
class CompanyEmpWage{
	public final String company;
	public final int empRatePerHr;
	public final int numberOfWorkingDays;
	public final int maxHrPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxHrPerMonth = maxHrPerMonth;

	}//constructor
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	public String toString() {
			return "Total employee wage for: " +company+ " is " +totalEmpWage;
	}
}


public class EmpWageBuilderUC12 {
	
	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

private int numOfCompany = 0;
private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
public EmpWageBuilderUC12() {
	companyEmpWageArrayList = new ArrayList<>();

}
private void addCompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) {
	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHr, numberOfWorkingDays, maxHrPerMonth);
	companyEmpWageArrayList.add(companyEmpWage);
	//numOfCompany++;


}
private void computeEmpWage() {
	for (int i=0; i<companyEmpWageArrayList.size(); i++) {
		CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
		System.out.println(companyEmpWage);
	}
}
   private int computeEmpWage(CompanyEmpWage companyEmpWage) {
            //variables

	int empHrs = 0;
	int totalEmpHrs = 0;
	int totalWorkingDays = 0;
	

	//computation
	while (totalEmpHrs <= companyEmpWage.maxHrPerMonth && totalWorkingDays < companyEmpWage.numberOfWorkingDays) {

		totalWorkingDays++;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		switch ((int)empCheck) {
                    	case IS_FULL_TIME :
                                    empHrs = 8;
                                    break;
                            case IS_PART_TIME :
                                    empHrs = 4;
                                    break;
                            default :
                                    empHrs = 0;

		}
		totalEmpHrs += empHrs;
		System.out.println("totalWorkingDays: "+totalWorkingDays+"/ daly empHrs: "+empHrs+"/ totalEmpHrs: "+totalEmpHrs);
	}//while

	return totalEmpHrs * companyEmpWage.empRatePerHr;


    }//empSalary()
	

    public static void main(String args[]) {
    	EmpWageBuilderUC12 empWageBuilder = new EmpWageBuilderUC12();
    	empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Reliance", 50, 5, 15);
        empWageBuilder.computeEmpWage();
    }
    
}



