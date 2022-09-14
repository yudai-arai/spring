public class Section16 {

	public static void main (String[] args) {
		
		int totalPrice = 0 ;

		for(int i = 0 ; i < args.length ; i++ ){
			totalPrice += Integer.parseInt( args[i] );
		}

		int discountedPrice = discount( totalPrice );

		int taxPayment = calcTaxPayment( discountedPrice );

		System.out.println("値引き後の支払金額：" + taxPayment + "円" );
		
	}

	static int discount( int pr ){
		
		final int    DISCOUNT_BORDER1   = 1000 ;
		final int    DISCOUNT_BORDER2   = 5000 ;
		final double DISCOUNT_RATE1     = 0.1  ;
		final double DISCOUNT_RATE2     = 0.2  ;
		final int    DISCOUNT_PRICE_MAX = 5000 ;
		
		int priceDownTemp = 0 ;

		if ( DISCOUNT_BORDER1 <= pr && pr <= DISCOUNT_BORDER2 ){

			priceDownTemp = (int)( (pr - DISCOUNT_BORDER1) * DISCOUNT_RATE1 ) ;
			
		}else if ( DISCOUNT_BORDER2 < pr ){

			priceDownTemp = (int)(   (DISCOUNT_BORDER2 - DISCOUNT_BORDER1) * DISCOUNT_RATE1 
			                         + ( pr - DISCOUNT_BORDER2) * DISCOUNT_RATE2            ) ;
			
		}
		
		int priceDown = 0 ;

		if( DISCOUNT_PRICE_MAX < priceDownTemp ){

			priceDown = DISCOUNT_PRICE_MAX ;
			
		}else{

			priceDown = priceDownTemp ;
			
		}

		return pr - priceDown ;
		
	}

	static int calcTaxPayment( int pr ){
		
		final double SCALE_TAX = 1.08 ;
		
		int priceIncludingTax = (int)( pr * SCALE_TAX ) ;
		
		return priceIncludingTax ;
		
	}
}
