/**
 * Created by ssibaja on 4/18/17.
 */
public class Main {

    private static int instances = 0;

    private String name;
    private int instance_number;

    //initializer
    public Main(String name){

        this.instance_number = ++Main.instances;
        this.name = name;
    }

    public static void main (String[] args){
        Main x = new Main("Fulano");
        Main y = new Main("Sutano");

        x.print();
        y.print();

        Numbers numbers = new Numbers();
        numbers.printNumbers();

        System.out.println("Suma = " + numbers.sumInteger(10,15));
    }

    public void print(){
        System.out.println("Hola!, soy " + this.name);

    }
}
