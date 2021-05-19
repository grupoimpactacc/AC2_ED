package lista_simplesmente_encadeada;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import ex02_ex03_ex04_ac2.EmptyStackException;

public class NodeStack<E> implements Stack<E> {
	protected Node<E> top; // referência para o nodo cabeça

	protected int size; // quantidade de elementos na pilha

	public NodeStack() { // constrói uma pilha vazia
		top = null;
		size = 0;
	}

	public int size() {return size; }

	public boolean isEmpty() {
		if (top == null) return true;
		return false;
	}

	public void push(E elem) {
		Node<E> v = new Node<E>(elem, top); // cria e encadeia um nodo novo
		top = v;
		size++;
	}

	public E top() throws EmptyStackException {
		if (isEmpty()) throw new EmptyStackException("Stack is empty.");
		return top.getElement();
	}

	public E pop() throws EmptyStackException {
		Node<E> aux = top;
		
		if (isEmpty()) throw new EmptyStackException("Stack is empty.");
		E temp = top.getElement();
		top = top.getNext(); // desencadeia o nodo topo
		aux.setNext(null);
		size--;
		return temp;
	}
	
	public String toString() {
		String s;
		Node<E> p = top;
		
		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1)
			s = s.substring(0, s.length() - 2);
		
		return s + "]";
	}

	public void reverse() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("Pilha vazia...");
		
		ArrayList<E> elements = new ArrayList<E>(); // array para armazenar itens
		
		Node<E> p = top;
		while (p != null) {
			elements.add(p.getElement());
			p = p.getNext();
			pop();
		}
		
		Collections.reverse(Arrays.asList(elements));
		
		for (int i = 0; i < elements.size(); i++) {
            push(elements.get(i));
        }
	}
}
