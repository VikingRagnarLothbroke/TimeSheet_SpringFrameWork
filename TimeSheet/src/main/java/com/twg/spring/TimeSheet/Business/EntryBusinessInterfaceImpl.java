package com.twg.spring.TimeSheet.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.twg.spring.TimeSheet.Dao.EntryDaoInterface;
import com.twg.spring.TimeSheet.Entities.Entry;

@Component
public class EntryBusinessInterfaceImpl implements EntryBusinessInterface {
	
	@Autowired
	private EntryDaoInterface entryDaoInterface;

	public EntryDaoInterface getEntryDaoInterface() {
		return entryDaoInterface;
	}

	public void setEntryDaoInterface(EntryDaoInterface entryDaoInterface) {
		this.entryDaoInterface = entryDaoInterface;
	}

	public void saveentry(Entry entry) {
		entryDaoInterface.saveentry(entry);
		
	}

	@Override
	public List<Entry> findByUserId(int id) {
		
		return entryDaoInterface.findByUserId(id);
	}

	@Override
	public Entry findById(int id) {
		
		return entryDaoInterface.findById(id);
	}

	@Override
	public void update(Entry entry) {
		
		entryDaoInterface.update(entry);
		
	}

	@Override
	public void delete(Entry entry) {
		entryDaoInterface.delete(entry);
		
	}
}
