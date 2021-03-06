package ex08_ac2;

public interface Queue<E> {

	public int size();

	public boolean isEmpty();

	public E front() throws EmptyQueueException;

	public void enqueue(E element);

	public E dequeue() throws EmptyQueueException;
}
