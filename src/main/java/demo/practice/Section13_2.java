class Section13_2 {
	public static void main (String[] args) {

		int receiveNumber = Integer.parseInt(args[0]);
		int calcNumber = receiveNumber;
		
		if (receiveNumber < 0 || receiveNumber == 0 || receiveNumber == 1) {
			System.out.println("「適切な値を入力してください」");
		} else {
			
			while (calcNumber < 100) {
				System.out.println("calcNumber：" + calcNumber);
				calcNumber *= receiveNumber;
			}
		}
	}
}
