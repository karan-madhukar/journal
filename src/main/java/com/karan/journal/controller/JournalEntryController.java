//package com.karan.journal.controller;
//
//import com.karan.journal.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll() {
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @GetMapping("/id/{id}")
//            public JournalEntry getById(@PathVariable Long id) {
//        return journalEntries.get(id);
//    }
//
//    @PostMapping
//    public boolean createJournalEntry(@RequestBody JournalEntry journalEntry) {
//        journalEntries.put(journalEntry.getId(), journalEntry);
//        return true;
//    }
//
//    @PutMapping("/id/{id}")
//    public JournalEntry updateJournalEntry(@PathVariable Long id, @RequestBody JournalEntry journalEntry) {
//        return journalEntries.put(id, journalEntry);
//    }
//
//    @DeleteMapping("id/{id}")
//    public JournalEntry deleteJournalEntry(@PathVariable Long id) {
//        return journalEntries.remove(id);
//    }
//
//}
