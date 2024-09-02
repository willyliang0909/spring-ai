package com.ai.inin.ollama.controller;

import com.ai.inin.ollama.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AIController {

    @Autowired
    private AiService aiService;

    @GetMapping("/generate")
    public String generate(@RequestParam String promptMessage) {
        return aiService.generateResult(promptMessage);
    }
}
