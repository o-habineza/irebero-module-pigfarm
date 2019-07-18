package com.irebero.services;

import java.util.List;

import com.irebero.entities.Pen;

public interface PenService {

    Pen savePen(Pen pen);
	
	Pen updatePen(Pen pen);
	
	void deletePen(Pen pen);
	
	Pen getPenById(int penId);
	
	List<Pen>getAllPens();
	
}
