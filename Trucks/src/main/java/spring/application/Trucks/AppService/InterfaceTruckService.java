package spring.application.Trucks.AppService;


//import org.springframework.http.ResponseEntity;

import spring.application.Trucks.AppModel.Trucks;


//import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;




public interface InterfaceTruckService {
    public boolean addTrucks(Trucks truck);

    public Trucks searcTrucks(Long truckNumber);

    Trucks updateTrucks(Trucks truck);

    boolean deleteTrucks(Long truckNumber);

    Trucks findBytruckNumber(Long truckNumber);

}
