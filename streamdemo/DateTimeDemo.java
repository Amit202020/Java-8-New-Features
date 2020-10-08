package streamdemo;

import java.time.*;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate   ld =LocalDate.now();
        System.out.println(ld.getDayOfMonth()+"/"+ld.getMonthValue()+"/"+ld.getYear());
        LocalTime  lt = LocalTime.now();
        System.out.println(lt);
        

	}

}
