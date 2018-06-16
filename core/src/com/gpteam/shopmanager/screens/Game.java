package com.gpteam.shopmanager.screens;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.gpteam.shopmanager.game.engine.Engine;
import com.gpteam.shopmanager.society.SocietyClass;

public class Game extends com.badlogic.gdx.Game {
    public Engine engine;

    public AssetManager assetManager;
    public SpriteBatch batch;
    public BitmapFont bitmapFont;
    public FPSLogger fpsLogger;

    public OrthographicCamera camera;
    public Viewport viewport;

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    // TODO add materials to the game from which the products are created - adds the possibility for the use to own a producer company

    @Override
    public void create() {
        assetManager = new AssetManager();
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        fpsLogger = new FPSLogger();
        engine = new Engine();

        assetManager.load(("font.fnt"), BitmapFont.class);
        assetManager.finishLoading();

        camera.position.set(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2, 0);
        setScreen(new MenuScreen(this));
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    private void updateScene() {
//	    float deltaTime = Gdx.graphics.getDeltaTime();

    }

    private void drawScene() {
    }

    @Override
    public void render() {
        super.render();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

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
        batch.dispose();
        bitmapFont.dispose();
    }
}
