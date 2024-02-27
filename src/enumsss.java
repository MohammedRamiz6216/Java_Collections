enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

public class enumsss {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is :"+today);
        switch (today){
            case FRIDAY:
                System.out.println("Today is Friday");
break;
            case MONDAY:
                System.out.println("Today is monday");
break;
            case TUESDAY:
                System.out.println("Today is tuesday");

break;
            case WEDNESDAY:
                System.out.println("Today is wednesday");
break;
            case THURSDAY:
                System.out.println("Today is thursday");
break;
            case SATURDAY:
                System.out.println("Today is satrday");
break;
            case SUNDAY:
                System.out.println("Today is sunday");
                break;

            default:
                System.out.println("nothing");

        }
    }
}
