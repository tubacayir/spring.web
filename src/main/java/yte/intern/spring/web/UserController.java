package yte.intern.spring.web;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yte.intern.spring.web.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private List<User> userList = new ArrayList<>();

    @PostMapping("api/users")
    public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
        // User ekleme işlemleri...
        userList.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Kullanıcı eklendi");
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userList);
    }
}
