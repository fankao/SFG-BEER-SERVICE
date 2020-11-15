package com.spring.beer.sfgbeerservice.web.repositories;

import com.spring.beer.sfgbeerservice.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
