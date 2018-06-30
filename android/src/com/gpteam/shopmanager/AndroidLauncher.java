package com.gpteam.shopmanager;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.gpteam.shopmanager.game.Game;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		config.useAccelerometer = false;
		config.useGyroscope = false;
		config.useCompass = false;
		config.useWakelock = true;
		config.hideStatusBar = true;

		initialize(new Game(), config);
	}
}
