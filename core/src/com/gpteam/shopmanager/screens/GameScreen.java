package com.gpteam.shopmanager.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.misc.Age;
import com.gpteam.shopmanager.misc.Gender;
import com.gpteam.shopmanager.misc.Name;
import com.gpteam.shopmanager.player.Player;

/*
 * Created by masmix on 23.12.2016.
 */
public class GameScreen extends ScreenAdapter{
    private GameMain game;
    private SpriteBatch batch;
    private BitmapFont balanceFont;
    private Camera camera;


    public GameScreen(GameMain game) {
        this.game = game;
        this.batch = game.batch;
        this.camera = game.camera;
        this.balanceFont = game.balanceFont;

    }

    private void updateScene() {
//	    float deltaTime = Gdx.graphics.getDeltaTime();

    }

    private void drawScene() {
    batch.begin();

        balanceFont.draw(batch, "Saldo: 150,000 zl", 5, GameMain.SCREEN_HEIGHT - 5);

    batch.end();
    }

    @Override
    public void render(float delta) {
//        batch.setProjectionMatrix(camera.combined);
        camera.update();

        updateScene();
        drawScene();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
        batch.dispose();
        balanceFont.dispose();
    }
}
