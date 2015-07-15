package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MyGdxGame extends ApplicationAdapter {

	Texture img;
	SpriteBatch batch;
	FPSLogger fpsLogger;



	float terrainOffset;
	Animation plane;

	float planeAnimTime;
	Vector2 carVelocity = new Vector2();
	Vector2 carPosition = new Vector2();
	Vector2 carDefaultPosition = new Vector2();
	Vector2 gravity= new Vector2();
	private static final Vector2 damping= new Vector2(0.99f,0.99f);
	TextureAtlas atlas;
	Viewport viewport;
	@Override
	public void create () {
		batch = new SpriteBatch();
		fpsLogger = new FPSLogger();
		img = new Texture("car.bmp");
		carPosition.x = 600;
		carPosition.y = 0;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, carPosition.x, carPosition.y);

		batch.end();
		fpsLogger.log();
		
		carPosition.y += 1;
		updateScene();
		drawScene();
	}

	private void updateScene() {


	}


	private void drawScene() {



	}



}
