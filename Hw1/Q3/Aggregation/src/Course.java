public class Course {

    private String courseName;
    private Instructor instructor;
    private Instructor instructor2;
    private Textbook textbook;
    private Textbook textbook2;

    
    public Course(String courseName, Instructor instructor, Textbook textbook, Instructor instructor2, Textbook textbook2) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
        this.instructor2 = instructor2;
        this.textbook2 = textbook2;
    }
    public Textbook getTextbook2() {
        return textbook2;
    }

    public void setTextbook2(Textbook textbook2) {
        this.textbook2 = textbook2;
    }

    public Instructor getInstructor2() {
        return instructor2;
    }

    public void setInstructor2(Instructor instructor2) {
        this.instructor2 = instructor2;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + " [Instructor: "+ instructor.getFirstName() + " " + instructor.getLastName() + " Textbook: " 
        + textbook.getBookName() + " Author: " + textbook.getAuthorFirstName() + " "+ textbook.getAuthorLastName() + "]"+" [" + "Instructor: "+ instructor2.getFirstName() + " "+ instructor2.getLastName() +
         " Textbook: "+ textbook2.getBookName() + " Author: " + textbook2.getAuthorFirstName() + " " + textbook2.getAuthorLastName()+ "]" ;
    }



    
}
