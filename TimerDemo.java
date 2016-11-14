

import java.util.*;
import java.util.Timer;

public class TimerDemo {
   public static void main(String[] args) {
	
		long start = System.currentTimeMillis();
		int i = 0;
		while(i < 3111111){
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println("Took : " + ((end - start) + "MilliSeconds"));
	}    
}