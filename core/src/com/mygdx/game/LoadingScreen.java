package com.mygdx.game;

import com.badlogic.gdx.Screen;

public class LoadingScreen implements Screen {
    private MyGame myGame;
    public LoadingScreen(MyGame myGame){
        this.myGame = myGame;
    }

    public LoadingScreen() {

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        myGame.ChangeScreen(myGame.MENU);
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

    }
}
