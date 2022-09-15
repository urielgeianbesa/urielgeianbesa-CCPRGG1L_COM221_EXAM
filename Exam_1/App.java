public class App {
    public static void main(String[] args) throws Exception {
    
    Students Me = new Students("Besa","Uriel Geian",'R',"07/25/2002");
    Me.Values();

    Me.studentEmailAddress = "besaur@student.national-u.edu.ph";
    Me.studentNumber = 2022102968;
    Me.isAwesome = true;

    Me.sayMyemailAddress();
    Me.sayStudentNumber();
    Me.sayMyAwesomeness();
    }
}