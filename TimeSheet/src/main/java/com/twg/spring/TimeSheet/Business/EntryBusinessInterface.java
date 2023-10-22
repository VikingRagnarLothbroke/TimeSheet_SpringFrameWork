package com.twg.spring.TimeSheet.Business;

import java.util.List;

import com.twg.spring.TimeSheet.Entities.Entry;

public interface EntryBusinessInterface {
  
	public void saveentry(Entry entry);
	
	public List<Entry> findByUserId(int id);
	
	public Entry findById(int id);
	
	public void update(Entry entry);
	
	public void delete(Entry entry);
}
