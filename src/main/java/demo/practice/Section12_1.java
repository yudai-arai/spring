class Section12_1 {
	public static void main (String[] args) {
		
		int dice = 0 ;

		dice =  1 + (int)( Math.random() * 6.0 ) ;

		System.out.println(dice) ;

		while( dice != 6 ){

			dice =  1 + (int)(Math.random() * 6.0) ;

			System.out.println(dice) ;
			
		}

		System.out.println("6が出たので終了します。") ;
		
	}
}
