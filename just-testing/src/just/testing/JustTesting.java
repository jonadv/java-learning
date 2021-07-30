package just.testing;

//imports just.testing.Square;

//public class JustTesting{
//   
//    private void method1(){ System.out.println("parent");}      
//    public static void method2(){ System.out.println("static parent");}
//
//    public static void main(String[] args){
//            JustTesting p = new Child();
//            p.method1(); //prints out "parent"
//            p.method2(); //prints out "static parent"
//    }
//}

//public class Child extends JustTesting { 
//    public void method1(){System.out.println("child");}     
//    public static void method2(){ System.out.println("static child");}  
//}

//interface Animal {
//    default public String identifyMyself() {
//        return "I am an animal.";
//    }
//
//    static public String identifyMyself2() {
//        return "I am able to FIRE2.";
//    }
//}
//interface EggLayer extends Animal {
//    default public String identifyMyself() {
//        return "I am able to lay eggs.";
//    }
//}
// interface FireBreather extends Animal {
//    default public String identifyMyself() {
//        return "I am able to FIRE.";
//    }
//    static public String identifyMyself2() {
//        return "I am able to FIRE2.";
//    }
//}
interface Movable{}
class Growable{}
class Animal extends Growable implements Movable {
   public static void test() {
        Object m = new Object();
        m.
        Animal x = new Animal();
        Growable gg = new Growable();
        Growable ga = new Animal();
        StringBuilder s = new StringBuilder(" ");

        String t = " ";
        System.out.println(s.is);
        x = (Animal) m;
        m = (Movable) x;
        gg = (Animal) ga; 
        gg = (Growable) ga; 
    }


}
public class JustTesting { //implements EggLayer, FireBreather {
//    public String identifyMyself() {
//        System.out.println(FireBreather.super.identifyMyself());
//        System.out.println(FireBreather.identifyMyself2());
//        return "overridden";
//    }

    ;
    public static void main (String... args) {
        Animal.test();
        
        
    }
}


//
//public interface Black {
//
//    default void getColor() {
//        System.out.print("Black");
//    }
//}
//
//public interface Red extends Black {
//
//    default void getColor() {
//        System.out.print("Red");
//    }
//}
//
//public interface Gold {
//
//    public static void getColor() {
//        System.out.print("Gold");
//    }
//}
