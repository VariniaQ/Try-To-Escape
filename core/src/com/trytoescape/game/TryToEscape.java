package com.trytoescape.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.personajes.Personaje;

public class TryToEscape extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Personaje p;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("grunge-tileset.png");
		p = new Personaje(100,50);
		//agregar animation
	}

	@Override
	public void render () {
		ScreenUtils.clear(0,0,0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
