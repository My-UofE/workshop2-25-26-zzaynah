// MyBirthday application
public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]);
        int currentDate = 7; 
        int myBirthdayDate = 23; 

        // value below is a constant
        final int DAYS_A_WEEK = 7; 
        
        // Tasks

        // 1. calc number of days from current date
        //    to birthday 
        int daysBetween = myBirthdayDate - currentDate;

        // 2. use this along with the current weekday 
        //    to find when the birthday falls
        int dayDiff = daysBetween % DAYS_A_WEEK;
        int birthdayDay = currentDay + dayDiff;

        birthdayDay = birthdayDay % DAYS_A_WEEK;
        // 3. Display the result
        System.out.println("Days until birthday: " + daysBetween);
        System.out.println("Birthday falls on weekday number: " + birthdayDay);

    }
}