package com.mg.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets{

    public static Texture textureBack;
    public static Sprite spriteBack;
    public static Texture yellowTankRight1_Texture;
    public static Texture yellowTankRight2_Texture;
    public static Animation<TextureRegion> loading_animation;
    public static TextureRegion[] sheet_frames ;
    public static TextureRegion current_frame;
    public static Sound selectionSound;
    public static Sound levelBeginSound;

    public static void loadMenuAssets(){
        textureBack = new Texture(Gdx.files.internal("sprites/menu/menu.jpg"));
        textureBack.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spriteBack = new Sprite(textureBack);
        spriteBack.flip(false, true);

        yellowTankRight1_Texture = new Texture(Gdx.files.internal("sprites/tanks/yellow_lvl1_right1.png"));
        yellowTankRight2_Texture = new Texture(Gdx.files.internal("sprites/tanks/yellow_lvl1_right2.png"));
        sheet_frames = new TextureRegion[2];

        sheet_frames[1] = new TextureRegion(yellowTankRight1_Texture, 0,0, 13, 13);
        sheet_frames[0] = new TextureRegion(yellowTankRight2_Texture, 0,0, 13, 13);

        loading_animation = new Animation<>(0.1F, sheet_frames);
        selectionSound = Gdx.audio.newSound(Gdx.files.internal("sounds/menuSelect.mp3"));
    }

    public static void loadGameAssets(){
        levelBeginSound = Gdx.audio.newSound(Gdx.files.internal("sounds/startLevel.mp3"));

    }
}