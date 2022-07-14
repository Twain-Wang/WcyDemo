package com.jsyiyi.javacode.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.jsyiyi.testkotlin.R;

import java.lang.ref.WeakReference;

public class HandlerActivity extends AppCompatActivity {

    private static final String TAG = "HandlerActivity";
    public static final int CODE = 10001;
    private TextView mTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        mTextview = (TextView) findViewById(R.id.textView);

        final Handler handler = new TestHandler(this);

        Message message = Message.obtain();
        message.arg1 = 10000;
        message.what = CODE;

        handler.sendMessageDelayed(message, 1000);

    }

    public static class TestHandler extends Handler{

        public final WeakReference<HandlerActivity> mWeakReference;
        public TestHandler(HandlerActivity activity) {
            mWeakReference = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            HandlerActivity activity = mWeakReference.get();
            if(msg.what == CODE){
                int time = msg.arg1;
                activity.mTextview.setText(String.valueOf(time/1000));
                Message message = Message.obtain();
                message.what = CODE;
                message.arg1  = time - 1000;

                if (time > 0) {
                    sendMessageDelayed(message, 1000);
                }
            }

        }
    }

}
