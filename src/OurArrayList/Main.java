package OurArrayList;

public class Main {
	public static void main(String[] args) {
		OurArrayList arr = new OurArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1,9);
		System.out.println(arr);
		
		arr.remove(0);
		System.out.println(arr);
		
		arr.remove(2);
		System.out.println(arr);
		
		arr.add(7);
		arr.add(8);
		arr.add(7);
		System.out.println(arr);
		
		arr.remove(2);
		System.out.println(arr);
	}
}
