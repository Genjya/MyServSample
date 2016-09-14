package com.zhenya.server.service;

import com.zhenya.server.entity.Remind;
import com.zhenya.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    private RemindRepository repository;

    public List<Remind> getAll() {
        List<Remind> list = repository.findAll();
        return repository.findAll();
    }

    public Remind getByID(long remindID) {
        return repository.findOne(remindID);
    }

    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long remindID) {
        repository.delete(remindID);
    }
}
