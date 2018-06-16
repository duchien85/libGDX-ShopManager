package com.gpteam.shopmanager.screens;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.game.engine.Engine;
import com.gpteam.shopmanager.society.SocietyClass;

public class ShopManager extends Game {
    public SpriteBatch batch;
    public OrthographicCamera camera;
    public FPSLogger fpsLogger;
    public Engine engine;
    public AssetManager assetManager;

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    // TODO add materials to the game from which the products are created - adds the possibility for the use to own a producer company

    public ShopManager() {
        camera = new OrthographicCamera();
        fpsLogger = new FPSLogger();
        assetManager = new AssetManager();
        engine = new Engine();
        camera.position.set(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2, 0);
    }

    @Override
    public void create() {
        assetManager.load(("font.fnt"), BitmapFont.class);
        assetManager.finishLoading();

        System.out.println(SocietyClass.values().length);

        batch = new SpriteBatch();
        setScreen(new MenuScreen(this));
    }

    @Override
    public void resize(int width, int height) {
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

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }
}
