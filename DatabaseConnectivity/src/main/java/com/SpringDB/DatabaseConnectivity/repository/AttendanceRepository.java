package com.SpringDB.DatabaseConnectivity.repository;

import com.SpringDB.DatabaseConnectivity.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer>
{

}