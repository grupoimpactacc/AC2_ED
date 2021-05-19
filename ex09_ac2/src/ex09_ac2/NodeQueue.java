package ex09_ac2;

public class NodeQueue<E> implements Queue<E> {
	private Node<E> head; // mais recente
	private Node<E> tail; // mais antigo
	private int size;

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public E front() {
		return (E) head.getNext();
	}

	public void enqueue(E elem) {
		Node<E> node = new Node<E>();
		node.setElement(elem);
		node.setNext(null);
		if (size == 0)
			head = node; 
		else
			tail.setNext(node); 
		tail = node; 
		size++;
	}

	@SuppressWarnings("unchecked")
	public E dequeue() throws EmptyQueueException {
		if (size == 0) throw new EmptyQueueException("Lista vazia");
		E tmp = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return tmp;
	}
	
	@SuppressWarnings("unchecked")
	public String toString() {
		String s;
		Node<E> p = head; 
		
		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1) s = s.substring(0, s.length() - 2);
		return s + "]";
	}
}
