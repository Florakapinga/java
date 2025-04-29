public class grades {
    public static void main ( String []args){
        int marks = 90;
        if ( marks<0 || marks>100){
            System.out.println("error");
        }
        else if(marks>=0 && marks<=40){
            System.out.println("C");

        }
        else if (marks>=41 && marks<=70){
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
    }
    
}
