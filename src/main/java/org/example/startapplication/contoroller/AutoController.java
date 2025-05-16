package org.example.startapplication.contoroller;

import lombok.AllArgsConstructor;
import org.example.startapplication.entity.Auto;
import org.example.startapplication.service.AutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autos")
@AllArgsConstructor
public class AutoController {
    private final AutoService autoService;

    @PostMapping()
    public ResponseEntity<Auto> create(@RequestBody Auto auto) {
        Auto autoSaved = autoService.create(auto);
        return ResponseEntity.ok(autoSaved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(autoService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Auto>> getAll() {
        return ResponseEntity.ok(autoService.getAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Auto auto) {
        autoService.delete(auto.getId());
        return ResponseEntity.ok("Авто удалено");
    }
}
