/*-< 演習：Ex1_15_1 >---------------------------------
BigDecimalの扱いについてAPIドキュメントなどで調べながら
以下の結果が表示されるプログラムを作ってみましょう！
----------------------------------------------------*/
import java.math.BigDecimal;
import java.math.RoundingMode;

class Section17_1{
	public static void main (String[] args) {

		BigDecimal bd1_1      = new BigDecimal( "0.2" );
		BigDecimal bd1_2      = new BigDecimal( "83" );
		BigDecimal bd1_3      = new BigDecimal( "-10.6" );
		BigDecimal bd1_result = ( bd1_1.multiply( bd1_2 ) ).add( bd1_3 );
		System.out.println(bd1_result);

		BigDecimal bd2_1     = new BigDecimal( "0.2" );
		BigDecimal bd2_2     = new BigDecimal( "83" );
		BigDecimal bd2_3     = new BigDecimal( "-10.6" );
		BigDecimal bd2_4     = new BigDecimal( "3" );
		BigDecimal bd2_result = ( bd2_1.multiply( bd2_2 ) ).add( bd2_3.divide( bd2_4 , 2 , RoundingMode.HALF_UP));
		System.out.println(bd2_result);
		
	}
}
