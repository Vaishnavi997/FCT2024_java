

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student(); 
        student.studentName = "Riya";
        student.rank = 4;
        student.age =22;
        student.numberOfSubjects= 3;
        
        student.addMarks(98);
        student.addMarks(90);   
        student.addMarks(95); 
        student.printStudentInformation();
        student.totalMarks();
        student.averageMarks();
    }
}

class Student 
{
    int rank;
    String studentName;
    int age;
    float averageMarks;
    int totalMarks;
    int numberOfSubjects;
    
    
    void addMarks(int marks) {
        totalMarks += marks;
        numberOfSubjects++;
      
    }

    void totalMarks() {
    	System.out.println("Total Marks    : " + totalMarks);
    }
    
    void averageMarks() {
    	averageMarks =  totalMarks / numberOfSubjects;
    	System.out.println("Average Marks  : " + averageMarks);
    }
    void printStudentInformation() {
        System.out.println("Student Name   : " + studentName);
        System.out.println("Rank           : " + rank);
        System.out.println("Number of subjects : " + numberOfSubjects);
    }
    
}

/*
 * Naming Convention
 * ClassName -  Pascalcase(StudentTest,DriverManager)
 * Methodname- First letter small(setLookAndFeel())
 * fields - same as methodname
 * Constant - PI, SPEED_OF_LIGHT,MAX , MIN
 * Packages - everything small(java.lang,java.net)
 *  */

/*
*
*
* Naming conventions
*
* 	ClassName	- DriverManager, PoolManager, SytemManager
*  fields		- rollNumber, socialSecurityNumber, adhaarCardNumber
*  methodName - setLookAndFeel(), getConnection()
*  CONSTANT 	- PI, SPEED_OF_LIGHT, MAX, MIN
*  packages 	- java.lang, java.net, jungle.wild, jungle.domestic
*/
