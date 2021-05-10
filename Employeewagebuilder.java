class Employeewagebuilder
    {
        public static int IS_PART_TIME = 1;
        public static int IS_FULL_TIME = 2;

        public String company;
        private int empRatePerHour;
        private int numOfWorkingDays;
        private int maxHoursPerMonth;
        private int totalEmpWage;

        public Employeewagebuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
        {
            this.company = company;
            this.empRatePerHour = empRatePerHour;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;
        }
        public void computeEmpWage()
        {

            //variables
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;
            while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
            {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck)
                {
                    case 1:                 //IS_PART_TIME
                        empHrs = 4;
                        break;
                    case 2:                //IS_FULL_TIME
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                        break;
                }
                totalEmpHrs += empHrs;
                System.out.println("Days#: " + totalWorkingDays + " Emp Hrs : " + empHrs);
            }
            totalEmpWage = totalEmpHrs * this.empRatePerHour;
            //Console.WriteLine("Total Emp Wage for company: " + company + " is : " + totalEmpWage);
           }

          public String toString()
          {
            return "Total Emp Wage for company : " + this.company + " is : " + this.totalEmpWage;
          }

        

    
public static void main(String[] args)
{
	
        Employeewagebuilder dMart = new Employeewagebuilder("DMart",20,2,10);
        Employeewagebuilder reliance = new Employeewagebuilder("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart.toString());
            reliance.computeEmpWage();
         System.out.println(reliance.toString());

}
}