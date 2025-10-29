package hw4;

public class ArrayPlanet {

	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int vowelCount = 0; 
		
		// 外層：走訪每個行星名稱
		for (String planet : planets) {
			// 內層：走訪字串中的每個字元
			for (int i = 0; i < planet.length(); i++) {
				char ch = planet.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				}
			}
		}

		System.out.println("八大行星中共有 " + vowelCount + " 個母音。");
	}
}
