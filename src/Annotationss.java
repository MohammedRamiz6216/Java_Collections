import java.util.*;
class C{
    void shows(){
        System.out.println("This a class A");
    }
}

class D extends C
{
    @Override
    public void shows(){
        System.out.println("This is a Class B");
    }
}
public class Annotationss {
    public static void main(String[] args) {
        D obj = new D();
        obj.shows();
    }
}
