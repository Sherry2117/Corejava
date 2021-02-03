package ExceptionExamples;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super (msg);
    }
}
class VoterIDMissingException extends Exception{
    VoterIDMissingException(String msg) {
        super (msg);
    }
}
public class TestCustomException {
    public static void main(String[] args) {
        try {

            validateAge(10);

        } catch (InvalidAgeException ageException) {
            System.out.println("Exception Occured:" + ageException);
        } catch (VoterIDMissingException voterIdMissingEcp) {
            System.out.println("Exception Occured:" + voterIdMissingEcp);
        }
        System.out.println("Rest of the code..");
    }

    private static void validateAge(int age) throws InvalidAgeException, VoterIDMissingException
    {
        System.out.println("Age passed here" +age);
        if(age<18) {
            throw new InvalidAgeException("You are not matching the age criteria to cast vote");
        }

        else{
            throw new VoterIDMissingException("I don't have a voters card");
        }
    }
}

