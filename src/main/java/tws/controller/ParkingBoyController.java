package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {
    @Autowired
    private ParkingBoyMapper parkingBoyMapper;

//    @GetMapping("")
//    public ResponseEntity<List<Employee>> getAll() {
//        return ResponseEntity.ok(parkingBoyMapper.selectAll());
//    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void insertParkingBoys(@RequestBody ParkingBoy parkingBoy){
        parkingBoyMapper.insertParkingBoy(parkingBoy);
    }
}
