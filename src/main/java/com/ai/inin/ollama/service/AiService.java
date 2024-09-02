package com.ai.inin.ollama.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.model.Generation;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    @Autowired
    private ChatModel chatModel;

    public String generateResult(String prompt) {
        ChatResponse response = chatModel.call(
                new Prompt(prompt)
        );
        return response.getResult().getOutput().getContent();
    }
}
