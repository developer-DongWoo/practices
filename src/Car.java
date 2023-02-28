public class Car {
    private String name;
    private int fuelPercent;

    public Car(String name, int fuelPercent) {
        this.name = name;
        this.fuelPercent = fuelPercent;
    }

    public String getName() {
        return name;
    }

    public int getFuelPercent() {
        return fuelPercent;
    }

    public void setFuelPercent(int fuelPercent) {
        this.fuelPercent = fuelPercent;
    }

    private void on(){
        System.out.println("시동을 걸었습니다.");
    }

    private void go(){
        System.out.println("출발합니다.");
    }

    private void off(){
        System.out.println("시동을 끕니다.");
    }

    public void operate(){
        if (fuelPercent < 0) {
            System.out.println("연료가 부족합니다.");
        }
        else {
            on();
            go();
            off();
        }
    }



}
