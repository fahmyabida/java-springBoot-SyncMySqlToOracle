package com.learnsync.sync.oracle.Controller;

import com.learnsync.sync.oracle.model.TMJadwal;
import com.learnsync.sync.oracle.repository.TMJadwalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/public/api/v1")
public class TMJadwalController {

    @Autowired
    TMJadwalRepository jadwalRepo;

    @GetMapping("/jadwal")
    public ResponseEntity getListJadwal(){
        Map<String, Object> map = new HashMap<>();
        List<TMJadwal> finalList = jadwalRepo.findAll();
        map.put("total", finalList.size());
        map.put("count", finalList.size());
        map.put("data" , finalList);
        return new ResponseEntity(map, HttpStatus.OK);
    }

}
