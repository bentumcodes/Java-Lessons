public class ShowCurrentTime{
	public static void main(String[] args){
		//obtain the total milliseconds since midnight, Jan 1, 1970
		
		long totalMilliseconds = System.currentTimeMillis();
		
		//obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		
		//to compute the current seconds
		long currentSeconds = totalSeconds % 60;
		
		//obtain the minutes
		long minutes = totalSeconds / 60;
		
		// to obtain the current minutes in the hour
		
		long currentMinutes = minutes % 60;
		
		//to obtain the hour
		long totalHours = minutes / 60;
		
		//to compute the current hour
		long currentHour = totalHours %24;
		
		//display results
		
		System.out.println("Current time is " + currentHour+ ":" + currentMinutes + ":" + currentSeconds);
	}
}
		