package com.jikexueyuan.webviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.jikexueyuan.webviewdemo.view.CustomDialog;

public class DialogActivity extends Activity {
    private CustomDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                CustomDialog.Builder customBuilder = new CustomDialog.Builder(DialogActivity.this);
                customBuilder.setTitle("标题")
                             .setMessage("提示内容")
                             .setNegativeButton("取消", null)
                             .setPositiveButton("确定",null);
                dialog = customBuilder.create();
                dialog.show();
            }
        });
    }


}