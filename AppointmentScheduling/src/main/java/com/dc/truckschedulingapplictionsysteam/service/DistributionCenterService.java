package com.dc.truckschedulingapplictionsysteam.service;


import com.dc.truckschedulingapplictionsysteam.model.DistributionCenter;

public interface DistributionCenterService {
    public boolean addDistributionCenter(DistributionCenter distributionCenter);

    public DistributionCenter searcDistributionCenter(Long dcNumber);

    DistributionCenter updateDistributionCenter(DistributionCenter distributionCenter);

    boolean deleteDistributionCenter(Long dcNumber);

    DistributionCenter findBydcNumber(Long dcNumber);
}