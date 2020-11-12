package com.dc.truckschedulingapplictionsysteam.dao;

import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributionCenterDao extends JpaRepository<DistributionCenter, Long> {

    public DistributionCenter findByDcNumber(Long Id);


}