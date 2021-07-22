package com.sunil.game.dto;

import java.io.Serializable;

public class GameDTO implements Serializable{
	
	private String name;
	private String version;
	private String developedBy;
	private int maxPlayers;
	private double memoryRequired;
	private boolean online;
	
	public GameDTO() {
		System.out.println("invoked default constructor");
	}

	public GameDTO(String name, String version, String developedBy, int maxPlayers, double memoryRequired,
			boolean online) {
		super();
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
		this.maxPlayers = maxPlayers;
		this.memoryRequired = memoryRequired;
		this.online = online;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", maxPlayers="
				+ maxPlayers + ", memoryRequired=" + memoryRequired + ", online=" + online + "]";
	}
	
	@Override
	public boolean equals(Object ref) {
		if(ref == null) return false;
		if(ref instanceof GameDTO) {
			GameDTO cast = (GameDTO) ref;
			if(this.name.equals(cast.name) && this.version.equals(cast.version)&& this.developedBy.equals(cast.developedBy)) {
	
			}
		}
		return true;

	}
	
	@Override
	public int hashCode() {
		System.out.println("hascode : " + this);
		return 63;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public double getMemoryRequired() {
		return memoryRequired;
	}

	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
	
	

}
