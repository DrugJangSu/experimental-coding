public class Method2 {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Method2 practice = new Method2();
        practice.sayHello("Min");
        practice.sayHello("Jisu");
    }
}
