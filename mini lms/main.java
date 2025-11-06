class Main {
public static void main(String[] args) 
 {
    Student s1 = new Student ();
Student s2 = new Student ("Alice", 101);
Student s3 = new Student ("Mariyam", 102, 20);


      System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

s1.setName("Mala");
s1.setRollnumber(100);
s1.setAge(19);
        System.out.println("After updating s1:");
}
}
