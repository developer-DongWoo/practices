public class Person {

    public String name;
    private Car car;

    public Person(String name, Car car){
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void sleep(){
        System.out.println("%s 이(가) 잠을 잡니다 쿨쿨쿨");
    }

    public void eat(){
        System.out.printf("%s 이(가) 밥을 먹습니다.\n", name);
    }

    public void introduce(){
        System.out.println(String.format("안녕하세요. 저는 %s 입니다.",name));
    }

    public void drive(){
        System.out.printf("자동차는 %s 입니다.",car.getName());
        System.out.printf("연료는 %d 남아있네요\n", car.getFuelPercent());
        car.operate();
    }
}
