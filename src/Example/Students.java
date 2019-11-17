package Example;

public class Students {

    String first_name;
    String last_name;
    int age;

    void setDetails(String f, String l, int a){
        first_name = f;
        last_name = l;
        age = a;
    }

    void details(){
        System.out.println(first_name + " "+ last_name +" " +" is " + age + " years of age");
    }
}

class Tables{
    int chairs;
    String food;
    String bev;

    void setTable(int c, String f, String b){
        chairs = c;
        food = f;
        bev = b;
    }

    void tableDetails(){
        System.out.println("You have selected" + " " + chairs + " chairs and " + " " + food + " and " + bev + " for your Dinner today" );
    }

    void view(){
        System.out.println("you can select a view what u want");
    }

    int total(int a, int b){
        int price = a + b;
        return price;
    }
}