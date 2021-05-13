public class MinutesToYearsDaysCalculator {
    public static void printYearAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            int hour = (int)(minutes/60);
            int days = hour/24;
            int years = days/365;

            System.out.println(minutes + " min = " + years +" y and " + days +"d");

        }
    }
}

