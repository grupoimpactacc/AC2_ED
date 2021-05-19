package ex01_ac2;

public interface IndexList<E> {
	// Retorna o tamanho do ArrayListIndex
	public int size();
	// Verifica se o Array esta vazio.
	public boolean isEmpty();
	// Adiciona no indice i o elemento e do tipo E
	public void add(int i, E e) throws IndexOutOfBoundsException;
	// Retorna o elemento de tipo E que está no indice i
	public E get(int i) throws IndexOutOfBoundsException;
	// Remove o elemento de tipo E que esta no indice i
	public E remove(int i) throws IndexOutOfBoundsException;
	// Insere o elemento e de tipo E no indice i e retorna o ultimo valor que la estava
	public E set(int i, E e) throws IndexOutOfBoundsException;
}
