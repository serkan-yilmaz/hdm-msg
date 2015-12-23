package de.hdm.gruppe2.server.db;


import java.util.Vector;

import de.hdm.gruppe2.shared.bo.*;

public class ChatMapper {
	
	private static ChatMapper chatMapper = null;
	
	protected ChatMapper(){
		
	}

	public static ChatMapper chatMapper(){
		if (chatMapper == null) {
			chatMapper = new ChatMapper();
		}
		return chatMapper;
	}
	
	public Chat insert (Chat chat){
		return null;
	}
	public Chat update (Chat chat){
		return null;
	}
	
	public Chat delete (Chat chat){
		return null;
	}
	
	public Vector <Chat> getALLUser(){
		return null;
	}
	
	public Vector <Chat> getAllMessage(){
		return null;
	}
	
}
