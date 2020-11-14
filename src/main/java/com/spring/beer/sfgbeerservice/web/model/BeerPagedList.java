package com.spring.beer.sfgbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerPagedList> {
    public BeerPagedList(List<BeerPagedList> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerPagedList> content) {
        super(content);
    }
}
