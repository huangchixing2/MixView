package com.example.administrator.mixview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    int[] images = new int[]{
            R.drawable.huangchixing,
            R.drawable.huangchixing2,
            R.drawable.huangchixing3,
            R.drawable.huangchixing4,
            R.drawable.huangchixing5,
    };
    int currentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取linearlayout布局容器
        LinearLayout layout = (LinearLayout)findViewById(R.id.root);
        final ImageView image = new ImageView(this);
        //将imgeview组件添加到LinearLayout布局容器中
        layout.addView(image);
        //初始化时显示第一张图片
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //改变imageview里显示的图片
                Log.d("length",images.length + "");
                Log.d("value",++currentImg % images.length + "");
                image.setImageResource(images[++currentImg % images.length]); //这一句不是很理解
            }
        });
    }
}
