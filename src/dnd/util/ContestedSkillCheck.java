package dnd.util;

public class ContestedSkillCheck {

	public static void main(String[] args) {
		System.out.println(successesSASA(0, 0));

	}

	public static int successesSASA(int a, int b) {
		int s = 0;

		for (int iA = 1; iA <= 20; iA++) {
			for (int jA = 1; jA <= 20; jA++) {
				for (int kA = 1; kA <= 20; kA++) {
					for (int iB = 1; iB <= 20; iB++) {
						for (int jB = 1; jB <= 20; jB++) {
							for (int kB = 1; kB <= 20; kB++) {
								int mA = iA;
								if (jA > mA) {
									mA = jA;
								}
								if (kA > mA) {
									mA = kA;
								}
								int mB = iB;
								if (jB > mB) {
									mB = jB;
								}
								if (kB > mB) {
									mB = kB;
								}

								if (mA > mB) {
									s++;
								}
							}
						}
					}
				}
			}
		}

		return s;
	}

}
