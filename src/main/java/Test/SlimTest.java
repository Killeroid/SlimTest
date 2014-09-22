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
	private Boolean[] results;
	
	
	public SlimTest() {
		Random random = new Random();
		int randNum = 0;
		do {
			//randNum = random.nextInt(19);
			randNum = 5;
		} while (randNum < minTests) ;
		
		this.cases = new String[5];
		this.results = new Boolean[5];
		for (int i = 0; i < 5; i++ ) {
			this.cases[i] =  "A" + random.nextInt(19);
		}
	}
	
	public void runTests() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		for (int counter = 0; ;counter++) {
			System.out.println("\n -----Starting Round " + counter + " of Tests-----\n");
			long startTime = System.currentTimeMillis();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			for (int i = 0; i < this.cases.length; i++ ) {
				String methodName = this.cases[i];
				Method[] methods = Tests.class.getMethods();
				for (Method m : methods) {
				    if (methodName.equals(m.getName())) {
				        // for static methods we can use null as instance of class
				    	System.out.print("Tests." + methodName + "() ==>> ");
				        boolean result = (Boolean) m.invoke(null, null);
				        System.out.print(" : " + result + "\n");
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
	
	public static void main(String[] args) {
		System.out.println("Starting SLimCollection Tests\n");
		String nameOfRunningVM = ManagementFactory.getRuntimeMXBean().getName();
		int p = nameOfRunningVM.indexOf('@');
		System.out.println("Starting SlimTest as PID: " + nameOfRunningVM.substring(0, p));
		try {
			SlimTest testor = new SlimTest();
			testor.runTests();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}