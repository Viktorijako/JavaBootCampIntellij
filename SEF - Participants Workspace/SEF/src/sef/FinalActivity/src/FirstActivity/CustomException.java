package FirstActivity;

public class CustomException extends Exception{

    public String toString(){
        return "This is my custom exception";
    }
    public String getMessage() {
        //3 - Enter a message in it and return the same
        String msg = "Here, I am going to provide you with more information about this exception";
        return null;
    }
}
