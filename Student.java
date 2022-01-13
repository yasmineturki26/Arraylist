
import java.util.Objects;

public class Student implements Comparable<Student>{
    
    private String studentname ;
     int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getStudentage() {
        return studentage;
    }
    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.rollno;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        if (this.rollno != ((Student)obj).rollno) {
            return false;
        }
        return true;
    }
    

    @Override
    public int compareTo(Student o) {
        if (this.rollno == o.rollno)
            return 0;
        else
            if (this.rollno> o.rollno)
                return 1;
        else
                return -1;
    }

    @Override
    public String toString() {
        return "Student{" + "studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + '}';
    }
}
