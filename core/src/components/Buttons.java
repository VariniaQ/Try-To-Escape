package components;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.screens.IntroScreen;
import com.trytoescape.game.TryToEscape;

public class Buttons {
	
	private TryToEscape game;
	/*TODO hacer que esto sea reutilizable. Al pasarle el boton, sonido y la pantalla a la que quiere ir, debería funcionar*/
	public void goBack(TextButton button, final Sound sound) {
		button.addListener(new ChangeListener() {		
			public void changed(ChangeEvent event, Actor actor) {
				game.setScreen(new IntroScreen(game));
				sound.dispose();
			} 
		});
	}
}
