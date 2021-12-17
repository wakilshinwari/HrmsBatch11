package inheritance;

public class Dog extends Animal{
    String name;
    String breed;
    String color;
    int age;
    double weigth;

    void printAllInfo(){
        System.out.println(name+breed+color+age+weigth);
    }
    void bark(){
        System.out.println(name+"barking");
    }
}


