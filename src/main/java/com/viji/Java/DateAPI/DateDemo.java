package com.viji.Java.DateAPI;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		// old
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
		// Local Date Format
		LocalDate currentDate = LocalDate.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		currentDate.getDayOfMonth();
	}

}
