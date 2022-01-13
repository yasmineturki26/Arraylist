
import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        ArrayList <Student> l = new ArrayList <>();
        boolean exit = true;
        Scanner s = new Scanner (System.in);
        
        do{
            System.out.println("choose an opeartion");
            int choice = s.nextInt();
            
            switch(choice){
                
                // add students
                case 1: 
                    System.out.println("enter Roll number");
                    int rollNb=s.nextInt();
                    System.out.println("enter name");
                    String name=s.next();
                    System.out.println("enter age");
                    int age=s.nextInt();
                    
                    l.add(new Student(rollNb, name, age));
                    
                    System.out.println(l);
                    break;
                
                // delete student
                    
                case 2:  
                    System.out.println("enter roll number to be deleted");
                    rollNb=s.nextInt();
                    
                    l.remove(new Student (rollNb, "", 0));
                    System.out.println(l);
                    break;
                    
                // sort arraylist
                case 3: 
                    Collections.sort(l);
                    System.out.println(l);
                    break;
                
                default: 
                    exit = false;
            }
        }
        while (exit == true);
        
    }
    
}
