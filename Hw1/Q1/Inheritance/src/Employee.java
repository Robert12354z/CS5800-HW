public class Employee {

    private String firstName;
    private String lastName;
    private String socialNum;
    
    public Employee(String firstName, String lastName, String socialNum){
        this.firstName =firstName;
        this.lastName = lastName;
        this.socialNum = socialNum;

    }
    
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getSocialNum() {
        return socialNum;
    }


    public void setSocialNum(String socialNum) {
        this.socialNum = socialNum;
    }

    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName + ", socialNum=" + socialNum ;
    }


    

    

    
}
