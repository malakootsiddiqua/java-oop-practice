public class main{
    public static void main(String[] args) {
        Rationalnumber r1= new Rationalnumber(3, 4);
        Rationalnumber r2= new Rationalnumber(2, 5);
        Rationalnumber sum = r1.add(r2);
        Rationalnumber difference = r1.subtract(r2);
        System.out.print("First ");;
        r1.get();   
        System.out.print("Second ");
        r2.get();
        System.out.print("Sum ");
        sum.get();
        System.out.print("Difference ");    
        difference.get();
    }
}

