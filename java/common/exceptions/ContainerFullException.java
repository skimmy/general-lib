package common.exceptions;

/**
 * Exception to indicate an attempt to insert element(s) in a container that has
 * already reached its full capacity.
 *
 * Created by Michele Schimd on 28/10/2014.
 *
 * @version 1.0
 */
public class ContainerFullException extends RuntimeException  {
    public ContainerFullException() {
        super("Attempt to add elements to a filled container");
    }
}
