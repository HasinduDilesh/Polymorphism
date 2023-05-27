public class GrandFather {
    void swim() {
        System.out.println("Swimming!");
    }
}
class Father extends GrandFather{
    void swim() {
        System.out.println("Swimming in river!");
    }
}
class Son extends Father{
    void swim() {
        System.out.println("Swimming in pool!");
    }

    public static void main(String[] args) {

        GrandFather gf,f,s;

        gf = new GrandFather();
        f = new Father();
        s = new Son();
        
        gf.swim();
        f.swim();
        s.swim();
    }
}
