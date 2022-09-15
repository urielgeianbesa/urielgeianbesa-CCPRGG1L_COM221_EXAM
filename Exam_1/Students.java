public class Students {
    public class Student {
        String surname = "Besa";
        String firstName = "UrielGeian";
        char middleInitial = 'R';
        String dateOfBirth = "07/25/02";
        long studentNumber = 2022102968;
        String studentEmailAddress = "besaur@student.national-u.edu.ph";
        boolean IamAwesome = true;
    
    
        public void sayStudentNumber(){
            System.out.println("Student Number: " + studentNumber);
        }
    
        public void sayMyemailAddress(){
            System.out.println("Email Address: " + studentEmailAddress);
        }
        
        public void sayMyAwesomeness(){
            System.out.println("I am Awesome = " + IamAwesome);  
        }
        
        
    }
    
}
