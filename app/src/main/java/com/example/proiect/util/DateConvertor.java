package com.example.proiect.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConvertor {
    private static final String FORMAT= "dd-MM-YYYY" ;
    private final SimpleDateFormat formatter ;

    public DateConvertor() {
        this.formatter = new SimpleDateFormat(FORMAT, Locale.US) ;
    }
    public Date fromStringToDate(String value){
        try {
            return formatter.parse(value) ;
        } catch (ParseException e) {
            return null;
        }
    }
    public String toStringFromDate(Date date){
        if(date==null){
            return null;
        }
        return formatter.format(date) ;
    }
}
