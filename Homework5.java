
class PersonalComputer{
    private Computer computer;
    private Monitor monitor;

    PersonalComputer(Computer computer, Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo(){
        System.out.println("The spec of the computer");
        computer.printInfo();
        System.out.println("The spec of the monitor");
        monitor.printInfo();
    }
}

class Monitor{
    private String monitorSize;
    private String color;
    private String power;

    Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }

    public void printInfo(){
        System.out.println("Size: " + monitorSize);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this. memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }

    public void printInfo(){
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hd);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

public class Homework5 {
    public static void main(String[] args){
        Computer computer = new Computer("Core i7", "32GB", "2TB", "White", "700W");
        Monitor monitor = new Monitor("32 inch", "Black", "45W");

        PersonalComputer pc = new PersonalComputer(computer, monitor);

        pc.turnOn();
        pc.printInfo();
    }
}
