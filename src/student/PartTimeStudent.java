
package student;


public class PartTimeStudent extends StudentID {
    
    private int courseNum; 

    
    public PartTimeStudent(String studentID, String studentName, int courseNum){
        
        super(studentID, studentName);
        this.courseNum = courseNum; 
        
    }
    
    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }
    
    
    
    
    
    
}
