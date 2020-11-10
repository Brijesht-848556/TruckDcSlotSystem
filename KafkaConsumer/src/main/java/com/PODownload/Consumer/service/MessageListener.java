package com.PODownload.Consumer.service;

import com.PODownload.Consumer.model.POModel;
import com.PODownload.Consumer.repository.PORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MessageListener {

    @Autowired
  private PORepository poRepository;

    @StreamListener(Processor.INPUT)
        public void consumerMessage(POModel poModel){
        System.out.println("Message received from Kafka Channel ....");

        poRepository.save(poModel);
        System.out.println(poModel);
    }

}
