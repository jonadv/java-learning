
//import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
//import java.time.temporal.TemporalAccessor;

class Test{
	public static void main(String... arg){

		/*
		7. Assuming that system date is 1st July 2018, create LocalDate objects containing the same date using the of, now, and parse methods of LocalDate. Print the LocalDate objects so, created and observe the printed values. 
		*/
		dbg("Exercise 7, LocalDate: ");
		LocalDate ld1 = LocalDate.of(2018, 7,1);
		LocalDate ld2 = LocalDate.from(ld1);
		LocalDate ld3 = LocalDate.parse("2018-07-01");
			
		dbg("LocalDate.of(2018,7,1)		  : "+ld1);
		dbg("LocalDate.from(ld1)   		  : "+ld2);
		dbg("LocalDate.parse('2018-07-01'): "+ld3);
		
		dbg("\nExercise 8: ");
		LocalDateTime ldt1 = LocalDateTime.of(2018,7,1,15,00);
		dbg("LocalDateTime "+ldt1+" to LocalDate: "+LDTtoLDString(ldt1));
		
		dbg("\nExercise 9: ");
		dbg("LocalDate string of exercise 8 parsed to LocalDate object: "+parseStringToLD(LDTtoLDString(ldt1)));
		
		dbg("\nExercise 10: ");
		List<LocalDateTime> li = new ArrayList<>();
		li.add(LocalDateTime.of(2012,1,1,12,39));
		li.add(LocalDateTime.of(2034,8,4,05,30));
		li.add(LocalDateTime.of(2016,2,8,13,36));
		li.add(LocalDateTime.of(2008,4,8,12,31));
		li.add(LocalDateTime.of(2003,1,12,10,0));
		li.add(LocalDateTime.now()); //today is august 4, 2021
		
		dbg("Printing created LDT list: \n"+li);
		dbg("Filtered list: \n"+filterDates(li));
	}
	
	/*
	8. Create a method that takes a LocalDateTime as argument and returns a String containing just the date (without the time) in ISO format.
	*/
	static String LDTtoLDString(LocalDateTime ldt){
		return LocalDate.from(ldt).toString();
	}
	
	/*
	9. Pass the String returned by the method that you created above to another method that returns a LocalDate object representing the same date.
	*/
	static LocalDate parseStringToLD(String s){
		return LocalDate.parse(s);
	}
	
	/*
	10. Create a method that takes a List of LocalDateTime objects and returns a List of LocalDate objects containing only the dates having the same day and month as today. 
	*/
	static List<LocalDate> filterDates(List<LocalDateTime> in){
		LocalDate now = LocalDate.now();
		List<LocalDate> out = new ArrayList<>();
		for(LocalDateTime ldt : in){
			if( now.getMonth() == ldt.getMonth() &&
				now.getDayOfMonth() == ldt.getDayOfMonth()){
					out.add(LocalDate.from(ldt));
				}
		}
		return out;
	}
	
	
	static void dbg(String s){
		System.out.println(s);
	}
	static void dbg(Object o){
		System.out.println(o.toString());
	}
}