public class lcd_2446_twoeventsconflict {
    public static boolean haveConflict(String[] event1, String[] event2) {
        
        int start1 = convertToMinutes(event1[0]);
        int end1 = convertToMinutes(event1[1]);
        int start2 = convertToMinutes(event2[0]);
        int end2 = convertToMinutes(event2[1]);

        return start1 <= end2 && start2 <= end1;
    }

    
    private static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    public static void main(String[] args) {

        String[] event1 = {"01:15", "02:00"};
        String[] event2 = {"02:00", "03:00"};
        System.out.println(haveConflict(event1, event2)); 

        String[] event3 = {"01:00", "02:00"};
        String[] event4 = {"01:20", "03:00"};
        System.out.println(haveConflict(event3, event4)); 

        String[] event5 = {"10:00", "11:00"};
        String[] event6 = {"14:00", "15:00"};
        System.out.println(haveConflict(event5, event6)); 
    }
}
