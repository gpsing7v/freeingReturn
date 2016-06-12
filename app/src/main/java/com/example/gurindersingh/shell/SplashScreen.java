package com.example.gurindersingh.shell;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Gurinder on 12-Feb-15.
 */
public class SplashScreen extends Activity {
//    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
//        imageView = (ImageView) findViewById(R.id.imageView);
//        Animation animation = AnimationUtils.loadAnimation(getApplication(),R.anim.logo_animation);
//        imageView.setAnimation(animation);
//
//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//
//                finish();
//                startActivity(new Intent(getApplicationContext(),SplashScreen.class));
////            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
