
package components;

import com.badlogic.gdx.Screen;
import com.trytoescape.game.TryToEscape;

public abstract class AbstractScreen implements Screen{
	
	protected TryToEscape game;
	
	public AbstractScreen(TryToEscape game) {
		this.game = game;
	}

	@Override
	public abstract void show();

	@Override
	public abstract void render(float delta);

	@Override
	public abstract void resize(int width, int height);

	@Override
	public abstract void pause();

	@Override
	public abstract void resume();

	@Override
	public abstract void hide();

	@Override
	public abstract void dispose();
	
	public TryToEscape getGame() {
		return game;
	}
}
