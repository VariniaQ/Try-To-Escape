package com.trytoescape.io;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
//TODO usar esta clase
public class Inputs implements InputProcessor{
	private  boolean down = false, up = false;
	private int mouseX = 0, mouseY = 0;

	
	public boolean isDown() {
		return down;
	}
	
	public boolean isUp() {
		return up;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Keys.DOWN) {
			down = true;
		} else if(keycode == Keys.UP) {
			up = true;
		}
		return down;
	}

	@Override
	public boolean keyUp(int keycode) {
		return up;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		mouseX = screenX;
		mouseY = Gdx.graphics.getHeight()-screenY; //alter Y values (y down = 0) because Libgdx take 0 like up
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		
		return false;
	}
	
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}
	
}

