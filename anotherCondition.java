import java.util.Scanner;
public class anotherCondition {
public static void main(String[] args) {
    Scanner x =new Scanner(System.in);
    System.out.println("enter marks");
    int n=x.nextInt();
    if(n>=40){
        System.out.println("PASS");
    }
    else {
        System.out.println("FAIL");
    }
}
    
}
