package com.ce.countdowntimertest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ce.countdowntimertest.R;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*new CountDownTimer(10000, 2000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.v("CountDownTimerTest", "onTick millisUntilFinished = " + millisUntilFinished);
            }

            @Override
            public void onFinish() {
                Log.v("CountDownTimerTest", "onFinish");
            }
        }.start();*/

        /*Log.v("CountDownTimerTest", "Start");
        CountDownTimerUtils.getCountDownTimer()
                .setMillisInFuture(5000)
                .setFinishDelegate(new CountDownTimerUtils.FinishDelegate() {
                    @Override
                    public void onFinish() {
                        Log.v("CountDownTimerTest", "onFinish");
                    }
                }).start();*/
        /*Log.v("CountDownTimerTest", "Start");
        CountDownTimerUtils.getCountDownTimer()
                .setMillisInFuture(10000)
                .setCountDownInterval(2000)
                .setTickDelegate(new CountDownTimerUtils.TickDelegate() {
                    @Override
                    public void onTick(long pMillisUntilFinished) {
                        Log.v("CountDownTimerTest", "pMillisUntilFinished = " + pMillisUntilFinished);
                    }
                })
                .setFinishDelegate(new CountDownTimerUtils.FinishDelegate() {
                    @Override
                    public void onFinish() {
                        Log.v("CountDownTimerTest", "onFinish");
                    }
                }).start();*/
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Log.v("CountDownTimerTest", "SubThread Start");
                new android.os.CountDownTimer(10000, 2000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        Log.v("CountDownTimerTest", "onTick millisUntilFinished = " + millisUntilFinished);
                    }

                    @Override
                    public void onFinish() {
                        Log.v("CountDownTimerTest", "onFinish");
                    }
                }.start();
            }
        }).start();*/
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Log.v("CountDownTimerTest", "SubThread Start");
                new com.ce.countdowntimertest.common.CountDownTimer(10000, 2000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        Log.v("CountDownTimerTest", "onTick millisUntilFinished = " + millisUntilFinished);
                    }

                    @Override
                    public void onFinish() {
                        Log.v("CountDownTimerTest", "onFinish");
                    }
                }.start();
            }
        }).start();*/
        Log.v("CountDownTimerTest", "Start");
        new com.ce.countdowntimertest.common.CountDownTimer(10000, 2000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.v("CountDownTimerTest", "onTick millisUntilFinished = " + millisUntilFinished);
            }

            @Override
            public void onFinish() {
                Log.v("CountDownTimerTest", "onFinish");
            }
        }.start();
    }
}
