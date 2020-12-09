public class ShowCurrentTime {

    public static void main(String[] args) {
        // Obtain the total milliseconds from midnight, Jan 1, 1970
        long currentMillis = System.currentTimeMillis();
        System.out.println("Current milliseconds: " + currentMillis);

        // Obtain the total seconds from midnight, Jan 1, 1970
        long totalSeconds = currentMillis / 1000;

        // Obtain the current seconds in the minutes in the hour
        long seconds = totalSeconds % 60;

        // Obtain the total minutes from midnight, Jan 1, 1970
        long totalMinutes = totalSeconds / 60;

        // Obtain the current minutes in the hour
        long minutes = totalMinutes % 60;

        // Obtain the total hours from midnight, Jan 1, 1970
        long totalHours = totalMinutes / 60;

        // Obtain the current hours today
        long hours = totalHours % 24;

        System.out.println("Current time: " +
                hours + ":" + minutes + ":" + seconds + " GMT+00:00.");

        System.out.println("Current time: " +
                (hours + 7) + ":" + minutes + ":" + seconds + " GMT+07:00 Phnom Penh.");
    }
}
