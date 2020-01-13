import java.util.*;
import java.util.Calendar;
public class FirstProjectMain{
	
public static void main(String[] args){
	
	Scanner user = new Scanner(System.in);
    System.out.print("What day do you want to view? ");
	int day = user.nextInt();

    System.out.print("What month do you want to view? ");
    int month = user.nextInt();
	
	System.out.print("What year do you want to view? ");
    int year = user.nextInt();
	
	
	 System.out.printf("%12d\n", year);
    System.out.println();
    boolean leap = isLeap(year);    
    int firstDay = JulianDate(year);
    monthLoop(year, firstDay, leap);
	}
	
	
	public static int JulianDate(int year) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    calendar.set(Calendar.DAY_OF_YEAR, 1);
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
    return dayOfWeek;
}
public static boolean isLeap(int year) {
    boolean verdict = false;
    if (year % 100 == 0 && year % 400 == 0) {
        verdict = true;
    }
    if(year % 100 != 0 && year % 4 == 0) {
        verdict = true;
    }
    return verdict;
}
public static void monthLoop(int year, int firstDay, boolean leap) {
    for(int i=1; i <= 12; i++) {
        switch (i) {
            case 1: System.out.printf("%13s\n", "January");
                    break;
            case 2: System.out.printf("%13s\n", "February");
                    break;
            case 3: System.out.printf("%12s\n", "March");
                    break;
            case 4: System.out.printf("%12s\n", "April");
                    break;
            case 5: System.out.printf("%11s\n", "May");
                    break;
            case 6: System.out.printf("%11s\n", "June");
                    break;
            case 7: System.out.printf("%11s\n", "July");
                    break;
            case 8: System.out.printf("%13s\n", "August");
                    break;
            case 9: System.out.printf("%14s\n", "September");
                    break;
            case 10: System.out.printf("%13s\n", "October");
                    break;
            case 11: System.out.printf("%14s\n", "November");
                    break;
            case 12: System.out.printf("%14s\n", "December");
                    break;                      
        }

    System.out.println("S  M  Tu W  Th F  S");


    }

}

}







