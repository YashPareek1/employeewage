//Compute Employee Wage for multiple companies
public class Employeewagebuilder 
{

	 //variables
    int empHrs = 0;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 1000;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static int ComputeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {

        //variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= 1000 && totalWorkingDays < 20)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days#: " + totalWorkingDays + " Emp Hrs : " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for company: "+company+" is : " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args)
    {
        ComputeEmpWage("DMart",20,2,10);
        ComputeEmpWage("Reliance",10,4,20);
    }

   
}
