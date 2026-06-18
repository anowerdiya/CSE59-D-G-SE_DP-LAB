
class Sensor{
    String name;
    int batteryLevel;

    void charge(){
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}



public class Main4 {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.name = "Temperature Sensor";

        s.charge();
        System.out.println("Battery Level:" + s.batteryLevel);

    }
    
}

