class Section8 {
	public static void main (String[] args) {
		
		byte calc1_1 = 1;
		short calc1_2 = 2;
		long calc1_3 = 300000000000L;
		long answer1 = calc1_1 + calc1_2 + calc1_3;
		System.out.println( answer1 );
		
		
		byte calc2_1 = 4;
		double calc2_2 = 5;
		int calc2_3 = 6;
		double answer2 = calc2_1 + calc2_2 + calc2_3;
		System.out.println( answer2 );
		
		
		short calc3_1 = 7;
		String calc3_2 = "8";
		int calc3_3 = 9;
		int answer3 = calc3_1 +  Integer.parseInt(calc3_2) + calc3_3;
		System.out.println( answer3 );
		
		
		int calc4_1 = 10;
		long calc4_2 = 11 ;
		int answer4 = calc4_1 + (int)calc4_2;
		System.out.println( answer4 );
		
	}
}
