abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(){
    }

    public Animal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();

    public String toString(){
        return "Name: " + name + "; Age; " + age + ",Weight: " + weight;
    }
}



