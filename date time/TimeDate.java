package td;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimeDate {

	public static void main(String[] args) {
		
		
		//local
//		LocalDate   date = LocalDate.now();
//      	System.out.println(date);
//      	System.out.println(date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
//     	LocalTime   time = LocalTime.now();
//     	System.out.println(time);
//     	System.out.println(time.getHour()+"/"+time.getMinute()+"/"+time.getSecond()+"/"+time.getNano());
     	
     	
     	
        //zonal
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);


	}

}
