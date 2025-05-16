package org.example.startapplication.service;

import org.example.startapplication.entity.Auto;

import java.util.List;

public interface AutoService {
    Auto create(Auto user);
    List<Auto> getAll();
    Auto getById(Long id);
    void delete(Long id);
}
