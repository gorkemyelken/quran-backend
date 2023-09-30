package com.example.quran.controllers;

import com.example.quran.entities.Sure;
import com.example.quran.services.SureService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sures")
@CrossOrigin
public class SureController {

    private SureService sureService;

    @Autowired
    public SureController(SureService sureService) {
        this.sureService = sureService;
    }

    @GetMapping()
    public ResponseEntity<List<Sure>> getAll(){
        return new ResponseEntity<>(this.sureService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sure> getById(@PathVariable int id){
        return new ResponseEntity<>(this.sureService.findById(id), HttpStatus.OK);
    }

}
