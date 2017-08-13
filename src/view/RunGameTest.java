package view;

import org.newdawn.slick.*;

import gameStates.Engine;
import gameStates.GameStateHandler;

public class RunGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Engine game = Engine.instance;
		

		GameStateHandler game = new GameStateHandler("FruitShooter 1.0a");
		

		
		try { 
		    AppGameContainer container = new AppGameContainer(game); 
		    container.setDisplayMode(GameWindow.SCREEN_WIDTH,GameWindow.SCREEN_HEIGHT,false);	//boolean is for fullscreen 
		    container.setTargetFrameRate(60);
		    container.start(); 
		} catch (SlickException e) { 
		    e.printStackTrace(); 
		}
		
	}

}
