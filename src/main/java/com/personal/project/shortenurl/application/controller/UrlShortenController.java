package com.personal.project.shortenurl.application.controller;

import com.personal.project.model.UrlShortenReqBody;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UrlShortenController {

    @PostMapping(path = "/shorten")
    private ResponseEntity<String> urlShorten(@RequestBody UrlShortenReqBody request) {
        return ResponseEntity.ok("worked");
    }
}
