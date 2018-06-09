package com.gpteam.shopmanager.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.engine.Engine;
import com.gpteam.shopmanager.screens.tool_bundle.ToolBundle;

public class MenuScreen extends ScreenAdapter {
    private SpriteBatch batch;
    private OrthographicCamera camera;
    private FPSLogger fpsLogger;
    private Engine engine;
    private BitmapFont balanceFont;

    MenuScreen(ToolBundle toolBundle) {
        batch = toolBundle.batch;
        camera = toolBundle.camera;
        fpsLogger = toolBundle.fpsLogger;
        engine = toolBundle.engine;
    }

    @Override
    public void render(float delta) {
        super.render(delta);
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}