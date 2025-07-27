public class ClockHandsMeet {

    public static void main(String[] args){
        double meetInterval = 12.0/11.0;
        
        for(int i = 0; i < 11; i++){
            double totalhr = i * meetInterval;
            int hrs = (int) totalhr;
            double fractionalhr = totalhr - hrs;
            int minutes = (int)(fractionalhr * 60);
            double seconds = (fractionalhr * 60 - minutes) * 60;
            System.out.printf("%02d:%02d:%02.0f\n", hrs, minutes,seconds);
        }

    }

}
