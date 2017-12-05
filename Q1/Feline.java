package Q1;

public class Feline extends Animal {

    @Override
    public String toString() {
        return "Feline animal named " + this.name + " of race " + this.race
            + " with " + this.port + " port " + "aged " + this.age + " of type " + this.type
                + " and " + this.furColor + " colored fur";
    }

    public Feline(String name, String race, String port, int age, String type, String furColor) {
        super(name, race, port, age, type, furColor);
    }

    public Feline() {

    }
}
