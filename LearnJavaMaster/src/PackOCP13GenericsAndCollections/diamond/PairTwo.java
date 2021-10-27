package PackOCP13GenericsAndCollections.diamond;

public class PairTwo<T, U>
{
    private T first;
    private U second;
    public PairTwo() { first = null; second = null; }
    public PairTwo(T first, U second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(U newValue) { second = newValue; }
}