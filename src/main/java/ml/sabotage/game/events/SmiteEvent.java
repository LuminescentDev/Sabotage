package ml.sabotage.game.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ml.sabotage.game.roles.IngamePlayer;

public class SmiteEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private IngamePlayer player;
	
	public SmiteEvent(IngamePlayer player) {
		this.player = player;
	}
	
	public IngamePlayer getPlayer() {
		return this.player;
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
