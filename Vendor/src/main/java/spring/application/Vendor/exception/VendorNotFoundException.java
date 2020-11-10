package spring.application.Vendor.exception;

public class VendorNotFoundException extends Exception {
	private String message;
    public VendorNotFoundException(String message) {
        super(message);
        this.message = message;
    }

}
