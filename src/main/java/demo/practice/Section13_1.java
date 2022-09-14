class Section13_1 {
	public static void main (String[] args) {
		
		int testScore = Integer.parseInt(args[0]);

		if (!(testScore >= 0 && testScore <= 100)) {
			System.out.println("「不正な点数です！」");
		} else if (testScore >= 0 && testScore <= 59) {
			System.out.println("「赤点です！」");
		} else if (testScore >= 60 && testScore <= 79) {
			System.out.println("「普通です！」");
		} else if (testScore >= 80 && testScore <= 100) {
			System.out.println("「優秀です！」");
		}

		if (testScore == 100) {
			System.out.println("「満点だったので宿題免除です！！」");
		}
	}
}
