package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import SlimCollection.*;

import org.junit.*;


public class Tests {

	public static boolean correct(String retType, Object a, Object b) {
		

		try {
			if (retType.equalsIgnoreCase("int")) {

			} else if (retType.equalsIgnoreCase("boolean")) {

			} else if (retType.equalsIgnoreCase("Object")) {
				//Assert.assertArrayEquals(a, b);
			} else if (retType.equalsIgnoreCase("List")) {

			} else {

			}
			//Assert.assertNotNull();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	//add
	public static boolean A0() {
		System.out.print("Add");
		SlimCollection b = new SlimCollection(new ArrayList<Object>());
		Random random = new Random();

		try {
			int randNum = random.nextInt(30);
			b.add(randNum);
//			for (int i = 0; i < 40; i ++) {
//				int randNum = random.nextInt(30);
//				b.add(randNum);
//				//Assert.assertEquals(a, b);
//				//Assert.assertEquals(a.add(randNum), b.add(randNum)); //add
//				//Assert.assertEquals(a.contains(randNum), b.contains(randNum)); //contains
//				//Assert.assertEquals(a.size(), b.size()); //size
//				//Assert.assertEquals(a.isEmpty(), b.isEmpty());  //isEmpty
//				//Assert.assertArrayEquals(a.toArray(), b.getColl().toArray()); //getcoll
//			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	//add
	public static boolean A1() {
		System.out.print("Add at position");
		SlimCollection b = new SlimCollection(new ArrayList<Object>());
		Random random = new Random();
		int count = 40;

		try {
			for (int i = 0; i < count; i ++) {
				int randNum = random.nextInt(30);
				b.add(i, randNum); //
			}
			return true;
		} catch (Exception e) {
			return false;
		}


	}

	//addAll
	public static boolean A2() {
		System.out.print("AddAll ");
		ArrayList<Object> a = new ArrayList<Object>();
		SlimCollection b = new SlimCollection(new ArrayList<Object>());
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		try {
			b.addAll(a); //
			return true;
		} catch (Exception e) {
			return false;
		}


	}

	//addAll
	public static boolean A3() {
		System.out.print("AddAll at position");
		ArrayList<Object> a = new ArrayList<Object>();
		SlimCollection b = new SlimCollection(new ArrayList<Object>());
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		try {
			b.addAll(0, a); //
			return true;
		} catch (Exception e) {
			return false;
		}


	}

	//clear
	public static boolean A4() {
		System.out.print("Clear");
		ArrayList<Object> a = new ArrayList<Object>();

		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);
		try {
			b.clear(); //
			return true;
		} catch (Exception e) {
			return false;
		} 


	}

	//clone
	public static boolean A5() {
		System.out.print("Clone");
		ArrayList<Object> a = new ArrayList<Object>();

		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);
		try {
			b.clone(); //
			return true;
		} catch (Exception e) {
			return false;
		} 


	}

	//contain
	public static boolean A6() {
		System.out.print("Contains");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		Object mystery = a.get(random.nextInt(30));
		try {
			b.contains(mystery);
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//get
	public static boolean A7() {
		System.out.print("Get");
		ArrayList<Object> a = new ArrayList<Object>();

		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);
		try {
			b.get(random.nextInt(count)); //
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//indexof
	public static boolean A8() {
		System.out.print("Indexof");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		Object mystery = a.get(random.nextInt(30));
		try {
			b.indexOf(mystery);
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//isempty
	public static boolean A9() {
		System.out.print("IsEmpty?");
		SlimCollection b = new SlimCollection(new ArrayList<Object>());

		try {
			b.isEmpty();
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//lastindexof
	public static boolean A10() {
		System.out.print("lastindexof");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		Object mystery = a.get(random.nextInt(30));
		try {
			b.lastIndexOf(mystery);
			return true;
		} catch (Exception e) {
			return false;
		}


	}

	//remove object
	public static boolean A11() {
		System.out.print("remove object");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		Object mystery = a.get(random.nextInt(30));
		try {
			b.remove(mystery);
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//remove index
	public static boolean A12() {
		System.out.print("remove index");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		try {
			b.remove(random.nextInt(30));
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//removeall
	public static boolean A13() {
		System.out.print("removeall");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);
		List<Object> toRemove = a.subList(0, random.nextInt(count));
		try {
			b.removeAll(toRemove);
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	// Retainall
	public static boolean A14() {
		System.out.print("retainall");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);
		List<Object> toRetain = a.subList(0, random.nextInt(count));
		try {
			b.retainAll(toRetain);
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//set
	public static boolean A15() {
		System.out.print("set");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		try {
			b.set(random.nextInt(40), random.nextInt(30));  ////
			return true;
		} catch (Exception e) {
			return false;
		}


	}

	//size
	public static boolean A16() {
		System.out.print("size");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		try {
			b.size();  ////
			return true;
		} catch (Exception e) {
			return false;
		}


	}
	//sublist
	public static boolean A17() {
		System.out.print("sublist");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		try {
			b.subList(0, random.nextInt(30));   //////
			return true;
		} catch (Exception e) {
			return false;
		}


	}

	//getcol
	public static boolean A18() {
		System.out.print("return collection");
		ArrayList<Object> a = new ArrayList<Object>();
		Random random = new Random();
		int count = 40;
		for (int i = 0; i < count; i ++) {
			int randNum = random.nextInt(30);
			a.add(randNum);
		}
		SlimCollection b = new SlimCollection(a);

		try {
			b.getColl();  ///////
			return true;
		} catch (Exception e) {
			return false;
		}


	}



}