package com.learnsync.sync.oracle.controller;

import com.learnsync.sync.oracle.model.TMJadwal;
import com.learnsync.sync.oracle.repository.TMJadwalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity getListJadwal(@RequestParam("no-mk") String noMK){
        Map<String, Object> map = new HashMap<>();
        List<TMJadwal> finalList = jadwalRepo.findByNoMK(noMK);
        map.put("total", finalList.size());
        map.put("count", finalList.size());
        map.put("data" , finalList);
        return new ResponseEntity(map, HttpStatus.OK);
    }

}
