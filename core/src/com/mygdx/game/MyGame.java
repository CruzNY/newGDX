package com.mygdx.game;

import com.badlogic.gdx.Game;

public class MyGame extends Game {
	private LoadingScreen loadingScreen;
	private PreferenceScreen preferencesScreen;
	private MenuScreen menuScreen;
	private MainScreen mainScreen;
	private ExitScreen endScreen;

	public final static int MENU = 0;
	public final static int PREFERENCES = 1;
	public final static int APPLICATION = 2;
	public final static int ENDGAME = 3;


	@Override
	public void create() {
		loadingScreen = new LoadingScreen(this);
		setScreen(loadingScreen);
	}
	public void ChangeScreen(int screen){
		switch(screen){
			case MENU:
				if(menuScreen == null) menuScreen = new MenuScreen(this);
				this.setScreen(menuScreen);
				break;
			case PREFERENCES:
				if(preferencesScreen == null) preferencesScreen = new PreferenceScreen(this);
				this.setScreen(preferencesScreen);
				break;
			case APPLICATION:
				if(mainScreen == null) mainScreen = new MainScreen(this);
				this.setScreen(mainScreen);
				break;
			case ENDGAME:
				if(endScreen == null) endScreen = new ExitScreen(this);
				this.setScreen(endScreen);
				break;
		}
	}
}
