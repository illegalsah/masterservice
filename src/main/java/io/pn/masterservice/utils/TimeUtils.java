package io.pn.masterservice.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
	
	private static final String datePattern = "dd-MMM-yyyy";
	private static final String timePattern = "HH:mm:ss";
	private static final String dateTimePattern = datePattern+" "+timePattern;
	
	public static String toText(LocalDate localDate) {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern(datePattern);
		String format = localDate.format(formater);
		return format;
	}
	
	public static String toText(LocalDateTime localDateTime) {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern(dateTimePattern);
		String format = localDateTime.format(formater);
		return format;
	}
	
	
	public static String toText(LocalTime localTime) {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern(timePattern);
		String format = localTime.format(formater);
		return format;
	}
	
	public static LocalDate toLocalDate(String date) {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern(datePattern);
		 LocalDate localDate = LocalDate.parse(date, formater);
		 return localDate;
	}
	
	public static LocalDateTime toLocalDateTime(String datetime) {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern(dateTimePattern);
		LocalDateTime localDateTime = LocalDateTime.parse(datetime,formater);
		return localDateTime;
	}
	
	public static LocalTime toLocalTime(String time) {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern(timePattern);
		LocalTime localTime = LocalTime.parse(time,formater);
		return localTime;
	}
	
}
