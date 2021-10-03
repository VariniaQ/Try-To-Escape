package com.trytoescape.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.personajes.Personaje;
import com.utilities.Resources;
import com.utilities.Text;

public class TryToEscape extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Personaje p;
	Text title;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("backgrounds/grunge-tileset.png");
		title = new Text(12,Color.WHITE,Resources.TITLEFONT); //no funciona . TODO agregar textos, personaje, vida, inventario
		p = new Personaje(100,50);
		//agregar animation
	}

	@Override
	public void render () {
		ScreenUtils.clear(0,0,0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		title.draw();
		title.setPosition(500, 500);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
