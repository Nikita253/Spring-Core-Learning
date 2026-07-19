package org.cfs;

public class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public Car(){
        System.out.println("Car Default constructor..");
    }

    public Car(Engine engine) {
        System.out.println("Car Constructor...");
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("SetEngine() called...");
        this.engine = engine;
    }

    public void drive(){
        int start = engine.start();
        if(start >= 1){
            System.out.println("Let's Drive");
        }else{
            System.out.println("Start the engine");
        }
    }
}
