package OurArrayList;

public class Main {
	public static void main(String[] args) {
		OurArrayList<Integer> arr = new OurArrayList<>();
		System.out.println("-----------------------------------");
		System.out.println("add 메소드 기본 기능 테스트");
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1,9);
		System.out.println(arr);
		
		
		System.out.println("-----------------------------------");
		System.out.println("add 메소드 메모리 확장 테스트");
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		System.out.println(arr);
		
		
		System.out.println("-----------------------------------");
		System.out.println("size 메소드 테스트");
		System.out.println("현재 요소 개수 : " + arr.size());
		
		
		System.out.println("-----------------------------------");
		System.out.println("remove 메소드 기본 기능 테스트");
		System.out.println("가장 첫번째 요소 제거");
		arr.remove(0);
		System.out.println(arr);
		
		
		System.out.println("-----------------------------------");
		System.out.println("remove 메소드 기본 기능 테스트");
		System.out.println("가장 마지막 요소 제거");
		arr.remove(arr.size() - 1);
		System.out.println(arr);
		
		
		System.out.println("-----------------------------------");
		System.out.println("remove 메소드 기본 기능 테스트");
		System.out.println("가운데 요소 제거");
		arr.remove(3);
		System.out.println(arr);
		
		
		System.out.println("-----------------------------------");
		System.out.println("remove 메소드 메모리 축소 테스트");
		for (int i = 0; i < 4; i++) {
			arr.remove(0);
		}
		System.out.println(arr);
		
		
		System.out.println("-----------------------------------");
		System.out.println("remove 모든 요소 삭제 테스트");
		arr.remove(0);
		System.out.println(arr);		
		
		
		System.out.println("-----------------------------------");
		System.out.println("모든 요소 삭제 후 다시 메모리확장 add 테스트");
		arr.add(7);
		arr.add(8);
		arr.add(9);
		System.out.println(arr);
		
		
		OurArrayList<String> arrStr = new OurArrayList<>();		
		System.out.println("-----------------------------------");
		System.out.println("String 객체를 담아보는 테스트");		
		arrStr.add("양희영");
		arrStr.add("이재형");
		arrStr.add("김문희");
		arrStr.add("김용수");
		System.out.println(arrStr);
		
		
		System.out.println("-----------------------------------");
		System.out.println("String 객체를 지워보는 테스트");
		for (int i = 0; i < 4; i++) {
			arrStr.remove(0);
		}		
		System.out.println(arrStr);	
	}
}
