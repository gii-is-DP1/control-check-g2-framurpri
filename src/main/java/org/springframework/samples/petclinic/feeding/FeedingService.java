package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FeedingService {
    
	@Autowired
	private FeedingRepository fr;
	
	@Transactional
	public List<Feeding> getAll(){
        return fr.findAll();
    }
	
	@Transactional
    public List<FeedingType> getAllFeedingTypes(){
        return null;
    }
	
	@Transactional
    public FeedingType getFeedingType(String typeName) {
        return fr.getFeedingType(typeName);
    }
	
	@Transactional
    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
        return null;       
    }

    
}
