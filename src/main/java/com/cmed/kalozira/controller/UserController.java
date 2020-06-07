package com.cmed.kalozira.controller;

import com.cmed.kalozira.entity.CMUser;
import com.cmed.kalozira.form.UserForm;
import com.cmed.kalozira.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController()
@RequestMapping("/api/v1/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/me")
    public ResponseEntity currentUser(@AuthenticationPrincipal UserDetails userDetails) {
        Map<Object, Object> model = new HashMap<>();
        model.put("username", userDetails.getUsername());
        model.put("roles", userDetails.getAuthorities()
                .stream()
                .map(a -> ((GrantedAuthority) a).getAuthority())
                .collect(toList())
        );
        return ok(model);
    }

    @GetMapping("")
    public ResponseEntity<List<CMUser>> all() {
        return ok(userRepository.findAll());
    }

    @SuppressWarnings("rawtypes")
    @PostMapping("")
    public ResponseEntity save(@RequestBody UserForm form, HttpServletRequest request) {
        CMUser saved = userRepository.save(
                CMUser.builder().username(form.getUsername())
                        .encrytedPassword(form.getEncryptedPassword())
                        .build());

        return created(
                ServletUriComponentsBuilder
                        .fromContextPath(request)
                        .path("/v1/users/{id}")
                        .buildAndExpand(saved.getId())
                        .toUri())
                .build();
    }
}
