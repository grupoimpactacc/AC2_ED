package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ex02_ex03_ex04_ac2.EmptyStackException;
import lista_simplesmente_encadeada.NodeStack;

class NodeStackTest {
	Object o;
	static final NodeStack<Integer> a = new NodeStack<Integer>();
	static final NodeStack<Integer> b = new NodeStack<Integer>();
	
	@Test
	void pilhaInteiros() {
		a.push(7);
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		a.push(9);
		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");
		a.push(1);
		assertEquals("[1, 9, 7]", a.toString(), "Deve imprimir [1, 9, 7]");
		assertEquals(1, a.pop(), "Deve ter desempilhado 1");
		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");
		assertEquals(9, a.pop(), "Deve ter desempilhado 9");
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		assertEquals(7, a.pop(), "Deve ter desempilhado 7");
		assertEquals("[]", a.toString(), "Deve imprimir []");
		assertTrue(a.isEmpty());
		assertThrows(EmptyStackException.class, () -> { a.pop(); });
	}
	
	@Test
	void pilhaInteirosReversa() {
		b.push(1);
		b.push(2);
		b.push(3);
		b.push(4);
		b.push(5);
		assertEquals("[5, 4, 3, 2, 1]", b.toString(), "Deve imprimir [5, 4, 3, 2, 1]");
		b.reverse();
		assertEquals("[1, 2, 3, 4, 5]", b.toString(), "Deve imprimir [1, 2, 3, 4, 5]");
	}
}
