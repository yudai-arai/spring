class Section11_2 {
	public static void main (String[] args) {
		
		String display = "" ;

		for(int i = 0 ; i <= 9 ; i++){
			display = "";                        

			for(int j = 0 ; j <= 9 ; j++){
				display += String.valueOf(i) + String.valueOf(j) + " " ;
			}

			System.out.println( display );
			
		}
	}
}
