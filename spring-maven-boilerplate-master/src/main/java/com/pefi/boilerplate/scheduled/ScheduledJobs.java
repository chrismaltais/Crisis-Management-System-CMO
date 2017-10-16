package com.pefi.boilerplate.scheduled;


import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ScheduledJobs {


    public void printCurrentTime() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        DateTime date = new DateTime();
        System.out.println("CURRENT TIME: " + date.toString("yyyy-MM-dd HH:mm:ss"));
    }
}
