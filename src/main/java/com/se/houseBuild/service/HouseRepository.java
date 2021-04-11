package com.se.houseBuild.service;


import com.se.houseBuild.model.House;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends CrudRepository<House, Integer> {

}