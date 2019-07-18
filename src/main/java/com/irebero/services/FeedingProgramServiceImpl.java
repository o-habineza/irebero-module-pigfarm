package com.irebero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irebero.entities.FeedingProgram;
import com.irebero.repos.FeedingProgramRepository;

@Service
public class FeedingProgramServiceImpl implements  FeedingProgramService{

	@Autowired
	private FeedingProgramRepository repository;
	
	@Override
	public FeedingProgram saveFeedingProgram(FeedingProgram feedingProgram) {
		return repository.save(feedingProgram);
	}

	@Override
	public FeedingProgram updateFeedingProgram(FeedingProgram feedingProgram) {
		return repository.save(feedingProgram);
	}

	@Override
	public void deleteFeedingProgram(FeedingProgram feedingProgram) {
		repository.delete(feedingProgram);
		
	}

	@Override
	public FeedingProgram getFeedingProgramById(int feedingProgramId) {
		return repository.findById(feedingProgramId).orElse(null);
	}

	@Override
	public List<FeedingProgram> getAllFeedingPrograms() {
		return repository.findAll();
	}

	public FeedingProgramRepository getRepository() {
		return repository;
	}

	public void setRepository(FeedingProgramRepository repository) {
		this.repository = repository;
	}

	
}
