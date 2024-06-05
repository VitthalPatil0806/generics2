public class Derived3 <Stype> extends Base <Stype>{
    private Stype data4;

    public Derived3(Stype data, Stype data4){
        super(data);
        this.data4 = data4;
    }

    public Stype getData4() {
        return data4;
    }

    public void setData4(Stype data4) {
        this.data4 = data4;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(data4);
    }
}
