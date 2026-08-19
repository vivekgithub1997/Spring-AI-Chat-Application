package com.agent.ollama.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agent.ollama.services.AgentService;

@RestController
public class AgentController {

	private final AgentService agentService;

	public AgentController(AgentService agentService) {
		this.agentService = agentService;
	}

	@GetMapping("/chat")
	public ResponseEntity<String> chat(@RequestParam("query") String query) {

		String chat = agentService.chat(query);

		return ResponseEntity.ok(chat);
	}

}
