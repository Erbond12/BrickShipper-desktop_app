package BrickShipper;

/**
 * This is similar to the Consumer Interface, but it makes the accept method 
 * throw an exception.
 */

@FunctionalInterface
public interface ThrowingConsumer<T> {
	
	void accept(T t) throws Exception;
}
