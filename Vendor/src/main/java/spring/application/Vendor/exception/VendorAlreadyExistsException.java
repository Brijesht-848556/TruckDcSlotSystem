package spring.application.Vendor.exception;

public class VendorAlreadyExistsException extends Exception {
	 private String message;
	    public VendorAlreadyExistsException(String message) {
	        super(message);
	        this.message = message;
	    }

}
