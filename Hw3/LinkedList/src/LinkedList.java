import java.util.Iterator;
import java.util.Objects;

public class LinkedList<T>{
    private Node head;
    private Node last;
    private int count;

    public LinkedList(){
        head=null;
        count=0;
        last=null;
    }

    public void addLast(T e){
        Node node= new Node(e);
        if(count==0){
            head=node;
            node.setNext(null);
            last=head;
        }
        else{
            last.setNext(node);
            last=last.getNext();
        }
        count++;
    }
    private Node get(int e){
        if(e>=count||e<0)throw new IndexOutOfBoundsException();
        Node n=head;
        for(int i=0;i<e;i++){
            n=head.getNext();
        }
        return n;
    }


    public int size(){
        return count;
    }

    public Iterator<T> iterator(){
        return new LLIterator(head);
    }


    public int indexOf(T e){
        int ind=-1;
        Node n=head;
        for(int i=0;i<count;i++){
            if(e.equals(n.getData())){
                ind=i;
            }
            n=head.getNext();
        }
        return ind;
    }

    public void addFirst(T e){
        Node node= new Node(e);
        if(count==0){
            head=node;
            node.setNext(null);
            last=head;
        }
        else{
            node.setNext(head);
            head=node;
        }
        count++;
    }

    public void addAfter(T e, int ind) throws Exception {
        Node node= new Node(e);
        if(count==0){ throw new Exception("Incorrect inquiry");
        }
        else{
            node.setNext(get(ind).getNext());
            get(ind).setNext(node);
        }
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedList<?> that = (LinkedList<?>) o;
        return count == that.count &&
                Objects.equals(head, that.head) &&
                Objects.equals(last, that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, last, count);
    }

    public void remove(T e){

    }

    public void remove(int ind){
        get(ind-1).setNext(get(ind+1));
    }

    public LinkedList merge (LinkedList l1, LinkedList l2){
        l1.last=l2.head;
        LinkedList ll=new LinkedList();
        for(int i=0;i<(l1.count+l2.count)-2;i++){
            ll.addLast(l1.get(i));
        }
        return l1;
    }
}
