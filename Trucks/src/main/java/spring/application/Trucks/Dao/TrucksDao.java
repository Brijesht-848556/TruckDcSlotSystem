package spring.application.Trucks.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



//import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;

import spring.application.Trucks.AppModel.Trucks;

@Repository
public   interface TrucksDao   extends JpaRepository<Trucks, Long> {
	 /*Trucks findByName(long truckNumber);
    public Optional<Trucks> findByTruckcName(String truckName);
*/
	public Trucks findByTruckNumber(Long Id);
 
}
