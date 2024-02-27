import java.util.*;
@FunctionalInterface
interface A{
    void show();
}
//class B implements A{
//   public void show(){
//        System.out.println("This is a show");
//    }
//}
public class FunctionalIn {
    public static void main(String[] args) {
        A obj =() -> System.out.println("This is a Showw");

        obj.show();
    }
}
