package com.millsoftspb.trampetsimulator_ver31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer myTimer;
    TrumpetModel trumpet;
    SoundMeter soundMeter;
    public TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init Timer
        myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                TimerMethod();
            }

        }, 0, 1500);

        //init Trumpet
        trumpet = new TrumpetModel(this);

        //init SoundMeter
        soundMeter = new SoundMeter();

        //temp init TextView
        textView = findViewById(R.id.textView);
    }
    private void TimerMethod() {
        this.runOnUiThread(Timer_Tick);
    }
    private Runnable Timer_Tick = new Runnable() {
        public void run() {
            if(soundMeter.getAmplitude()>1200) trumpet.play(1);
            textView.setText(String.valueOf(soundMeter.getMaxAmplitude()));
        }
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundMeter.stop();
        trumpet.destroyTrumpet();
    }
}
