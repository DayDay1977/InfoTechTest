import java.util.HashMap;
import java.util.Map;

public class NextDate {

    public static void nextDate(int day, int month, int year){
        Map<Integer,Integer> comparator = new HashMap<>();

        comparator.put(1,31);
        comparator.put(2,28);
        comparator.put(3,31);
        comparator.put(4,30);
        comparator.put(5,31);
        comparator.put(6,30);
        comparator.put(7,31);
        comparator.put(8,31);
        comparator.put(9,30);
        comparator.put(10,31);
        comparator.put(11,30);
        comparator.put(12,31);

        if (day < comparator.get(month)){
            day = day + 1;
        }
        else if (day == comparator.get(month)){
            day = 1;
            if(month == 12){
                month = 1;
            }
            month = month + 1;
        }
        else if (month == 12 && day == comparator.get(month)){
            month = 1;
            year = year + 1;
        }

        System.out.println(day + "-" + month + "-" + year);
    }

}
