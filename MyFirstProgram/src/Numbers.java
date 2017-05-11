/**
 * Created by ssibaja on 4/18/17.
 */
public class Numbers {

    public void printNumbers (){

        System.out.println("Numeros del 1 al 100:");

        for (int i=1;i<=100;i++) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Multiplos de tres, del 1 al 100:");

        for (int i=1;i<=100;i++) {
            if (i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
    }

    public int sumInteger(int param1, int param2){
        return param1+param2;
    }
}
