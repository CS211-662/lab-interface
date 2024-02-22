package ku.cs.fileWriter.model;

import ku.cs.fileWriter.service.WriteAble;

public class Cat implements WriteAble {
    private String name;
    private String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toCsvFormat() {
        return String.format("%s,%s", name, breed);
    }
}
