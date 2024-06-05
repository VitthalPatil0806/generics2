public class Derived2 <Dtype> extends Base<String> {
    private Dtype data3;

    public Derived2(String data, Dtype data3){
        super(data);
        this.data3 = data3;
    }

    public Dtype getData3() {
        return data3;
    }

    public void setData3(Dtype data3) {
        this.data3 = data3;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(data3);
    }
}
