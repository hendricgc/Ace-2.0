package Converter;

import java.util.Date;

public class DateToString {

    public static String dateToString(Date d) {

        String ret = "";
        if (d == null) {
            return ret;
        }
        ret += d.toString().substring(8, 10);
        ret += d.toString().substring(5, 7);
        ret += d.toString().substring(0, 4);
        return ret;

    }

}
