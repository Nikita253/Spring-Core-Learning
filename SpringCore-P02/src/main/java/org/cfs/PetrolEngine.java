package org.cfs;

public class PetrolEngine implements Engine {

    @Override
    public int start() {
        return 0;
    }

    public PetrolEngine() {
        System.out.println("Petrol Constructor...");
    }
}
