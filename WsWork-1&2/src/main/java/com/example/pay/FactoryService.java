package com.example.pay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryService {

	@Autowired
	 private FactoryRep factoryRep;
	
	
	
	public List<Factories> findAll(){
		return (List<Factories>) factoryRep.findAll();
	}
	public Factories findbyId(int id){
		Factories factory = factoryRep.findById(id)
			  .orElseThrow(RuntimeException::new);
		return factory;
	}
	
	public Factories savebyId(int id,String name,int countryCode){
		Factories factory = factoryRep.findById(id)
				  .orElseThrow(RuntimeException::new);
		factory.setId(id);
		factory.setName(name);
		factory.setCountryCode(countryCode);
		
		factoryRep.save(factory);
		return factory;
	}

	public List<Factories> Add(Factories factory) {
		// TODO Auto-generated method stub
		factoryRep.save(factory);
		return (List<Factories>) factoryRep.findAll();
	}
	
	
	public List <Factories> delete(int id){
		Factories factory = factoryRep.findById(id)
				  .orElseThrow(RuntimeException::new);
		
		factoryRep.deleteById(id);
		return (List<Factories>) factoryRep.findAll();
	}
	

	
}
