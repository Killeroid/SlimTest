package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

public class SlimTest {


	private int minTests = 1;
	private String[] cases;


	public SlimTest() {
		Random random = new Random();
		int randNum = 0;
		do {
			//randNum = random.nextInt(19);
			randNum = 5;
		} while (randNum < minTests) ;

		this.cases = new String[5];
		for (int i = 0; i < 5; i++ ) {
			this.cases[i] =  "A" + random.nextInt(19);
		}
	}

	public void runTests() {
		Method[] methods = Tests.class.getMethods();
		for (int counter = 0; ;counter++) {
			System.out.println("\n -----Starting Round " + counter + " of Tests-----\n");
			long startTime = System.currentTimeMillis();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < this.cases.length; i++ ) {
				String methodName = this.cases[i];

				for (Method m : methods) {
					if (methodName.equals(m.getName())) {
						System.out.print("Tests." + methodName + "() ==>> ");
						try {
							boolean result;
							result = (Boolean) m.invoke(Tests.class, new Object[] {});
							System.out.print(" : " + result + "\n");
						} catch (IllegalAccessException e) {
							System.out.print(" : FAILED\n");
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							System.out.print(" : FAILED\n");
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							System.out.print(" : FAILED\n");
							e.printStackTrace();
						}
						break;
					}
				}

			}
			while ((System.currentTimeMillis() - startTime) < (3 * 1000)) {
				try {
					if (in.ready()) {
						System.out.println("\nExiting Application");
						System.exit(0);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}	
		}
	}

	public void runTests(int numCases) {
		Random random = new Random();
		for (int counter = 0; ;counter++) {
			System.out.println("\n -----Starting Round " + counter + " of Tests-----\n");
			long startTime = System.currentTimeMillis();

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			for (int i = 0; i < numCases; i++ ) {
				String methodName = "A" + random.nextInt(19);;

				System.out.print("Tests." + methodName + "() ==>> ");
				try {
					Method m2 = Tests.class.getDeclaredMethod(methodName, new Class<?>[] {});
					boolean result;
					result = (Boolean) m2.invoke(Tests.class, new Object[] {});
					System.out.print(" : " + result + "\n");
				} catch (NoSuchMethodException e1) {
					System.out.print(" : FAILED ***************\n");
					//e.printStackTrace();
				} 
				//break;
				catch (IllegalAccessException e) {
					System.out.print(" : FAILED ***************\n");
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					System.out.print(" : FAILED ***************\n");
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					System.out.print(" : FAILED ***************\n");
					e.printStackTrace();
				}



			}
			while ((System.currentTimeMillis() - startTime) < (3 * 1000)) {
				try {
					if (in.ready()) {
						System.out.println("\nExiting Application");
						System.exit(0);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}	
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting SlimCollection Tests\n");
		String nameOfRunningVM = ManagementFactory.getRuntimeMXBean().getName();
		int p = nameOfRunningVM.indexOf('@');
		System.out.println("Starting SlimTest as PID: " + nameOfRunningVM.substring(0, p));
		try {
			SlimTest testor = new SlimTest();
			testor.runTests(5);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}