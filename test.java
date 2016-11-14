package com.tutorialspoint;

import java.util.*;

public class TimerDemo {
   public static void main(String[] args) {
   // creating timer task, timer
   TimerTask tasknew = new TimerSchedulePeriod();
   Timer timer = new Timer();
      
   // scheduling the task at interval
   timer.schedule(tasknew,100, 100);      
   }
   // this method performs the task
   public void run() {
   System.out.println("timer working");      
   }    
}