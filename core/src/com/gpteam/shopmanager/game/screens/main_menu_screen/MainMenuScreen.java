package com.gpteam.shopmanager.game.screens.main_menu_screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.game.ShopManager;

public class MainMenuScreen implements Screen {
    private final ShopManager shopManager;
    private OrthographicCamera camera;
    private SpriteBatch batch;

    public MainMenuScreen(final ShopManager shopManager) {
        this.shopManager = shopManager;
        camera = shopManager.getCamera();
        batch = shopManager.getBatch();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();

        batch.setProjectionMatrix(camera.combined);

        updateScene();
        drawScene();
    }

    private void updateScene() {
    }

    private void drawScene() {
        batch.begin();

        batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
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