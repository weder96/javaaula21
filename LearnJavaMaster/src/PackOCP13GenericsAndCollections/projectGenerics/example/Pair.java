package PackOCP13GenericsAndCollections.projectGenerics.example;

public class Pair<T, U, S> {
	private final T first;
	private final U second;
	private final S thr;
	
	public Pair(T first, U second,S thr) { 
		this.first=first; 
		this.second=second; 
		this.thr=thr; 
	}
	
	public T getFirst() { return first; }
	public U getSecond() { return second; }
	public S getThr() { return thr; }
}
