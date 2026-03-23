package HW_10.src.Lesson_10_polymorphism.Dogs;

public abstract class Dog extends Lesson_10_polymorphism.Pet {

    public Dog(String name) {
        super(name);
//        System.out.println("A new dog is created, its name is " + name);
    }

    void eat() {
        System.out.println(getName() + "is eating");
    }
    void voice() {
        System.out.println(getName() + " says: " + getWhatISay() + "!");
    }

    String getTag() {
        return  "I'm a " + getBreed() + ", my name is " + getName();
    }

    abstract String getBreed();

    String getWhatISay() {
        return "Bow-Bow";
    }

    @Override
    public String toString() {
        return getBreed() + " " + getName();
    }
}
