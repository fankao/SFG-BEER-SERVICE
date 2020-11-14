package com.spring.beer.sfgbeerservice.web.controller;

import com.spring.beer.sfgbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        return ResponseEntity.ok(BeerDto.builder().id(beerId).build());
    }
    @PostMapping
    public ResponseEntity<?> saveNewBeer(@RequestBody BeerDto beer){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<?> updateBeerById(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beer){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}