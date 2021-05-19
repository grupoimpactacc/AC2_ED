package ex02_ex03_ex04_ac2;

public interface Stack<E> {
	// Retorna o n�mero de elementos na pilha
	public int size();
	// @return True se a pilha � vazia, False em caso contr�rio.
	public boolean isEmpty();
	// retorna o elemento que est� no topo da pilha.
	// erro de excecao EmptyStackException se a pilha estiver vazia.
	public E top() throws EmptyStackException;
	// elemento a ser inserido.
	public void push(E element);
	// retorna elemento removido.
	// erro de excecao EmptyStackException se a pilha estiver vazia.
	public E pop() throws EmptyStackException;
}
