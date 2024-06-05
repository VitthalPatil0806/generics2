public class Derived extends Base{
    private int data1;

    public Derived(Object data,int data1){
        super(data);
        this.data1 = data1;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public void display(){
        super.display();
        System.out.println(data1);
    }
}
