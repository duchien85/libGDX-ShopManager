package com.gpteam.shopmanager.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.game.engine.LogicHandler;
import com.gpteam.shopmanager.game.screens.main_menu_screen.MainMenuScreen;

// TODO Loading back end, carry it to menuscreen
public class ShopManager extends Game {
    private OrthographicCamera camera;
    private SpriteBatch batch;

    private LogicHandler logicHandler;


    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    public static final int MAX_CITIES = 3;
    public static final int DEFAULT_CITIES = 2;

    // TODO add materials to the game from which the products are created - adds the possibility for the use to own a producer company

    @Override
    public void create() {
        logicHandler = new LogicHandler();

        camera.position.set(SCREEN_WIDTH / 2.0f, SCREEN_HEIGHT / 2.0f, 0);
        setScreen(new MainMenuScreen(this));
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

        updateScene();
        drawScene();
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

    private void setMainMenuScreen() {
        setScreen(new MainMenuScreen(this));
    }


    public OrthographicCamera getCamera() {
        return camera;
    }

    public SpriteBatch getBatch() {
        return batch;
    }

    public LogicHandler getLogicHandler() {
        return logicHandler;
    }
}
