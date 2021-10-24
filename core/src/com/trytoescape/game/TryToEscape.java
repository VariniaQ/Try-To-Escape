package com.trytoescape.game;

import com.badlogic.gdx.Game;
import com.screens.Menu;
import com.utilities.Render;

public class TryToEscape extends Game {
	
	@Override
	public void create () {
		Render.app = this;
		this.setScreen(new Menu(this));
	}
	
	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}
}
