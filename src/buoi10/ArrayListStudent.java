package buoi10;

import java.util.ArrayList;

public class ArrayListStudent {
    public ArrayList<Student>list;
    public ArrayListStudent(ArrayList<Student>list){
        this.list=list;
    }
    public ArrayListStudent(){
        this.list=new ArrayList<Student>();
    }
    public void addStudent(Student s){
        this.list.add(s);
    }
    public boolean deleteStudent(Student s){
        this.list.remove(s);
    }
    public void printStudent(){
        for (Student s:list){
            System.out.print(s);
        }
    }
}
