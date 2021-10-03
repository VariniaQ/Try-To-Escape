package com.personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ControlaAnimacion {
	
	public static Animation getAnimation(String resource, int animLength) { //se debe indicar la ruta de la imagen y la cant. de frames
		Texture texture = new Texture(Gdx.files.internal(resource));
		
		TextureRegion [][] temporal = TextureRegion.split(texture, texture.getWidth()/animLength,texture.getHeight());
		
		TextureRegion [] animationFrames = new TextureRegion[animLength];
		
		for (int i = 0; i < animLength;	i++) animationFrames[i] = temporal[0][i];
		
		Animation animation = new Animation(0.1f,animationFrames);
		return animation;
	}
}
