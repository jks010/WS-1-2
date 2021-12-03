package com.example.pay;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@ComponentScan
@Repository
public interface FactoryRep extends CrudRepository<Factories, Integer>{
}
