package cars;

public class Toyota extends Car {
    
    private boolean gps = false; 

    public Toyota() {
        // has all the other properties of Car exceot for make
        setMake("Toyota");
    }

    // overriding
    // method signature is the same as the parent's (aka name of method, number and type of parameters)
    @Override // annotation -- telling java to override
    public void go(int d, boolean t) {
        this.fuel -= d;
    }

    @Override
    public void setMake(String m) {}

    
    public boolean isGps() {return gps;}
    public void setGps(boolean gps) {this.gps = gps;}
}
