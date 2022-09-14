public class Section14 {
	public static void main (String[] args) {

		final String MESSAGE_A       = "あなたは几帳面な性格の方ですね？";
		final String MESSAGE_B       = "あなたはマイペースな性格の方ですね？";
		final String MESSAGE_O       = "あなたは大雑把な性格の方ですね？";
		final String MESSAGE_AB      = "あなたは天才肌な方ですね？";
		final String MESSAGE_DEFAULT = "数字の1~4で答えてください";

		int bloodTypeNumber = Integer.parseInt(args[0]) ;

		switch(bloodTypeNumber){
			case 1:
				System.out.println(MESSAGE_A);
				break;
			
			case 2:
				System.out.println(MESSAGE_B);
				break;
			
			case 3:
				System.out.println(MESSAGE_O);
				break;
			
			case 4:
				System.out.println(MESSAGE_AB);
				break;
			
			default:
				System.out.println(MESSAGE_DEFAULT);
				break;
		}
	}
}