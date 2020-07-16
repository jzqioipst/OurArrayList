package OurArrayList;

public class OurArrayList<T> {
	@SuppressWarnings("unchecked")
	private T[] array = (T[])new Object[5];
	private int count = 0;
	
	@SuppressWarnings("unchecked")
	public boolean add(T e) {
		if(count==array.length) {
			T [] newArray = (T[])new Object[count*2];
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
	
	public void add(int index, T e) {
		add(array[count-1]);
		for(int i = count-2; i>index; i--) {
			array[i] = array[i-1];
		}
		array[index] = e;
	}

	
	public T get(int index) {
		return array[index];
	}
	
	public int size() {
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public boolean remove(int index) {	
		if (count == 0 || index < 0 || count <= index) {
			return false;
		}
		
		T[] newArray = null;
		if ((count - 1) < (int)(array.length * (1/(double)3))) {
			newArray = (T[])new Object[array.length / 2];
			for (int i = 0; i < index; i++) {
				newArray[i] = array[i];
			}
		}
		
		for (int i = index; i < count - 1; i++) {
			if (newArray == null) {
				array[i] = array[i + 1];
			} else {
				newArray[i] = array[i + 1];
			}			
		}
		if (newArray != null) {
			array = newArray;
		}
		count--;
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('[');
		for (int i = 0; i < count; i++) {
			builder.append(array[i]);
			if (i < count - 1) {
				builder.append(", ");
			}			
		}
		builder.append(']');
		return builder.toString();
	}
}
