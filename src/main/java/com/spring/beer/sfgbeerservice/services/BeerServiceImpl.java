package com.spring.beer.sfgbeerservice.services;


import com.spring.beer.model.BeerDto;
import com.spring.beer.sfgbeerservice.domain.Beer;
import com.spring.beer.sfgbeerservice.repositories.BeerRepository;
import com.spring.beer.sfgbeerservice.web.controller.NotFoundException;
import com.spring.beer.sfgbeerservice.web.mappers.BeerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {
    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getBeerById(UUID beerId){
        return beerMapper.beerToBeerDto(beerRepository.findById(beerId).orElseThrow(NotFoundException::new));
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beer) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtToBeer(beer)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beer) {
        Beer updatedBeer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
        updatedBeer.setBeerName(beer.getBeerName());
        updatedBeer.setBeerStyle(beer.getBeerStyle().name());
        updatedBeer.setPrice(beer.getPrice())   ;
        updatedBeer.setUpc(beer.getUpc());
        return beerMapper.beerToBeerDto(beerRepository.save(updatedBeer));

    }
}
