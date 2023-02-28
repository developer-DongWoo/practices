public class Main {
    public static void main(String[] args) {
        Car Lambo = new Car("Lamborgini", 100);
        Person Dongwoo = new Person("동우", Lambo);
        Dongwoo.introduce();
        Dongwoo.eat();
        Dongwoo.getCar();
        Dongwoo.drive();
    }
}