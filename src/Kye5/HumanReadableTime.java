//Kye 5
//https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

package Kye5;

import java.time.Duration;


public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        Duration duration = Duration.ofSeconds(seconds);
        return String.format("%02d:%02d:%02d", duration.toHours(), duration.toMinutesPart(), duration.toSecondsPart());





/*        LocalTime time = LocalTime.of((int) duration.toHours(), duration.toMinutesPart(), duration.toSecondsPart());
        LocalTime time1 = LocalTime.parse("" + duration.toHours() + duration.toMinutesPart() + duration.toSecondsPart(), formatter);*/


    }

}
