package Daritn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Daritn.spring.entity.Location;
import Daritn.spring.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	LocationRepository locationRepository;
	
	public List<Location> getLocations(){
		List<Location> locations=locationRepository.findAll();
		for (Location Location: locations) {
			System.out.println("Location :" + Location);
		}
		return locations;
	}
	public Location addLocation(Location l) {
		return locationRepository.save(l);
	}
	public Location EditLocation(Location l) {
		return locationRepository.save(l);
	}
	public void DeleteContratLocation(Long id) {
		locationRepository.deleteById(id);
	}
	public Location retrieveLocation(Long id) {
		Location location = locationRepository.findById(id).orElse(null);
		System.out.println("Location :" + location);
		return location; 
	}
}
