package com.gpteam.shopmanager.screens.tool_bundle;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.engine.Engine;

public class ToolBundle {
    public SpriteBatch batch;
    public OrthographicCamera camera;
    public FPSLogger fpsLogger;
    public Engine engine;
    public AssetManager assetManager;

    public ToolBundle(SpriteBatch batch, OrthographicCamera camera, FPSLogger fpsLogger, Engine engine, AssetManager assetManager) {
        this.batch = batch;
        this.camera = camera;
        this.fpsLogger = fpsLogger;
        this.engine = engine;
        this.assetManager = assetManager;
    }
}
