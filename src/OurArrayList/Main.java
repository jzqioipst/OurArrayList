package OurArrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		OurArrayList arr = new OurArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.print();
		arr.add(1,9);
		arr.print();
	}
}
