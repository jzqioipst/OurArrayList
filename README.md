# OurArrayList
Java의 ArrayList를 흉내내어 만든 클래스입니다.  
  
ArrayList는 동적배열 구조이기 때문에 random access가 가능하여 데이터 조회속도가 매우 빠릅니다.  
그렇기에 특정 index로 조회가 빈번한 상황에서 사용하기에 좋습니다.
  
하지만 데이터를 추가하거나 삭제함에 있어 뒷쪽의 모든 데이터들을 밀거나 당겨야하는 단점이 있습니다.  
특히 가장 첫 번째 데이터를 추가하거나 삭제할 때가 그렇습니다. (시간복잡도 O(N))  
그렇기에 특히 Queue같은 자료구조를 만들 경우는 ArrayList보단 LinkedList를 사용하길 권장합니다.

### add(int e)
e값을 마지막 인덱스 뒤로 추가해줍니다.
만약 할당된 메모리가 부족하여 추가할 수 없다면 메모리크기를 현재 크기의 2배로 늘려주시고 값을 추가해주시면 됩니다.
이 때, 기존의 값들은 새로 할당된 메모리로 모두 옮겨집니다.

### add(int index, int e)
기본적으로 add(int e)와 같습니다.
다만 끝에 요소(element)를 추가하지 않고 index에 요소를 추가해줍니다.
ex)
[0, 1, 2, 3]
add( 2, 99);
[0, 1, 99, 2, 3]

### get(int index)
배열에서 index의 요소를 반환(return)해줍니다.

### size()
전체 요소의 개수를 리턴해주면 됩니다.

### remove(int index)
해당 index의 값을 삭제하고 뒤에 있는 값들을 삭제한 자리로 당겨줍니다.
만약 전체 메모리의 1/3이하를 사용하게 된다면 메모리 크기를 현재 크기의 절반으로 낮춰줍니다.
이 경우 기존의 값들은 새로 할당한 메모리로 옮겨집니다.

### toString()
배열의 모든 요소들을 String에 담아 반환해줍니다.