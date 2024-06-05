public class Derived1 extends Base <String>{
    private double data2;

    public Derived1(String data, double data2){
        super(data);
        this.data2 = data2;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(data2);
    }
}
