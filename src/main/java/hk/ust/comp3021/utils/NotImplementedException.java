package hk.ust.comp3021.utils;

/**
 * Throw to indicate that the feature is not implemented.
 */
public class NotImplementedException extends RuntimeException {
 public NotImplementedException() {
        super("This is not yet implemented");
    }
}
