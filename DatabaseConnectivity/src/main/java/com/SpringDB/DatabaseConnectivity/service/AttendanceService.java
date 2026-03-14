package com.SpringDB.DatabaseConnectivity.service;

import com.SpringDB.DatabaseConnectivity.model.Attendance;
import java.util.List;

public interface AttendanceService {

    Attendance addAttendance(Attendance attendance);

    List<Attendance> getAllAttendance();

    Attendance getAttendanceById(int id);

    Attendance updateAttendance(int id, Attendance attendance);

    void deleteAttendance(int id);
}