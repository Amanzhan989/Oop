package lab3;

public class Main1 {
 public static void main(String [] args) {
  Animal animal = new Animal("no sound");
  Cat cat = new Cat("meoww");
  animal.makeSound();
  cat.makeSound();
  animal.setAnimalsFeatures(12, "Robot");
  cat.setAnimalFeatures("brown");
  
  System.out.println(animal.toString());
  System.out.println(cat.toString());
 }

}