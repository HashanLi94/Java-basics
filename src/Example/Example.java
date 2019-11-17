package Example;

public class Example {
    public static void main(String[] args) {
        System.out.println("Hellow World");

        System.out.println("Hellow World");
        System.out.println("Hellow World");

        Applied cis = new Applied();

        cis.name = "Hashan";

        cis.students = 10;

        cis.subject = "IT_Auditing";

        cis.activities();

        Pet dog = new Pet();

        dog.setdetails("Blackey", 4, 2);

        dog.speak();

        Students one = new Students();
        one.setDetails("Hashan", "Liyanage", 24);
        one.details();

        Tables table1 = new Tables();
        table1.setTable(6, "Koththu", "Coca-coal(Family pack)");
        table1.tableDetails();

        table1.view();;
        table1.total(1000, 2000);


    }


}
