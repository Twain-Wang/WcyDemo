package com.imooc.udpdemo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.imooc.udpdemo.biz.TcpClientBiz;

public class HttpsActivity extends AppCompatActivity {

    private EditText mEdContent;
    private Button mBtnSend;
    private TextView mTvContent;

    private TcpClientBiz mTcpClientBiz = new TcpClientBiz();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();


        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String inputMsg = mEdContent.getText().toString();
                mEdContent.setText("");
                // 这里最好使用一个io的单线程队列
                mTcpClientBiz.sendMsg(inputMsg);
            }
        });


    }

    private void appendMsgToTvContent(String inputMsg) {
        mTvContent.append(inputMsg + "\n");
    }

    private void initViews() {
        mEdContent = (EditText) findViewById(R.id.id_et_content);
        mBtnSend = (Button) findViewById(R.id.id_btn_send);
        mTvContent = (TextView) findViewById(R.id.id_tv_content);
    }
}
