package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ex08_ac2.ArrayQueue;
import ex08_ac2.EmptyQueueException;
import ex08_ac2.FullQueueException;

class ArrayQueueTest {
	Object o;
	static final ArrayQueue<Integer> a = new ArrayQueue<Integer>(3);
	@Test
	void test() throws FullQueueException, EmptyQueueException {
		assertEquals("[]", a.toString(), "Fila vazia");
		a.enqueue(1);
		assertEquals("[1]", a.toString(), "Deve ser igual a [1]");
		a.enqueue(2);
		assertEquals("[1, 2]", a.toString(), "Deve ser igual a [1, 2]");
		assertThrows(FullQueueException.class, () -> {a.enqueue(3);});
		assertEquals(1, a.dequeue(), "Deve resultar 1");
		assertEquals(2, a.dequeue(), "Deve resultar 2");
	}
}
