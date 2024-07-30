package Practice;

public class ResourceNotFound extends Exception {

    ResourceNotFound () {}
    
    ResourceNotFound(String message) {
        super(message);
    }
}
