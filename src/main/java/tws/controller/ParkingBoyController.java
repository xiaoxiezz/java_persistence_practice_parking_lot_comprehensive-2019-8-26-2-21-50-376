package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

import java.net.URI;
import java.util.List;

public class ParkingBoyController {
    @Autowired
    private ParkingBoyMapper parkingboyMapper;

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(parkingboyMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<ParkingBoy> insert(@RequestBody ParkingBoy parkingboy) {
        parkingboyMapper.insert(parkingboy);
        return ResponseEntity.created(URI.create("/employees/" + parkingboy.getId())).body(parkingboy);
    }
}
