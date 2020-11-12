package com.dc.truckschedulingapplictionsysteam.service.impl;

import com.dc.truckschedulingapplictionsysteam.dao.DistributionCenterDao;
import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;
import com.dc.truckschedulingapplictionsysteam.service.DistributionCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributionCenterServiceImpl implements DistributionCenterService {

    @Autowired
    private DistributionCenterDao distributionCenterDao;
    @Override
    public boolean addDistributionCenter(DistributionCenter distributionCenter) {
        DistributionCenter distribution =  distributionCenterDao.save(distributionCenter);
        if (distribution != null){
            return true;
        }
        return false;
    }

    @Override
    public DistributionCenter searcDistributionCenter(Long dcNumber) {
        if (distributionCenterDao.findByDcNumber(dcNumber) != null) {
            DistributionCenter distribution = distributionCenterDao.findByDcNumber(dcNumber);
            return distribution;
        }
        return  null;
    }
    public DistributionCenter updateDistributionCenter(DistributionCenter distributionCenter){
        DistributionCenter distribution = this.searcDistributionCenter(distributionCenter.getDcNumber());
        if (distribution != null){
            return distributionCenterDao.save(distributionCenter);
        }
        return null;
    }

    public boolean deleteDistributionCenter(Long dcNumber){
        if (this.searcDistributionCenter(dcNumber) != null){
            DistributionCenter distributionCenter = this.searcDistributionCenter(dcNumber);

            distributionCenterDao.delete( distributionCenter);
            return true;
        }
        return  false;
    }

    @Override
    public DistributionCenter findBydcNumber(Long dcNumber) {
        if (distributionCenterDao.findByDcNumber(dcNumber)  != null){
            return   distributionCenterDao.findByDcNumber(dcNumber);
        }

        return null;
    }

}
