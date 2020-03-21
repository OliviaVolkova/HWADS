import java.util.Objects;
import java.util.Arrays;

public class Multiset<T> {
    protected Element[] elements;
    int cursor;


    Multiset(Element[] elements,int cursor){
        elements=new Element[100];
        cursor=0;
    }
    Multiset(){

    }


    public void add(Object e) {
        if (contains(e)) {
            for (int i = 0; i <= cursor; i++) {
                if (e == elements[i].object) {
                    elements[i].amount++;
                }
            }
        }
        elements[cursor].object = e;
        elements[cursor].amount++;
        cursor++;
    }
    public void add(Object e,int amount) {
        if (contains(e)) {
            for (int i = 0; i <= cursor; i++) {
                if (e == elements[i].object) {
                    elements[i].amount += amount;
                }
            }
        }
        for (int i = cursor; i < amount; i++) {
            elements[i].object = e;
            elements[i].amount++;
        }
    }

    public boolean contains(Object e){
    boolean fl =false;
    for (int i=0;i<elements.length;i++){
        if (elements[i].object==e){
            fl=true;
            break;
        }
        else fl=false;
    }
    return fl;
    }

    public int size(){
    return cursor;
    }

    public void delete(Object e){
    if (contains(e)) {
        for (int i = 0; i < cursor; i++) {
            if (e == elements[i].object) {
                elements[i].amount--;
            }
        }
    }
        for(int i=getIndex(e);i<elements.length;i++){
            elements[i]=elements[i+1];
            cursor--;
        }
    }
    protected int getIndex(Object e){
    for (int i = 0; i < cursor; i++) {
        if (elements[i].object.equals(e)) {
            return i;
        }
    }
    return -1;
    }
    public int count(Object e){
        int t=0;
        if(contains(e)){
            for(int i=0;i<elements.length;i++){
                if (elements[i]==e){
                 t=elements[i].amount;
                }
            }
        }
        return t;
    }
    public boolean equals(Multiset t){
        boolean fl=false;
        for (int i = 0; i < cursor; i++) {
            if (elements[i].object.equals(this.elements[i])) {
                fl=true;
                break;
            }
        }
        return fl;
    }
}
