package com.irebero.services;

import java.util.List;

import com.irebero.entities.FeedingProgram;;

public interface FeedingProgramService {

    FeedingProgram saveFeedingProgram(FeedingProgram feedingProgram);
	
	FeedingProgram updateFeedingProgram(FeedingProgram feedingProgram);
	
	void deleteFeedingProgram(FeedingProgram feedingProgram);
	
	FeedingProgram getFeedingProgramById(int feedingProgramId);
	
	List<FeedingProgram>getAllFeedingPrograms();
	
}
