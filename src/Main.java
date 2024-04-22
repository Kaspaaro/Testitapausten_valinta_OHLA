public class Main {
    public static void main(String[] args) {
        //Sekunteja
        int seconds = 4;
        String time = "00:00:00";

        //Tehdään uusi TimeUtils-olio
        TimeUtils timeUtils = new TimeUtils();

        //Muunetaan sekunnit ajaksi ja aika sekunneiksi
        if (seconds > 0) {
            String secToTime = timeUtils.secToTime(seconds);
            int timeToSec = timeUtils.timeToSec(secToTime);
            //Tulostetaan tulokset
            System.out.println("Sekunnit: " + timeToSec);
            System.out.println("Aika: " + secToTime);
        }
        //Muunetaan aika sekunneiksi ja sekunnit ajaksi
        else if (time != null){
            int timeToSec = timeUtils.timeToSec(time);
            String secToTime = timeUtils.secToTime(timeToSec);
            //Tulostetaan tulokset
            System.out.println("Sekunnit: " + timeToSec);
            System.out.println("Aika: " + secToTime);
        } else {
            System.out.println("Anna joko aika tai sekunnit");
            System.exit(0);
        }


    }
}