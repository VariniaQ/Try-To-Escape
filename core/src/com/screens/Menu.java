package com.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.enums.MenuOptions;
import com.trytoescape.game.TryToEscape;
import com.utilities.Render;
import com.utilities.Resources;

import components.AbstractScreen;

public class Menu extends AbstractScreen{
	private Stage stage;
	private Skin skin;
	private Sound sound;
	
	public Menu (final TryToEscape game) {
		super(game);
		skin = new Skin(Gdx.files.internal("skin/uiskin.json"));
		
		stage =	 new Stage(new ScreenViewport());
		
		
		final Table table = new Table();
		table.setFillParent(true);
		stage.addActor(table);
		
		Label title = new Label("Try to escape", skin);

		TextButton play = new TextButton(MenuOptions.PLAY.getName(), skin);
		TextButton exit = new TextButton(MenuOptions.EXIT.getName(), skin);
		
		final int BUTTONWIDTH = 300;
		final int BUTTONHEIGHT = 60;
		final int SEPARATION = 20;
		
		table.add(play).width(BUTTONWIDTH).height(BUTTONHEIGHT).space(SEPARATION).row();
		table.add(exit).width(BUTTONWIDTH).height(BUTTONHEIGHT).space(SEPARATION).row();
		
		play.addListener(new ChangeListener() {		
			public void changed(ChangeEvent event, Actor actor) {
				game.setScreen(new IntroScreen(game));
				sound.dispose();
			}
		});
		exit.addListener(new ChangeListener() {		
			public void changed(ChangeEvent event, Actor actor) {
				Gdx.app.exit();
			}
		});
		
		stage = new Stage();
		stage.addActor(table);
		Gdx.input.setInputProcessor(stage);
		 
	}
	
	public void render(float delta) {
		Render.cleanScreen();
		stage.act();
		stage.draw();
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(stage);
		sound = Gdx.audio.newSound(Gdx.files.internal(Resources.OPENING));
		sound.play(1.0f,1.0f,0f);
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
		stage.dispose();
		sound.dispose();
		skin.dispose();
	}
}
