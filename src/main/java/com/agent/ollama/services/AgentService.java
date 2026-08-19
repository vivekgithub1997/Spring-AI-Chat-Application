package com.agent.ollama.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

	private final ChatClient chatClient;

	public AgentService(ChatClient.Builder builder) {

		this.chatClient = builder.build();
	}

	public String chat(String query) {

		return chatClient.prompt(query).call().content();
	}

}
