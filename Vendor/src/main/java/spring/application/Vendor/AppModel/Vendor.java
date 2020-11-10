package spring.application.Vendor.AppModel;

import javax.persistence.*;

import com.sun.istack.NotNull;

//import lombok.Data;


@Entity
//@Table(name = "VendorDB")
public class Vendor {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @NotNull
	    @Column(name="vendorNumber")
	    private long vendorNumber;
	    
	    @Column(name = "vendorName")
	    @NotNull
	    private String vendorName;
	    
	    @Column(name = "vendorEmail")
	    @NotNull
	    private String vendorEmail;
	    
	    @Column(name = "vendorAddress")
	    @NotNull
	    private String vendorAddress;
	     
	    public long getVendorNumber() {
	        return vendorNumber;
	    }

	    public void setVendorNumber(long vendorNumber) {
	        this.vendorNumber = vendorNumber;
	    }

	    public String getVendorName() {
	        return vendorName;
	    }

	    public void setVendorName(String vendorName) {
	        this.vendorName = vendorName;
	    }

	    public String getVendorEmail() {
	        return vendorEmail;
	    }

	    public void setVendorEmail(String vendorEmail) {
	        this.vendorEmail = vendorEmail;
	    }
	    public String getVendorAddress() {
	        return vendorAddress;
	    }

	    public void setVendorAddress(String vendorAddress) {
	        this.vendorAddress = vendorAddress;
	    }

	    public Vendor(long vendorNumber, String vendorEmail,String vendorName ,String vendorAddress) {
	        this.vendorNumber = vendorNumber;
	        this.vendorName = vendorName;
	        this.vendorAddress = vendorAddress;
	        this.vendorEmail = vendorEmail;
	    }

	    public Vendor() {
	    }
	    @Override
	    public String toString() {
	        return "DistributionCenter{" +
	                "vendorNumber=" + vendorNumber +
	                ", vendorName='" + vendorName + '\'' +
	                ", vendorEmail='" + vendorEmail + '\'' +
	                ", vendorAddress='" + vendorAddress + '\'' +
	                '}';
	    }
}
