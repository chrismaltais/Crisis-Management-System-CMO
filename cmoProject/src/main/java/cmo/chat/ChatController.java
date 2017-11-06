package cmo.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

	@MessageMapping("/chat.sendMessage")
	@SendTo("/channel/cmopmochat")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
		return chatMessage;
	}

	@MessageMapping("/chat.addUser")
	@SendTo("/channel/cmopmochat")
	public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		// Add username in web socket session
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		headerAccessor.getSessionAttributes().put("channeltype", "cmopmochat");

		return chatMessage;
	}

	@MessageMapping("/chat.sendInternalMessage")
	@SendTo("/channel/cmoefchat")
	public ChatMessage sendInternalMessage(@Payload ChatMessage chatMessage) {
		return chatMessage;
	}

	@MessageMapping("/chat.addInternalUser")
	@SendTo("/channel/cmoefchat")
	public ChatMessage addInternalUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		// Add username in web socket session
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		headerAccessor.getSessionAttributes().put("channeltype", "cmoefchat");

		return chatMessage;
	}

}