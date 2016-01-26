/*
 * This code is originally made by the author
 */
package posuas;

import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author arissetyawan.email@gmail.com
 */
public class risTime {
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String now()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(cal.getTime());
    }
}

