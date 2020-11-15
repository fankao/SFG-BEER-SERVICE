package com.spring.beer.sfgbeerservice.web.mappers;

import com.spring.beer.sfgbeerservice.domain.Beer;
import com.spring.beer.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtToBeer(BeerDto dto);
}
