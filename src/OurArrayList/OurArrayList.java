package OurArrayList;

public class OurArrayList {
	private int[] array = new int[10];
	private int count = 0;
	
	public boolean add(int e) {
		//공간있으면 그냥 끝에 추가
		//부족하면 array를 new int[더크게] 할당 받아서
		//기존의 값들 모두 이사 + 새로운 값 추가
		return false;
	}
	
	public boolean add(int index, int e) {
		//원하는 index에 요소 삽입
		return false;
	}
	
	public int get(int index) {
		//해당 index의 값 있으면 리턴
		return 0;
	}
	
	public int size() {
		return 0;
	}
	
	public boolean remove(int index) {
		//삭제
		return false;
	}
}
