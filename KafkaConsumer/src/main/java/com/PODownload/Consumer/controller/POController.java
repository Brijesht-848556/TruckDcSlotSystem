package com.PODownload.Consumer.controller;

import com.PODownload.Consumer.model.POModel;
import com.PODownload.Consumer.repository.PORepository;
import com.PODownload.Consumer.service.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class POController {
    @Autowired
    private MessageListener messageListener;

    @Autowired
    private PORepository poRepository;


    @GetMapping("/Get/{id}")
    public Optional<POModel> getall(@PathVariable Integer id)
    {
      return poRepository.findById(id) ;
        //  return ResponseEntity.ok(dCservice.getbyId(id));
    }

}
