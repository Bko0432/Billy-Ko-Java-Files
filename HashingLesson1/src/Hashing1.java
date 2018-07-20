
public class Hashing1 {
private HashEntry[] elementData;
private int size = 0;
//Constructs an empty set
public Hashing1() {
	elementData = new HashEntry[10];
}
private int hashFunction(int value){
	return Math.abs(value) % elementData.length;
	
}
private class HashEntry {
	private int data;
	private HashEntry next;
	
public HashEntry(int data) {
	this(data,null);
}	
public HashEntry(int data, HashEntry next){
	this.data = data;
	this.next = next;
}

}

public boolean contains(int value){
	int bucket = hashFunction(value);
	HashEntry current = elementData[bucket];
	while(current != null){
		if(current.data == value){
			return true;
		}
		current = current.next;
	}
	return false;
}

public void add(int value){

	if(!contains(value)){
		// insert new value at front of list
		int bucket = hashFunction(value);
		elementData[bucket] = new HashEntry(value, elementData[bucket]);
		size++;
		
	}
}

public void remove(int value){
	int bucket = hashFunction(value);
	if(elementData[bucket] != null){
		//check front of list
		if (elementData[bucket].data == value) {
			elementData[bucket] = elementData[bucket].next;
			size --;
			
		}else{
			// check rest of list
			HashEntry current = elementData[bucket];
			while (current.next != null && current.next.data != value){
				current = current.next;
			}
		// if the element is found, remove it
			if (current.next != null){
				current.next = current.next.next;
				size --;
			}
		}
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
