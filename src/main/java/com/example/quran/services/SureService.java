package com.example.quran.services;

import com.example.quran.entities.Sure;
import com.example.quran.repositories.SureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SureService {

    private SureRepository sureRepository;

    @Autowired
    public SureService(SureRepository sureRepository) {
        this.sureRepository = sureRepository;
    }

    public List<Sure> getAll(){
        return this.sureRepository.findAll();
    }

    public Sure findById(int id){
        return this.sureRepository.findById(id).orElse(null);
    }
}
