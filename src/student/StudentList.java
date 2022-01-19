/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Brian
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentID[] studentList = new StudentID[4];
        studentList[0] = new StudentID("s1", "Brittany");
        studentList[1] = new StudentID("s2", "Brooke");
        studentList[2] = new StudentID("s3", "Brian");
    
    
    for (int i = 0; i<studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
            System.out.println(studentList[i].getStudentID());
    }
    
//    for(String student : studentList){
//        System.out.println("");
//    }
}
}
