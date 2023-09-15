package ch13.sec01.exam03;

public class Box <T> {

	public T content; // 타입파라미터 지정 안 하면, Object
	
	public boolean compare(Box<T> other) { // 타입파라미터 지정 안 하면, compare(Box other)
		boolean result = content.equals(other.content);
		return result;
	}
}
