package prova.Q1;

public abstract class Animal {

    String name;
    String race;
    String port;
    String type;
    String furColor;
    int age;

    public Animal() {}

    public Animal(String name, String race, String port, int age, String type, String furColor) {
        this.name = name;
        this.race = race;
        this.port = port;
        this.age = age;
        this.type = type;
        this.furColor = furColor;
    }

    @Override
    public abstract String toString();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
