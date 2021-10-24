package com.personajes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Character{
	
	private int x = 0, y = 0;
	private Texture img;
	private TextureRegion frameActual;
	private Animation animation;
	private TextureRegion [] movimiento;
	private float time;
	
	public Character(int x, int y) {
		setPosition(x, y);
	}

	public void setAnimation(String resources, int nFrames, int nRows) {
		img = new Texture(Gdx.files.internal(resources));
		TextureRegion [][] tmp = TextureRegion.split(img, img.getWidth()/nFrames, img.getHeight()/nRows);
		movimiento = new TextureRegion[nFrames];
		
		for (int i = 0; i < movimiento.length; i++) movimiento[i] = tmp[0][i];
		
		animation = new Animation(0.1f, movimiento);
		
		time = 0f;
	}
	
	public void render(final SpriteBatch batch) {
		time += Gdx.graphics.getDeltaTime();
		frameActual = (TextureRegion) animation.getKeyFrame(time,true);
		batch.draw(frameActual,x,y);
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
