public interface Tree<T>
{
    void insert(T item);
    void remove(T item);
    boolean find(T item);
}
