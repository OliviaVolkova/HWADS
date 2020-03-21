import java.util.Arrays;

public class Stack {
    public int[] array;
    public int count;

    public Stack(){
        array=new int[100];
        count=0;
    }

    public void add(int num){
        if(num>=array.length){
            array=Arrays.copyOf(array,array.length*2);
        }
        array[count]=num;
        count++;
    }

    public int pop(){
        count--;
        return count;
    }

    public int peek(){
        return count;
    }

    public int size(){
    return count;
    }
}
