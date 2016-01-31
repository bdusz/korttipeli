package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainMenuScreen implements Screen {
        final Korttipeli game;
	OrthographicCamera camera;
	public static Texture backgroundTexture = new Texture("C:/Users/Jimi/Desktop/peli2/core/pics/Mainmenu.png");
   public static Sprite backgroundSprite = new Sprite(backgroundTexture);
   // private SpriteBatch spriteBatch;

	public MainMenuScreen(final Korttipeli gam) {
		game = gam;

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1920, 1279);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		game.batch.setProjectionMatrix(camera.combined);

		game.batch.begin();
		game.batch.draw(backgroundSprite,0,0);

		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
		
	}
}