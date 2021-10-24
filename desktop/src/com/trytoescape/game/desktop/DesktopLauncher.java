package com.trytoescape.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.trytoescape.game.TryToEscape;
import com.utilities.Settings;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Settings.APPNAME;
		config.resizable = Settings.resizable;
		new LwjglApplication(new TryToEscape(), config);
	}
}
