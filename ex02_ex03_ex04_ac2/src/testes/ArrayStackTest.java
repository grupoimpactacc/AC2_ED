package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ex02_ex03_ex04_ac2.ArrayStack;
import ex02_ex03_ex04_ac2.EmptyStackException;
import ex02_ex03_ex04_ac2.FullStackException;

class ArrayStackTest {
	static final ArrayStack<Integer> a = new ArrayStack<Integer>(3);
	@Test
	void pilhaInteiros() {
		a.push(7);
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		a.push(9);
		assertEquals("[7, 9]", a.toString(), "Deve imprimir [7, 9]");
		a.push(1);
		assertEquals("[7, 9, 1]", a.toString(), "Deve imprimir [7, 9, 1]");
		Assertions.assertThrows(FullStackException.class, () -> { a.push(2); });
		assertEquals(1, a.pop(), "Deve ter desempilhado 1");
		assertEquals("[7, 9]", a.toString(), "Deve imprimir [7, 9]");
		assertEquals(9, a.pop(), "Deve ter desempilhado 9");
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		assertEquals(7, a.pop(), "Deve ter desempilhado 7");
		assertEquals("[]", a.toString(), "Deve imprimir []");
		assertTrue(a.isEmpty());
		Assertions.assertThrows(EmptyStackException.class, () -> { a.pop(); });
	}
	
	static final ArrayStack<String> b = new ArrayStack<String>(4);
	@Test
	void pilhaString() {
		b.push("faculdade");
		assertEquals("[faculdade]", b.toString(), "Deve imprimir [faculdade]");
		b.push("impacta");
		b.push("de");
		b.push("tecnologia");
		assertEquals("[faculdade, impacta, de, tecnologia]", b.toString(), "Deve imprimir [faculdade, impacta, de, tecnologia]");
		assertEquals("tecnologia", b.pop(), "Deve ser desempilhado tecnologia");
		assertEquals("[faculdade, impacta, de]", b.toString(), "Deve imprimir [faculdade, impacta, de]");
		assertFalse(b.isEmpty());
		assertEquals("de", b.top(), "Deve retorna de");
		assertEquals(3, b.size(), "Deve ser size = 3");
	}
}