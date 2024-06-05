public class Derived4 <Dtype,Btype> extends Base <Btype>{
    private Dtype data5;

    public Derived4(Btype data, Dtype data5){
        super(data);
        this.data5 = data5;
    }

    public Dtype getData5() {
        return data5;
    }

    public void setData5(Dtype data5) {
        this.data5 = data5;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(data5);
    }
}
