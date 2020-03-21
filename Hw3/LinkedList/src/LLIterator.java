import java.util.Iterator;
import java.util.List;

public class LLIterator<T> implements Iterator<T> {
    protected Node node;

    LLIterator(Node node){
        this.node=node;
    }

    public boolean hasNext(){
        return node!=null;
    }

    public T next() {
        try {
            T t = (T)node.getNext();
            node=node.getNext();
            return t;
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new java.util.NoSuchElementException();
        }
    }

}
