package buihuudong.implmylist;

public interface MyList<E> extends Iterable<E> {

	public void add(E e);

	public void add(int index, E e);

	public void clear();

	public boolean contains(E e);

	public E get(int index);

	public int indexOf(E e);

	public int lastIndexOf(E e);

	public boolean isEmpty();

	public boolean remove(E e); // Remove phan tu dau tien

	public E remove(int index);

	public Object set(int index, E e); // Insert phan tu E vao vi tri index va return lai phan tu cu

	public int size();// return size of list
}
