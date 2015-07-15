package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Exeller666 on 15.07.2015.
 */
public class MainScreen implements Screen{



    Texture img;
    SpriteBatch batch;
    FPSLogger fpsLogger;
    private Stage stage = new Stage();

    Actor carActor;


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
    public void show() {


        carActor myActor = new carActor();
        myActor.setX(600);
        myActor.setY(0);

        stage.addActor(myActor);







    }

    @Override
    public void render(float delta) {

       // Gdx.gl.glClearColor(1, 1, 1, 1);
        //Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //batch.begin();

       // batch.draw(img, carPosition.x, carPosition.y);
       // if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){

       //     carPosition.x += 5;

      //  }
       // if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){

   //         carPosition.x -= 5;

       // }


       // carPosition.y += 1;
        //updateScene();
       // drawScene();
       // batch.end();
       // fpsLogger.log();

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(); //update all actors
        stage.draw();



    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
