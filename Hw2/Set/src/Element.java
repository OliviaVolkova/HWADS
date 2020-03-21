public class Element<T> {

    protected Object object;
    protected int amount;

    public Element(Object object,int amount){
        this.object=object;
        this.amount=0;
    }

    public Object getObject() {
        return object;
    }

    public int getAmount(){
        return amount;
    }
}
