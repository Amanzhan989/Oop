package lab3;

public class Cat extends Animal{
 private String color;
 
 public Cat(String sound, String name,String color, int age) {
  super(sound,name,age);
  this.color = color;
 }
 
 public Cat(String sound) {
  super(sound);
 };
 
 public void makeSound() {
  System.out.println(getSound());
 }
 
 public void setAnimalFeatures(String color) {
  this.color = color;
 }
 
 public String toString() {
  return this.color + getName() + getAge();
 }
}
