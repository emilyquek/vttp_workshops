package cars;

public class Car {

    // members of the class
    protected String make;
    protected String owner;
    protected String colour; 
    protected int fuel = 100;


    // constructor -- takes name of the class and does not have any return type
    public Car () { 
        this.colour = "silver";
        this.make = "porsche";
    }

    public Car(String m) {
        this.make = m;
        this.colour = "silver";
    }

    public Car(String m, String c) {
        this.make = m;
        this.colour = c;
    }

    // encapsulation
    // getters and setters
    // make property
    public void setMake(String m) {this.make = m;} 
    public String getMake() {return this.make;}

    public void setOwner(String o) {this.owner = o;}
    public String getOwner() {return this.owner;}

    public void setColour(String c) {this.colour = c;}
    public String getColour() {return this.colour;}

    // methods -- behaviours
    // void -- doesnt return anything
    // overloaded method -- gradually ease user into a method with different complexities; same name different parametor types in same class
    public void go() {
        this.go(1, false);
        // go(1, false)
        //this.fuel --;
    }

    public void go(String distance) {
        this.go(Integer.parseInt(distance), false);
    }

    public void go(int distance) {
        this.go(distance, false);
        // go(distance, false)
        //this.fuel -= distance;
    }

    public void go(int distance, boolean turbo) {
        if (turbo) {
            this.fuel -= 2;
        } 
        this.fuel -= distance;
    }

    public void fuelGauge() {
        System.out.printf("FUEL: %d\n", this.fuel);
    }

    public void info() {
        // put 'this' when referring to member
        System.out.printf("Make: %s, Owner: %s, Colour: %s\n", this.make, this.owner, this.colour);

    }
} // git remote add origin <paste>