package sample;


public class EnumerationsExample {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    Day day;

    public EnumerationsExample(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumerationsExample firstDay = new EnumerationsExample(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumerationsExample thirdDay = new EnumerationsExample(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumerationsExample fifthDay = new EnumerationsExample(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumerationsExample sixthDay = new EnumerationsExample(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumerationsExample seventhDay = new EnumerationsExample(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}