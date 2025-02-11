import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter character");
        String ch = s.nextLine();
        switch(ch)
        {
            case "a" :
            case "e" :
            case "i" :
            case "o" :
            case "u" :
            case "A" :
            case "E" :
            case "I" :
            case "O" :
            case "U" : System.out.println("vowel");
                        break;
            default : System.out.println("consonent");
                        break;
        }
    }
}