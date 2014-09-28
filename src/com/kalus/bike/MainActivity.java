package com.kalus.bike;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity{
	SoundPlay mSoundPlay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mSoundPlay = new SoundPlay();
	}
	
	public void playSound(View v){
		mSoundPlay.playSound(this, 0);
	}
}
