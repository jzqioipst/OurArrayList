package OurArrayList;

public class OurArrayList {
	private int[] array = new int[10];
	private int count = 0;
	
	public boolean add(int e) {
		//공간있으면 그냥 끝에 추가
		//부족하면 array를 new int[더크게] 할당 받아서
		//기존의 값들 모두 이사 + 새로운 값 추가
		if(count==array.length) {
			int [] newArray = new int[count*2];
			for(int i = 0; i<array.length; i++) {
				newArray[i] = array[i];
			}
			newArray[count++] = e;
			array = newArray;
		}else {
			array[count++] =  e;
		}
		return true;
	}
	
	public boolean add(int index, int e) {
		//원하는 index에 요소 삽입
		//원하는 index가 array의 사이즈보다 클 경우 false return
		//새로 하나를 추가했을 때 배열의 크기가 지정된 크기보다 커질 경우
		//현재 주어진 배열 사이즈로 충분히 담을 수 있는 경우
		//return type void
		add(array[count-1]);
		for(int i = count-2; i>index; i--) {
			array[i] = array[i-1];
		}
		array[index] = e;
		
		return false;
	}

	
	public int get(int index) {
		return array[index];
	}
	
	public int size() {
		return count;
	}
	
	public boolean remove(int index) {
		//삭제
		return false;
	}
}
