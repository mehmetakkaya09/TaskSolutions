package inheritance.planet;

public class Planet {
    private String name;
    private double mass, radius, surfaceGravity, surfaceArea, volume, population;

    public Planet(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
        setVolume(volume);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public double getPopulation() {
        return population;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Invalid Name");
            return;
        } else
            this.name = name;

    }

    public void setMass(double mass) {
        if (mass < 0) {
            System.out.println("Invalid Value");
            return;
        } else
            this.mass = mass;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Invalid Value");
            return;
        } else
        this.radius = radius;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        if (surfaceGravity < 0) {
            System.out.println("Invalid Value");
            return;
        } else
        this.surfaceGravity = surfaceGravity;
    }

    public void setSurfaceArea(double surfaceArea) {
        if (surfaceArea < 0) {
            System.out.println("Invalid Value");
            return;
        } else
        this.surfaceArea = surfaceArea;
    }

    public void setVolume(double volume) {
        if (volume < 0) {
            System.out.println("Invalid Value");
            return;
        } else
        this.volume = volume;
    }

    public void setPopulation(double population) {
        if (population < 0) {
            System.out.println("Invalid Value");
            return;
        } else
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
