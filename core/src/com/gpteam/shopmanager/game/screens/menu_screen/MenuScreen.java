package com.gpteam.shopmanager.game.screens.menu_screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.gpteam.shopmanager.game.Game;

public class MenuScreen implements Screen {
    final Game game;
    private OrthographicCamera camera;

    public MenuScreen(final Game game) {
        this.game = game;
        camera = game.camera;
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();

        game.fpsLogger.log();
        game.batch.setProjectionMatrix(camera.combined);

        updateScene();
        drawScene();
    }

    private void updateScene() {
    }

    private void drawScene() {
        game.batch.begin();

        game.batch.end();
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