package exercise6;

public class Pair <T> {
	
	private T first;
	
	private T second;
	
	public T getFirst(){
		return first;
	}
	
	public T getSecond(){
		return second;
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

}
