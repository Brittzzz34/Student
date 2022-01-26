
package student;

public class StudentID {
    
    private String studentID;
    private String studentName; 
    private String address; 
    
    
    public StudentID(String studentID, String studentName){
        
        this.studentID = studentID;
        this.studentName = studentName;
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
