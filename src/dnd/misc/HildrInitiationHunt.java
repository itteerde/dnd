package dnd.misc;

public class HildrInitiationHunt {

	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public static int d(int n) {
		return getRandomNumber(1, n);
	}

	public static int dAdvantage(int n) {
		int a = d(n);
		int b = d(n);
		return a > b ? a : b;
	}

	public static void main(String[] args) {

		int hHP = 15;
		int hToHit = 0;
		int bHP = 41;
		int bToHit = 7;

		int won = 0;
		int runs = 10000000;
		for (int n = 0; n < runs; n++) {

			char turn = d(20) + 2 > d(20) ? 'h' : 'b';
			int hCHP = hHP;
			int bCHP = bHP;

			for (;;) {
				if (turn == 'h') {
					int attack = dAdvantage(20);
					if (attack > 11) {
						if (attack == 20) {
							bCHP -= d(10) + d(10) + 2 + 3 + 10;
							attack = dAdvantage(20);
							if (attack == 20) {
								bCHP -= d(10) + d(10) + 2 + 3 + 10;
							} else {
								bCHP -= d(10) + 2 + 3 + 10;
							}
						} else {
							bCHP -= d(10) + 2 + 3 + 10;
						}
					}
					turn = 'b';
				} else {
					int attack = d(20) + 7;
					if (attack > 13) {
						if (attack == 20) {
							hCHP -= d(8) + d(8) + 5;
						} else {
							hCHP -= d(8) + 5;
						}
					}
					attack = d(20) + 7;
					if (attack > 13) {
						if (attack == 20) {
							hCHP -= d(6) + d(6) + d(6) + d(6) + 5;
						} else {
							hCHP -= d(6) + d(6) + 5;
						}
					}
					turn = 'h';
				}
				if (hCHP < 1 || bCHP < 1) {
					if (bCHP < 1) {
						won++;
					}
					break;
				}
			}

		}
		double res = (double) won / (double) runs;
		System.out.println(res);

	}

}
