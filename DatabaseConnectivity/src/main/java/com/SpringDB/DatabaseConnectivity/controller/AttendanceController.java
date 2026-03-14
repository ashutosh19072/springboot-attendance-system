package com.SpringDB.DatabaseConnectivity.controller;

import com.SpringDB.DatabaseConnectivity.model.Attendance;
import com.SpringDB.DatabaseConnectivity.service.AttendanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService){
        this.attendanceService = attendanceService;
    }

    @PostMapping("/add")
    public Attendance addAttendance(@RequestBody Attendance attendance){
        return attendanceService.addAttendance(attendance);
    }

    @GetMapping("/all")
    public List<Attendance> getAllAttendance(){
        return attendanceService.getAllAttendance();
    }

    @GetMapping("/{id}")
    public Attendance getAttendance(@PathVariable int id){
        return attendanceService.getAttendanceById(id);
    }

    @PutMapping("/{id}")
    public Attendance updateAttendance(@PathVariable int id, @RequestBody Attendance attendance){
        return attendanceService.updateAttendance(id, attendance);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendance(@PathVariable int id){
        attendanceService.deleteAttendance(id);
    }
}