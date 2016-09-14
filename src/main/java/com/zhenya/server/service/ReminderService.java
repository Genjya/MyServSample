package com.zhenya.server.service;

import com.zhenya.server.entity.Remind;

import java.util.List;

public interface ReminderService {
    List<Remind> getAll();
    Remind getByID(long remindID);
    Remind save(Remind remind);
    void remove(long remindID);
}
