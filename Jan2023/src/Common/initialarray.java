package Common;

public class initialarray {
	public static void main (String []args) {
		int month_days [];
		month_days = new int [5];
		month_days[0] = 10;
		month_days[1] = 20;
		month_days[2] = 20;
		month_days[3] = 20;
		month_days[4] = 50;
		
		System.out.println(month_days[0]);
		System.out.println(month_days[1]);
		System.out.println(month_days[2]);
		System.out.println(month_days[3]);
		System.out.println(month_days[4]);
		
		for (int i=0; i<5;i++)
		System.out.println("  " + month_days[i]);
	}

}
