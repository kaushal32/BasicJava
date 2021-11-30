import java.util.Scanner;

public class Tan {
    int r;
    String b;
    public void man() {
        System.out.println(r);
        System.out.println(b);
    }

    public void nm() {
        Scanner s = new Scanner(System.in);
        b= s.nextLine();
        r= s.nextInt();
    }
    public static void main(String[] args) {
        Tan obj=new Tan();
        obj.nm();
        obj.man();
    }
}