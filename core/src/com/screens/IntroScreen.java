package com.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.enums.Characters;
import com.personajes.Character;
import com.trytoescape.game.TryToEscape;
import com.trytoescape.io.Inputs;
import com.utilities.Render;
import com.utilities.Resources;

import components.AbstractScreen;

public class IntroScreen extends AbstractScreen{
	
	private Texture wallp1,wallp2;
	private Inputs inputs;
	private SpriteBatch b;
	private int width, height;
	private Sound sound;
	private Character p;
	private TextureAtlas atlas;
	
	public IntroScreen(TryToEscape game) {
		super(game);
	}

	@Override
	public void show() {
		inputs = new Inputs();
		atlas = new TextureAtlas("texturePacker/characters.pack");
		
		b = Render.addSpriteBatch();
		
		//set the posX,posY to character
		p = new Character(50, 50);
		
		//to set animation to character you should indicate: resource character, number of frames, number of rows
		p.setAnimation(Characters.PJ.getResource(), Characters.PJ.getNFrames(), Characters.PJ.getNRows());
		
		//stages
		wallp1 = new Texture(Resources.INTROWALLPAPER);
		wallp2 = new Texture(Resources.INTROWALLPAPER2);
		
		//window sizes
		width = Gdx.graphics.getWidth()/2;// window game width 
		height = Gdx.graphics.getHeight()/2;// window game height
		
		//TODO it should sounds when p come to the door
		//sound = Gdx.audio.newSound(Gdx.files.internal("sounds/door_open.mp3"));
		//sound.play(1.0f,1.0f,0f);
	}

	public TextureAtlas getAtlas() {
		return atlas;
	}
	
	@Override
	public void render(float delta) {
		Render.cleanScreen();
		b.begin();
			// draw the 1st wallpaper (blue) in the top right corner
			b.draw(wallp1, 0, 0, width, wallp1.getHeight());
			// draw the 2nd wallpaper (red) in the bottom left corner
			b.draw(wallp2, width, height, width, wallp2.getHeight());
			// draw the character
				p.render(b);
			//if right key is on, walk sprite  on
			//if right key is on, walk sprite left on
			//TODO activate animation depend of the key pressed	
			
		b.end();
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
		sound.dispose();
		b.dispose();
		wallp1.dispose();
		wallp2.dispose();
	}

}
