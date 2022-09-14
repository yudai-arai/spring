class Section11_2 {
	public static void main (String[] args) {

		String[][] animals = {
		                       {"モコ" ,"トイプードル" ,"4歳" ,"メス"},
		                       {"ポチ" ,"シバイヌ" ,"6歳" ,"オス"},
		                       {"ムギ" ,"パピヨン" ,"2歳" ,"オス"},
		                       {"ブブ" ,"ブルドッグ" ,"3歳" ,"メス"},
		                       {"シロ" ,"秋田犬" ,"8歳" ,"オス"}
		                     };

		String display ="";

		for( int i = 0 ; i < animals.length ; i++ ){

			display = animals[i][0] ;

			for( int j = 1 ; j < animals[i].length ; j++){
				display += " / " + animals[i][j] ;
			}

			System.out.println( display );
			
		}
	}
}
