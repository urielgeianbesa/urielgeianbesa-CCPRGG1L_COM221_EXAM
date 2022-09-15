public class Students {
    String surname;
    String firstName;
    char middleInitial;
    String dateOfBirth;
    long studentNumber;
    String studentEmailAddress;
    boolean isAwesome;
    
        public void Values(){
            System.out.println("Surname = " + surname);
            System.out.println("Firstname = " + firstName);
            System.out.println("Middle Initial = " + middleInitial);
            System.out.println("Date of Birth = " + dateOfBirth);
        }
    
        public void sayStudentNumber(){
            System.out.println("Student Number = " + studentNumber);
        }
    
        public void sayMyemailAddress(){
            System.out.println("Email Address = " + studentEmailAddress);
        }
        
        public void sayMyAwesomeness(){
            System.out.println("I am Awesome = " + isAwesome);  
        }

        public Students(String lstName, String frstName, char midIn, String birthDate) {
            surname = lstName;
            firstName = frstName;
            middleInitial = midIn;
            dateOfBirth = birthDate;
        }
}

        
        

    

