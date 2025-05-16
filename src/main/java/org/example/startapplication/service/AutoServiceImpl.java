package org.example.startapplication.service;

import lombok.AllArgsConstructor;
import org.example.startapplication.entity.Auto;
import org.example.startapplication.repo.AutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutoServiceImpl implements AutoService {
    private AutoRepository autoRepository;

    @Override
    public Auto create(Auto user) {
        return autoRepository.save(user);
    }


    @Override
    public List<Auto> getAll() {
        return autoRepository.findAll();
    }


    @Override
    public Auto getById(Long id) {
        return autoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Авто не найден"));
    }


    @Override
    public void delete(Long id) {
        autoRepository.deleteById(id);
    }
}

