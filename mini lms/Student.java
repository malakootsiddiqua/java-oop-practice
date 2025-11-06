class Student{
    private String name;
    private int rollnumber;
private int age;
Student(){
   this. name="Unknown";
    this.rollnumber=0;
  this.  age=0;

}
Student(String n, int r){
this.name =n;
this.rollnumber=r;  
this.age=0;
}
Student (String n,int r,int a) {
this.name=n;
this.rollnumber=r;
this.age=a;
}

public String getName()
   {return name;
}
public int getRollnumber()
   { return rollnumber;
}
public int getAge()
   { return age;
}
public void setName (String name)
   {this.name=name;
}
public void setRollnumber(int rollnumber)
   { this.rollnumber=rollnumber;
}
public void setAge(int age)
   { this.age=age;
}
public String toString()
   {return "Name: "+name+", Roll Number: "+rollnumber+", Age: "+age;
}
}