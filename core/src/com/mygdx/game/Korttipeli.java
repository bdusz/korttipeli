package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics.DisplayMode;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Korttipeli extends Game {

  	SpriteBatch batch;
    
	public void create() {
		batch = new SpriteBatch();
		DisplayMode desktopDisplayMode = Gdx.graphics.getDisplayMode();
        Gdx.graphics.setWindowedMode(1920, 1279);

		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render(); 
	}

	public void dispose() {
		batch.dispose();
	}

}