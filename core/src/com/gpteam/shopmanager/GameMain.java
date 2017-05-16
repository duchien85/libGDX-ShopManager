package com.gpteam.shopmanager;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.Screens.GameScreen;
import com.gpteam.shopmanager.Society.SocietyClass;
import com.gpteam.shopmanager.Engine.Modules.Text.TextHandler;

public class GameMain extends Game {
    public SpriteBatch batch;
    public OrthographicCamera camera;
    public FPSLogger fpsLogger;
    public BitmapFont balanceFont;
    AssetManager assetManager;

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;


    public GameMain() {
        camera = new OrthographicCamera();
        fpsLogger = new FPSLogger();
        assetManager = new AssetManager();
        camera.position.set(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2, 0);
    }

    @Override
    public void create() {
        assetManager.load(("font.fnt"), BitmapFont.class);
        assetManager.finishLoading();

        TextHandler textHandler = new TextHandler("PL");

        System.out.println(SocietyClass.values().length);

        batch = new SpriteBatch();
        balanceFont = assetManager.get("font.fnt", BitmapFont.class);
        setScreen(new GameScreen(this));
    }


    private void updateScene() {
//	    float deltaTime = Gdx.graphics.getDeltaTime();

    }

    private void drawScene() {
    }

    @Override
    public void render() {
        super.render();
        fpsLogger.log();
    }
}
