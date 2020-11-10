package spring.application.Trucks.AppService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import spring.application.Trucks.AppModel.Trucks;
import spring.application.Trucks.AppService.InterfaceTruckService;
import spring.application.Trucks.Dao.TrucksDao;

@Service
public class TrucksServiceImpl implements InterfaceTruckService{

	 @Autowired
	    private TrucksDao trucksDao;
	    @Override
	    public boolean addTrucks(Trucks truck) {
	    	Trucks t =  trucksDao.save(truck);
	        if (t != null){
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public Trucks searcTrucks(Long truckNumber) {
	        if (trucksDao.findByTruckNumber(truckNumber) != null) {
	        	Trucks t = trucksDao.findByTruckNumber(truckNumber);
	            return t;
	        }
	        return  null;
	    }
	    public Trucks updateDistributionCenter(Trucks truck){
	    	Trucks t = this.searcTrucks(truck.getTruckNumber());
	        if (t != null){
	            return trucksDao.save(truck);
	        }
	        return null;
	    }

	    public boolean deleteTrucks(Long truckNumber){
	        if (this.searcTrucks(truckNumber) != null){
	            Trucks distributionCenter = this.searcTrucks(truckNumber);

	            trucksDao.delete( distributionCenter);
	            return true;
	        }
	        return  false;
	    }

	    @Override
	    public Trucks findBytruckNumber(Long truckNumber) {
	        if (trucksDao.findByTruckNumber(truckNumber)  != null){
	            return   trucksDao.findByTruckNumber(truckNumber);
	        }

	        return null;
	    }

		@Override
		public Trucks updateTrucks(Trucks truck) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
