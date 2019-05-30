package com.millsoftspb.trampetsimulator_ver31;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class TrumpetModel3 {

    SoundPool soundPool;
    MediaPlayer mediaPlayer;

    //init soundpool objects
    AudioAttributes audioAttributes = new AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build();
    soundPool = new SoundPool.Builder()
            .setMaxStreams(1)
                .setAudioAttributes(audioAttributes)
                .build();
    soundA = soundPool.load(myContext, R.raw.a4, 1);
    soundB = soundPool.load(myContext, R.raw.b4, 1);
    soundC = soundPool.load(myContext, R.raw.c4, 1);
    soundD = soundPool.load(myContext, R.raw.d4, 1);
    soundE = soundPool.load(myContext, R.raw.e4, 1);
    soundF = soundPool.load(myContext, R.raw.f4, 1);
    soundG = soundPool.load(myContext, R.raw.g4, 1);

}
