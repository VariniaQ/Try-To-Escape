package com.utilities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.trytoescape.game.TryToEscape;

public final class Render {
	
	public static SpriteBatch batch;
	public static TryToEscape app;
	static boolean emptyRenderList = false;
	
	public static void cleanScreen() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	public static SpriteBatch addSpriteBatch() {
		batch = new SpriteBatch();
		return batch;
		
	}
}
