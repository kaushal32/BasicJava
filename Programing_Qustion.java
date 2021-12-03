class Abc{
    String s;
    String name;
    public Abc(String s){
        name=s;
    }
    public Abc(){
        name ="I love Programming language";
    }
}
public class Programing_Question {
    public static void main(String[] args) {
        Abc obj =new Abc();
        obj.s="Java";
        System.out.println("I love " + obj.s);
        System.out.println(obj.name);
    }
}
