package com.SpringDB.DatabaseConnectivity.service.impl;

import com.SpringDB.DatabaseConnectivity.model.Attendance;
import com.SpringDB.DatabaseConnectivity.repository.AttendanceRepository;
import com.SpringDB.DatabaseConnectivity.service.AttendanceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceServiceImpl(AttendanceRepository attendanceRepository){
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public Attendance addAttendance(Attendance attendance){
        return attendanceRepository.save(attendance);
    }

    @Override
    public List<Attendance> getAllAttendance(){
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance getAttendanceById(int id){
        return attendanceRepository.findById(id).orElse(null);
    }

    @Override
    public Attendance updateAttendance(int id, Attendance attendance){

        Attendance existing = attendanceRepository.findById(id).orElse(null);

        if(existing != null){
            existing.setEmpId(attendance.getEmpId());
            existing.setDate(attendance.getDate());
            existing.setCheckIn(attendance.getCheckIn());
            existing.setCheckOut(attendance.getCheckOut());
            existing.setStatus(attendance.getStatus());

            return attendanceRepository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteAttendance(int id){
        attendanceRepository.deleteById(id);
    }
}