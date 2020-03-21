import java.util.Arrays;
import java.util.Objects;

public class Set<T> {
    protected Object[] data;
    protected int count;

    public Set(){
        data=new Object[1000];
        count=0;
    }

    public void add(T e){
        if(!has(e)) {
            if(count==data.length){
                data= Arrays.copyOf(data,data.length*2);
            }
            data[count]=e;
            count++;
        }
    }
    public boolean has(T e) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
    public int size(){
        return count;
    }
    public void delete(T e){
        int ind=getIndex(e);
        if(ind!=-1){
            if (ind < count - 1) {
                for (int i = ind; i < count-1; i++) {
                data[i]=data[i+1];
                }
            }
            count--;
        }
    }
    protected int getIndex(T e){
        for (int i = 0; i < count; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    public Set merge(Set data2){
        Set t=new Set();
        for(int i=0;i<count;i++){
            t.add(data[i]);
        }
        for(int i=0;i<data2.count;i++){
            t.add(data2.data[i]);
        }
        return t;
    }
}

