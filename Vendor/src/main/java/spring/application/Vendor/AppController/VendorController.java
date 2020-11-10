package spring.application.Vendor.AppController;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import spring.application.Trucks.AppModel.Trucks;
import spring.application.Vendor.AppModel.Vendor;
import spring.application.Vendor.AppService.InterfaceVendorService;




@RestController
@RequestMapping("/vendor")
public class VendorController {
	@Autowired
    private InterfaceVendorService ivendorService;

	 @PostMapping("/add/vendor")
	    public ResponseEntity<String> addVendor(@RequestBody Vendor vendor){
	        boolean check=  ivendorService.addVendor(vendor) ;
	        if (!check  ){
	            return  new ResponseEntity<>( "THERE WAS A PROBLEAM", HttpStatus.BAD_REQUEST );
	        }
	        return  new ResponseEntity<>( "VENDOR ADDED", HttpStatus.OK );
	    }

	    @GetMapping("/search/vendor/{vendorNumber}")
	    public ResponseEntity searcVendor(@PathVariable Long vendorNumber){
	    	Vendor vendor = ivendorService.searcVendor(vendorNumber);
	        if (vendor == null){

	            return  new ResponseEntity<>( "NOT FOUND", HttpStatus.NOT_FOUND );
	        }
	        return  ResponseEntity.status(HttpStatus.OK).body(vendor);
	    }

	    @PutMapping("/Update/vendor")
	    public ResponseEntity<Vendor> updateVendor(@RequestBody Vendor v){
	    	Vendor vendor1 =   ivendorService.updateVendor(v);
	        if (vendor1 != null){
	            return  ResponseEntity.status(HttpStatus.OK).body(vendor1);
	        }
	        return  new ResponseEntity( "CAN NOT BE UPDATE", HttpStatus.BAD_REQUEST );
	    }
	    @DeleteMapping("/delete/vendor/{vendorNumber}")
	    public ResponseEntity deleteVendor(@PathVariable Long vendorNumber){
	        boolean vendor = ivendorService.deleteVendor(vendorNumber);
	        if (!vendor  ){
	            return  new ResponseEntity<>( "CAN NOT DELETE Vendor", HttpStatus.BAD_REQUEST );
	        }
	        return  new ResponseEntity<>( "DELETE SUCCESSFULL", HttpStatus.OK );
	    }

	    @GetMapping("/find/vendorNumber/{vendorNumber}")
	    public  Vendor findVendorNumber(@PathVariable Long vendorNumber){
	        Vendor vendor =      ivendorService.findByvendorNumber(vendorNumber);
	        if (vendor != null){
	            return vendor;
	        }
	        return  null;

	    }
	

}
