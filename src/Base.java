public class Base <T>{
    private T data;

    public Base(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void display(){
        System.out.println(data);
    }
}
