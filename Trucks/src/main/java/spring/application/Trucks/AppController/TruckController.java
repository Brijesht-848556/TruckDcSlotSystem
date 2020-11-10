package spring.application.Trucks.AppController;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




//import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;

import spring.application.Trucks.AppModel.Trucks;
import spring.application.Trucks.AppService.InterfaceTruckService;


@RestController
@RequestMapping("/trucks")
public class TruckController {
	@Autowired
    private InterfaceTruckService interfacetruckService;

	  @PostMapping("/add/truck")
	    public ResponseEntity<String> addTrucks(@RequestBody Trucks truck){
	        boolean check=  interfacetruckService.addTrucks(truck) ;
	        if (!check  ){
	            return  new ResponseEntity<>( "THERE WAS A PROBLEAM", HttpStatus.BAD_REQUEST );
	        }
	        return  new ResponseEntity<>( "Truck ADDED", HttpStatus.OK );
	    }

	    @GetMapping("/search/truck/{truckNumber}")
	    public ResponseEntity searcTrucks(@PathVariable Long truckNumber){
	    	Trucks truck = interfacetruckService.searcTrucks(truckNumber);
	        if (truck == null){

	            return  new ResponseEntity<>( "NOT FOUND", HttpStatus.NOT_FOUND );
	        }
	        return  ResponseEntity.status(HttpStatus.OK).body(truck);
	    }

	    @PutMapping("/Update/truck")
	    public ResponseEntity<Trucks> updateTrucks(@RequestBody Trucks t){
	    	Trucks truck1 =   interfacetruckService.updateTrucks(t);
	        if (truck1 != null){
	            return  ResponseEntity.status(HttpStatus.OK).body(truck1);
	        }
	        return  new ResponseEntity( "CAN NOT BE UPDATE", HttpStatus.BAD_REQUEST );
	    }
	    @DeleteMapping("/delete/truck/{truckNumber}")
	    public ResponseEntity deleteTrucks(@PathVariable Long truckNumber){
	        boolean truck = interfacetruckService.deleteTrucks(truckNumber);
	        if (!truck  ){
	            return  new ResponseEntity<>( "CAN NOT DELETE DC", HttpStatus.BAD_REQUEST );
	        }
	        return  new ResponseEntity<>( "DELETE SUCCESSFULL", HttpStatus.OK );
	    }

	    @GetMapping("/find/dcNumber/{dcNumber}")
	    public  Trucks findTruckNumber(@PathVariable Long truckNumber){
	        Trucks truck =      interfacetruckService.findBytruckNumber(truckNumber);
	        if (truck != null){
	            return truck;
	        }
	        return  null;

	    }
	
}
