package OurArrayList;

public class OurArrayList {
	private int[] array = new int[10];
	private int count = 0;
	
	public boolean add(int e) {
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
