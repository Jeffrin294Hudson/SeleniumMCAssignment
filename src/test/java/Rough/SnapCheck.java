package Rough;

import java.util.Date;
import java.text.SimpleDateFormat;

	

public class SnapCheck {
	public static void main(String args[])
	{
	String pattern = "yyyyMMddhhss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	String df = simpleDateFormat.format(new Date());
	System.out.println(System.getProperty("user.dir"));
}}
