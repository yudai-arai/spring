class Section11_1 {
	public static void main (String[] args) {

		int receiveNumber = Integer.parseInt(args[0]) ;

		String display = "";

		for(int i=0 ; i<receiveNumber ; i++){
			display += "*";
		}

		System.out.println(display) ;
		
	}
}
