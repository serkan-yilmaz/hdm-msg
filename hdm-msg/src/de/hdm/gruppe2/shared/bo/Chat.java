package de.hdm.gruppe2.shared.bo;

import java.util.ArrayList;

public class Chat extends BusinessObject {

	private ArrayList<User> memberList;
	
	private ArrayList<Message> messageList;
	
	public ArrayList<Message> getmessageList() {
		return this.messageList;
	}
	
	
	
	public void setReciver (ArrayList<Message> messageList) {
		this.messageList = messageList; 
	}
	
	public ArrayList<User> getmemberList() {
		return this.memberList;
	}
	
	
	
	public void setmemberList (ArrayList<User> memberList) {
		this.memberList = memberList; 
	}
}
