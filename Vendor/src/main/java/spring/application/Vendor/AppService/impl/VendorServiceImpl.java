package spring.application.Vendor.AppService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.application.Vendor.AppModel.Vendor;
import spring.application.Vendor.AppService.InterfaceVendorService;
import spring.application.Vendor.Dao.VendorDao;

@Service
public class VendorServiceImpl implements InterfaceVendorService{
	  @Autowired
	    private VendorDao vendorDao;
	    @Override
	    public boolean addVendor(Vendor vendor) {
	    	Vendor v =  vendorDao.save(vendor);
	        if (v != null){
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public Vendor searcVendor(Long vendorNumber) {
	        if (vendorDao.findByVendorNumber(vendorNumber) != null) {
	        	Vendor v = vendorDao.findByVendorNumber(vendorNumber);
	            return v;
	        }
	        return  null;
	    }
	    public Vendor updateVendor(Vendor vendor){
	    	Vendor v = this.searcVendor(vendor.getVendorNumber());
	        if (v != null){
	            return vendorDao.save(vendor);
	        }
	        return null;
	    }

	    public boolean deleteVendor(Long vendorNumber){
	        if (this.searcVendor(vendorNumber) != null){
	        	Vendor vendor = this.searcVendor(vendorNumber);

	            vendorDao.delete( vendor);
	            return true;
	        }
	        return  false;
	    }

	    @Override
	    public Vendor findByvendorNumber(Long vendorNumber) {
	        if (vendorDao.findByVendorNumber(vendorNumber)  != null){
	            return   vendorDao.findByVendorNumber(vendorNumber);
	        }

	        return null;
	    }

		

}
