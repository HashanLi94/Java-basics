package Example;

public class Pet {

    String name;
    int legs;
    int eyes;

    void setdetails(String n, int l, int e){
        name = n;
        legs = l;
        eyes = e;
    }

    void speak(){
        System.out.println(name + " is my dog");
    }
}
