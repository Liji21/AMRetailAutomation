package com.AMRetailkarllagerfeldparis.utilities;

import java.util.Date;

public class Utilities 
{

	public static String generateEmailWithTimeStamp()
	{
		Date date =new Date();
		String timestamp=date.toString().replace(" ", "_").replace(":","_");
		return "testqa"+timestamp+"@gmail.com";
	}
}
