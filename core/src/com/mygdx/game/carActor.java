package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Exeller666 on 15.07.2015.
 */
public class carActor extends Actor{
    Texture texture = new Texture(Gdx.files.internal("car.bmp"));


    @Override
    public void draw(Batch batch, float alpha){
        this.setY(this.getY() + 1);

            batch.draw(texture,getX(),getY());



         if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){

            this.setX(this.getX() + 5 );
             this.setRotation(this.getRotation() + 5);

         }
         if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){

             this.setX(this.getX() - 5);
             this.setRotation(this.getRotation() - 5);

         }

    }



}
