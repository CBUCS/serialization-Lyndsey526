/*
Lyndsey Wilson
ID#684781

 */
public class Queue<T>
{
    private LinkedList<T> queue;

    public Queue()
    {
        queue = new LinkedList<T>();
    }

    public void enqueue(T item)
    {
        queue.insertLast(item);
    }

    public T dequeue()
    {
        return queue.removeFirst();
    }

    public T front()
    {
        return queue.getFirst();
    }

    public T back()
    {
        return queue.getLast();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
}
