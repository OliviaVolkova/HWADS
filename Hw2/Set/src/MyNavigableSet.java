import java.util.*;

public class MyNavigableSet<T> extends AbstractSet<T> implements NavigableSet<T> {

    Comparator<T> comparator;
    ArrayList<T> array;

    MyNavigableSet(Comparator<T> comparator, ArrayList<T> array){
        this.comparator=comparator;
        array= new ArrayList<>();
    }
    MyNavigableSet(ArrayList<? extends Comparable> array){
        this.array= new ArrayList<T>((ArrayList <? extends T>) array);
    }
    public boolean add(T e){
        boolean fl=false;
        if(has(e)){
            fl=false;
        }
        if(!has(e)) {
            fl = true;
            array.add(e);
        }
        return fl;
    }

    public boolean has(T e){
        boolean fl=false;
        for(int i=0;i<array.size();i++){
            if(array.get(i).equals(e)){
                fl=true;
            }
        }
        return fl;
    }

    @Override
    public T lower(T t) {
        return null;
    }

    @Override
    public T floor(T t) {
        return null;
    }

    @Override
    public T ceiling(T t) {
        return null;
    }

    @Override
    public T higher(T t) {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public NavigableSet<T> descendingSet() {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }

    @Override
    public NavigableSet<T> subSet(T t, boolean b, T e1, boolean b1) {
        return null;
    }

    @Override
    public NavigableSet<T> headSet(T t, boolean b) {
        return null;
    }

    @Override
    public NavigableSet<T> tailSet(T t, boolean b) {
        return null;
    }

    @Override
    public Comparator<? super T> comparator() {
        return null;
    }

    @Override
    public SortedSet<T> subSet(T t, T e1) {
        return null;
    }

    @Override
    public SortedSet<T> headSet(T t) {
        return null;
    }

    @Override
    public SortedSet<T> tailSet(T t) {
        return null;
    }

    @Override
    public T first() {
        return null;
    }

    @Override
    public T last() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
