/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 05-03-2021
 *   Time: 18:32
 *   File: Student.java
 */

package polymorphismandinheritace.example1;

public class Student {
    private int rollNumber;
    private String name;
    public void study(){

    }
}
// class Main extends Scanner .. is wrong .. becoz all class and object will be inheritance bu Main which is Wrong .
//DhakkanStdent IS-A Student (IS-A Relationship)
class DhakkanStudent extends Student{
//    private int rollNumber;  hidden /(inheritance) ,/ copy
//    private String name;
//    public void study(){ }
}
class TopperStudent{
}
class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        DhakkanStudent dhakkanStudent = new DhakkanStudent();
        dhakkanStudent.study(); // study is inheritance
    }
}