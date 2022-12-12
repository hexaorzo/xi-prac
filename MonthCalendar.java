import java.util.*;
public class MonthCalendar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = sc.nextInt();
        System.out.print("Enter an year: ");
        int year = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("\n\t\t" + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + "-" + year);
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        int i = 0;
        for (i = 0; i < startDay - 1; i++)
            System.out.print("\t");
        for (i = 1; i <= numberOfDaysInMonth; i++)
        {
            System.out.print(i + "\t");
            if ((i + startDay - 1) % 7 == 0)
                System.out.println();
        }
    }
}
