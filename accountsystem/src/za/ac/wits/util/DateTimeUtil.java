package za.ac.wits.util;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

    public static long getInitialDelay(long archiveInterval, String execTimeString) {		
		Date execDate = new Date(Time.valueOf(execTimeString).getTime());		
		Calendar execTimeCal = Calendar.getInstance();
		execTimeCal.setTime(execDate);
		
		Calendar currentCal = Calendar.getInstance();
		currentCal.setTime(new Date());
		
		execTimeCal.set(currentCal.get(Calendar.YEAR), currentCal.get(Calendar.MONTH), currentCal.get(Calendar.DATE));
		
		if(execTimeCal.before(currentCal)){
			//executime = executime + 24 hours
			execTimeCal.add(Calendar.HOUR, new BigDecimal(archiveInterval/(1000*3600)).intValue());
		}
		return execTimeCal.getTimeInMillis() - currentCal.getTimeInMillis();		
	}
}
