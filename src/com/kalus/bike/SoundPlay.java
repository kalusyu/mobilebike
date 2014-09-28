package com.kalus.bike;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * 
 * @author KaluYu
 *
 */
public class SoundPlay {

	private SoundPool mSoundPool;
	
	public SoundPlay(){
		mSoundPool = new SoundPool(10, AudioManager.STREAM_SYSTEM, 5);
	}
	
	/**
	 * 
	 * @param context
	 * @param loop
	 * @return
	 */
	public boolean playSound(Context context,int loop){
		mSoundPool.load(context, R.raw.bike01, 1);
		return mSoundPool.play(1, 1, 1, 0, loop, 1) != 0;
	}
	
	/**
	 * 
	 * @param context
	 * @param loop
	 * @param resId
	 * @return
	 */
	public boolean playSoundByResId(Context context,int loop,int resId){
		mSoundPool.load(context, resId, 1);
		return mSoundPool.play(1, 1, 1, 0, loop, 1) != 0;
	}
}
