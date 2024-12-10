package ru.netology.homework05122024.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.homework05122024.domain.SystemProfile;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ProfileController {
    private SystemProfile profile;

//    public ProfileController(SystemProfile profile) {
//        this.profile = profile;
//    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
