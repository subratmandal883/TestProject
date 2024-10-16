package streamCollection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class Demo2 {

	public static void main(String args[]) {
		/*
		 * DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy/mm/dd HH/mm/ss");
		 * LocalDateTime ld=LocalDateTime.now(); System.out.println(ld.format(dt));
		 */
	SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy hh/mm/ss");
	Date date=new Date();
	System.out.println(sd.format(date));
	}
	
		
		   
	}


