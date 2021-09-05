package com.personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Personaje {
	public int x,y;
	private Animation animation;
	private float tiempo;
	private TextureRegion [] regionMovimiento;
	private Texture imagen;
	private TextureRegion frameActual;
	
	public Personaje(int x, int y) {
		this.x = x;
		this.y = y;
		
		tiempo = 0f;	
	}
	
	public void render(final SpriteBatch batch) {
		tiempo += Gdx.graphics.getDeltaTime();
		frameActual = (TextureRegion) animation.getKeyFrame(tiempo,true);
		batch.draw(frameActual, x, y);
	}
	
	public void SetAnimation(String resource, int animLength) {
		animation = ControlaAnimacion.getAnimation(resource, animLength);
	}
}
