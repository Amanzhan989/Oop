package lab3;

public class Animal {
 private String sound;
 private String name;
 private int age;
 
 public Animal(String sound, String name, int age) {
  this.sound = sound;
  this.age =age;
  this.name = name;
 }
 public Animal(String sound) {
  this.sound = sound;
 }
 
 public void setAnimalsFeatures(int age, String name) {
  this.name = name;
  this.age = age;
 }
 
 public void makeSound() {
  System.out.println(this.sound);
 }
 
 public String toString() {
  return this.name + this.age;
 }
 
 public String getSound() {
  return this.sound;
 }
 
 public String getName() {
  return this.name;
 }
 
 public int getAge() {
  return this.age;
 }
}
