package spring.application.Vendor.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;

//import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;

import spring.application.Vendor.AppModel.Vendor;


@Repository
public interface VendorDao extends JpaRepository<Vendor, Long> {
  
	 public Vendor findByVendorNumber(Long Id);
}