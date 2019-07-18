package com.mg.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class GameScreen implements Screen{

    private int playerCount;
    private gdxGame game;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private float stateTime;



    GameScreen(gdxGame game, int playerCount){
        this.playerCount = playerCount;
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, 640, 480);
        batch = new SpriteBatch();
        stateTime = 0F;
        Assets.loadGameAssets();
    }

    // Render basics for each screen
    @Override
    public void render(float delta){
        Gdx.gl.glClearColor( 0, 0, 0, 0 );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        renderBasics();
        batch.end();
    }

    public void renderBasics(){
       // spawnTank(1, yellow, x, y)
    }

    @Override
    public void pause(){
    }

    @Override
    public void resume(){
    }

    @Override
    public void show(){
        Assets.levelBeginSound.play();
    }

    @Override
    public void hide(){
    }

    @Override
    public void dispose(){
    }

    @Override
    public void resize(int width, int height){

    }
}
