import java.util.Arrays;

public class Queue {
    public int[] array;
    public int begin;
    public int end;

    Queue(){
        array=new int[100];
        begin=0;
        end=0;
    }
    public void add(int num){
        if(end>=array.length){
            array= Arrays.copyOf(array,array.length*2);
        }
        array[end]=num;
        end++;
    }
    public int pop(){
        begin++;
        return array[begin-1];
    }
    public int peek(){
        return array[begin];
    }
    public int size(){
        return end-begin;
    }


}
