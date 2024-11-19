package com.karan.journal.repository;


import com.karan.journal.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

// interface, controller --> service --> repository(interface)
public interface JournalEntryRepository  extends MongoRepository<JournalEntry, ObjectId> {
}
