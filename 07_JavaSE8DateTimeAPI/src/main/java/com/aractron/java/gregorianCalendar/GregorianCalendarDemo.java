package com.aractron.java.gregorianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by user on 27/02/2017.
 */
public class GregorianCalendarDemo {

    // hardcoded dates
    GregorianCalendar startDate =
            new GregorianCalendar( 2009, 0, 30 );

    GregorianCalendar startTime =
            new GregorianCalendar( 2012, 6, 20, 15, 30 );


    public void fonction(){

        GregorianCalendar myDay = new GregorianCalendar (1978, 4, 16);
        System.out.println((myDay.get(Calendar.MONTH)+1)+ "/"+ myDay.get(Calendar.DATE)+ "/"+ myDay.get(Calendar.YEAR));
// affiche 5/16/1978


    }
}
