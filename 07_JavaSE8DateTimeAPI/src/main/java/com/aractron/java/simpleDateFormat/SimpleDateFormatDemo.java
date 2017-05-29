package com.aractron.java.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/**
 * Created by user on 27/02/2017.
 */
public class SimpleDateFormatDemo {
    Date today;
    String output;
    SimpleDateFormat formatter;
    private Locale currentLocale;
    private String result;


    public void simpleDateFormatFormatter() {
        formatter = new SimpleDateFormat("EEE d MMM yy", currentLocale);
        today = new Date();
        result = formatter.format(today);
        System.out.println("Locale: " + currentLocale.toString());
        System.out.println("Result: " + result);


    }
}
