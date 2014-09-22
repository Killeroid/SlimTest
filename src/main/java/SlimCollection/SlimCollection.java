package SlimCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class SlimCollection {
	
	private ArrayList<Object> col;
	
	public SlimCollection(ArrayList<Object> c) {
		this.col = c;
	}
	
	public boolean add(Object o) {
		return this.col.add(o);
	}
	
	public void add(int index, Object o) {
		this.col.add(index, o);
	}
	
	public boolean addAll(Collection<? extends Object> c) {
		return this.col.addAll(c);
	}
	
	public boolean addAll(int index, Collection<? extends Object> c) {
		return this.col.addAll(index, c);
	}
	
	public void clear() {
		this.col.clear();
	}
	
	public Object clone()  {
		return this.col.clone();
	}
	
	public boolean contains(Object o)  {
		return this.col.contains(o);
	}
	
	public Object get(int index)  {
		return this.col.get(index);
	}
	
	public int indexOf(Object o)  {
		return this.col.indexOf(o);
	}
	
	public boolean isEmpty() {
		return this.col.isEmpty();
	}
	
	public int lastIndexOf(Object o) {
		return this.col.lastIndexOf(o);
	}
	
	public Object remove(Object o) {
		return this.col.remove(o);
	}
	
	public Object remove(int index) {
		return this.col.remove(index);
	}
	
	public boolean removeAll(Collection<? extends Object> c) {
		return this.col.removeAll(c);
	}
	
	public boolean retainAll(Collection<? extends Object> c) {
		return this.col.retainAll(c);
	}
	
	public Object set(int index, Object o)  {
		return this.col.set(index, o);
	}
	
	public int size() {
		return this.col.size();
	}
	
	public List<Object> subList(int fromIndex, int toIndex) {
		return this.col.subList(fromIndex, toIndex);
	}
	
	public ArrayList<Object> getColl() {
		return this.col;
	}
	
}