package com.dc.truckschedulingapplictionsysteam.controller;

import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;
import com.dc.truckschedulingapplictionsysteam.service.DistributionCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/distributioncenter")
public class DistributionCenterController {


    @Autowired
    private DistributionCenterService service;

    @PostMapping("/add/dc")
    public ResponseEntity<String> addDistributionCenter(@RequestBody DistributionCenter distributionCenter){
        boolean check=  service.addDistributionCenter(distributionCenter) ;
        if (!check  ){
            return  new ResponseEntity<>( "THERE WAS A PROBLEAM", HttpStatus.BAD_REQUEST );
        }
        return  new ResponseEntity<>( "DC ADDED", HttpStatus.OK );
    }

    @GetMapping("/search/dc/{dcNumber}")
    public ResponseEntity serchDistributionCenter(@PathVariable Long dcNumber){
        DistributionCenter distributionCenter = service.searcDistributionCenter(dcNumber);
        if (distributionCenter == null){

            return  new ResponseEntity<>( "NOT FOUND", HttpStatus.NOT_FOUND );
        }
        return  ResponseEntity.status(HttpStatus.OK).body(distributionCenter);
    }

    @PutMapping("/Update/dc")
    public ResponseEntity<DistributionCenter> updateDistributionCenter(@RequestBody DistributionCenter distributionCenter){
        DistributionCenter distributionCenter1 =   service.updateDistributionCenter(distributionCenter);
        if (distributionCenter1 != null){
            return  ResponseEntity.status(HttpStatus.OK).body(distributionCenter1);
        }
        return  new ResponseEntity( "CAN NOT BE UPDATE", HttpStatus.BAD_REQUEST );
    }
    @DeleteMapping("/delete/dc/{dcNumber}")
    public ResponseEntity deleteDistributionCenter(@PathVariable Long dcNumber){
        boolean distributionCenter = service.deleteDistributionCenter(dcNumber);
        if (!distributionCenter  ){
            return  new ResponseEntity<>( "CAN NOT DELETE DC", HttpStatus.BAD_REQUEST );
        }
        return  new ResponseEntity<>( "DELETE SUCCESSFULL", HttpStatus.OK );
    }

    @GetMapping("/find/dcNumber/{dcNumber}")
    public  DistributionCenter findDcNumber(@PathVariable Long dcNumber){
        DistributionCenter distributionCenter =      service.findBydcNumber(dcNumber);
        if (distributionCenter != null){
            return distributionCenter;
        }
        return  null;

    }
}

