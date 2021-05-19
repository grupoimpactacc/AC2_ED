package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ex11_ex12_ac2.NodePositionList;
import ex11_ex12_ac2.Position;

class NodePositionListTest {
	NodePositionList<Integer> a = new NodePositionList<Integer>();
	@Test
	void test() {
		assertEquals("[]", a.toString(), "[]");
		a.addFirst(1);
		assertEquals("[1]", a.toString(), "Deve ser [1]");
		Position<Integer> p = a.first();
		assertEquals(1, p.element(), "Deve ser 8");
		a.addAfter(p, 7);
		assertEquals("[1, 7]", a.toString(), "Deve ser [1, 7]");
		Position<Integer> p1 = a.next(p);
		assertEquals(7, p1.element(), "7");
		assertEquals("[1, 7]", a.toString(), "Deve ser [1, 7]");
		a.addBefore(p1, 3);
		assertEquals("[1, 3, 7]", a.toString(), "Deve ser [1, 3, 7]");
		Position<Integer> p2 = a.prev(p1);
		assertEquals(3, p2.element(), "3");
		assertEquals("[1, 3, 7]", a.toString(), "Deve ser [1, 3, 7]");
		a.reverse();
		assertEquals("[7, 3, 1]", a.toString(), "Deve ser [7, 3, 1]");
		a.addAfter(a.first(), 9);
		assertEquals("[7, 9, 3, 1]", a.toString(), "Deve ser [7, 9, 3, 1]");
		p1 = a.first();
		p2 = a.next(p1);
		a.makeFirst(p2);
		assertEquals("[9, 7, 3, 1]", a.toString(), "Deve ser [9, 7, 3, 1]");
		a.addFirst(2);
		assertEquals("[2, 9, 7, 3, 1]", a.toString(), "Deve ser [2, 9, 7, 3, 1]");
	}

}
