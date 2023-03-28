package testPackage;

import java.util.*;

public class TestClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\JavaLibraries\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.chrome.driver","D:\\JavaLibraries\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://agileteach.com/");

		// tempreture conversion

//		System.out.println(isequal());
//		TempConversion obj = new TempConversion();
//		obj.tempConv();

//		ArrAy with keybrd input

		int[] newArr = new int[5];

		for (int i = 0; i <= 4; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Array Element for index: " +i);
			newArr[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(newArr));
//		check element if its in the rry
		for (int j = 0; j <= 4; j++) {
			if (newArr[j] == 51) {
				System.out.println("51 is available in this array");
			} else {
				System.out.println("51 isn't available here");
			}
			break;
		}

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(15);
		intList.add(25);
		intList.add(8);
		intList.add(6);
		System.out.println("the index of 25 is: " + intList.indexOf(25));

		Set<Double> dblSet = new HashSet<Double>();
		dblSet.add(0.225646);
		dblSet.add(1.225646);
		dblSet.add(5.225646);
		dblSet.add(4.225646);
		dblSet.add(3.225646);
		System.out.println(dblSet);

	}

//		isequal test
	public static boolean isequal() {
		int x = 6, y = 6, z;
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}
}

