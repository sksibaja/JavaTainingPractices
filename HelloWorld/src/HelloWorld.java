/**
 * Created by ssibaja on 3/29/17.
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println(Dogs());
    }

    private static String Dogs(){
        String str1 = new String("Who let the dogs out?");
        String str2 = "Who, who, who, who, who?";
        String str3 = str1+" "+str2;
        return str3;
    }

}
