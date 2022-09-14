import java.util.List;
import java.util.ArrayList;

class Section17_2{
	public static void main (String[] args) {
		String[][] dogs = {
		                    {"モコ" , "4歳"  , "メス"} ,
		                    {"ムギ" , "2歳"  , "オス"} ,
		                    {"ブブ" , "3歳"  , "メス"} ,
		                    {"シロ" , "8歳"  , "オス"} ,
		                    {"ブブ" , "3歳"  , "メス"} ,
		                    {"ペロ" , "1歳"  , "メス"} ,
		                    {"ルル" , "14歳" , "オス"} ,
		                    {"モモ" , "10歳" , "メス"} ,
		                    {"ポチ" , "6歳"  , "オス"} ,
		                    {"エル" , "2歳"  , "メス"} 
		                  };

		List<String> adultFemaleDogsList = new ArrayList<String>();

		for( int i = 0 ; i < dogs.length ; i++ ){

			if( Integer.parseInt( dogs[i][1].replace("歳","") ) >= 4 && dogs[i][2].equals( "メス" ) ){
				
				adultFemaleDogsList.add( dogs[i][0] );
				
			}
			
		}

		for( int i = 0 ; i < adultFemaleDogsList.size() ; i++ ){
			
			System.out.println( adultFemaleDogsList.get(i) );
			
		}
	}
}

