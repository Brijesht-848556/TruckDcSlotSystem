package spring.application.Vendor.AppService;

//import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;

//import java.util.List;

//import org.springframework.http.ResponseEntity;

//import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;

import spring.application.Vendor.AppModel.Vendor;
//import spring.application.Vendor.exception.VendorAlreadyExistsException;
//import spring.application.Vendor.exception.VendorNotFoundException;



public interface InterfaceVendorService {
	  public boolean addVendor(Vendor distributionCenter);

	    public Vendor searcVendor(Long vendorNumber);

	    Vendor updateVendor(Vendor vendor);

	    boolean deleteVendor(Long vendorNumber);

	    Vendor findByvendorNumber(Long vendorNumber);

}
