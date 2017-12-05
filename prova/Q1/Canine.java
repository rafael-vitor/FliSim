package prova.Q1;

public class Canine extends Animal {

    public Canine(String name, String race, String port, int age, String type, String furColor) {
        super(name, race, port, age, type, furColor);
    }

    public Canine() {
    }

    @Override
    public String toString() {
        return "Canine animal named " + this.name + " of race " + this.race
                + " with " + this.port + " port " + "aged " + this.age + " of type " + this.type
                + " and " + this.furColor + " colored fur";
    }
}
