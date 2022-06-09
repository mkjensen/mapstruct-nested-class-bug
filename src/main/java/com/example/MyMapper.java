package com.example;

import org.mapstruct.Mapper;

@Mapper
public interface MyMapper {

    Target toTarget(Source source);
}
