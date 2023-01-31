package ch18;

import java.text.DecimalFormat;

public class ELMethod2 {
	public static String comma(int number) {
		DecimalFormat df = new DecimalFormat("#,##0");
		return df.format(number);
	}

}
