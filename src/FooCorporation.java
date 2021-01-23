public class FooCorporation {

    public static void main(String[] args) {
        makePayment(8.20,37);
    }
    public static void makePayment(double basePay,double hoursWorked){
        double minimumWage = 8;
        double salary = 0;
        double workTime = 40;
        double overTime = 0;
        if(basePay <= 0 || hoursWorked <= 0){
            System.out.println("Hours and Base pay cannot be less than or equals to 0");
        }
       else if(basePay < minimumWage ){
            System.out.println("Sorry hourly pay is less than  $8.0");
        }else if(hoursWorked > 60){
            System.out.println("Sorry hours is more than recommended work time");
        } else{
            salary = basePay * hoursWorked;

            if(hoursWorked > workTime){
                overTime =  (hoursWorked - workTime) * 1.5 * basePay;
                salary =  workTime * basePay;
                salary+=overTime;

            }

            System.out.print("Total pay = $");
            System.out.printf("%.2f", salary);
        }


    }

}
