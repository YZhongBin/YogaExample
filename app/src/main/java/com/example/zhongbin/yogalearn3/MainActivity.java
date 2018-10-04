package com.example.zhongbin.yogalearn3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.facebook.soloader.SoLoader;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import com.facebook.yoga.android.YogaViewLayoutFactory;

public class MainActivity extends AppCompatActivity {

    private int screenWidth;
    private int screenHeight;
    private YogaLayout mRootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflater.from(this).setFactory(YogaViewLayoutFactory.getInstance());
        SoLoader.init(MainActivity.this, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager manager = this.getWindowManager();
        DisplayMetrics outMetrics = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(outMetrics);
        screenWidth = outMetrics.widthPixels;
        screenHeight = outMetrics.heightPixels;
        mRootLayout = findViewById(R.id.layout);
        //initYoga();
        //initTitle();
        card();
    }

    private void card(){
        YogaLayout yogaLayout =new YogaLayout(this);
        mRootLayout.addView(yogaLayout);
        YogaNode titleRootYoga = mRootLayout.getYogaNodeForView(yogaLayout);
        titleRootYoga.setWidthPercent(100);
        titleRootYoga.setFlexDirection(YogaFlexDirection.ROW);
        titleRootYoga.setPadding(YogaEdge.ALL,Utils.dp2px(this,12));

        ImageView imageView =new ImageView(this);
        yogaLayout.addView(imageView);
        YogaNode imageYoga = yogaLayout.getYogaNodeForView(imageView);
        imageYoga.setWidthAuto();
        imageYoga.setHeightAuto();

        Glide.with(this).load(R.drawable.kefuqq).into(imageView);
        //imageView.setImageResource(R.drawable.kefuqq);
    }

    private void initTitle(){
        //Title 布局
        YogaLayout yogaLayout =new YogaLayout(this);
        mRootLayout.addView(yogaLayout);
        YogaNode titleRootYoga = mRootLayout.getYogaNodeForView(yogaLayout);
        titleRootYoga.setWidthPercent(100);
        titleRootYoga.setFlexDirection(YogaFlexDirection.ROW);
        titleRootYoga.setPadding(YogaEdge.ALL,Utils.dp2px(this,12));

        ImageView imageView =new ImageView(this);
        imageView.setImageResource(R.drawable.kefuqq);
        yogaLayout.addView(imageView);
        YogaNode imageYoga = yogaLayout.getYogaNodeForView(imageView);
        imageYoga.setWidth(Utils.dp2px(this,12));
        imageYoga.setHeight(Utils.dp2px(this,13));

        TextView titleTv =new TextView(this);
        titleTv.setText("Based on your last experience a with Total products, would yours purchase products again from in Total");
        titleTv.setTextSize(16);
        titleTv.setTextColor(Color.rgb(33,33,33));
        yogaLayout.addView(titleTv);
        YogaNode titleTvYogaNode = yogaLayout.getYogaNodeForView(titleTv);
        titleTvYogaNode.setHeightAuto();
        titleTvYogaNode.setWidthAuto();
        titleTvYogaNode.setMargin(YogaEdge.LEFT,Utils.dp2px(this,10));

        //分隔线1
        View div1 =new View(this);
        mRootLayout.addView(div1);
        div1.setBackgroundColor(Color.rgb(238,238,238));
        YogaNode div1YogaNode = mRootLayout.getYogaNodeForView(div1);
        div1YogaNode.setHeight(Utils.dp2px(this,0.5f));
        div1YogaNode.setWidthPercent(100);
        div1YogaNode.setMargin(YogaEdge.BOTTOM,Utils.dp2px(this,12));
        div1YogaNode.setMargin(YogaEdge.TOP,Utils.dp2px(this,12));

        //content
        YogaLayout contentLayout = new YogaLayout(this);
        mRootLayout.addView(contentLayout);
        YogaNode contentYogaNode = mRootLayout.getYogaNodeForView(contentLayout);
        contentYogaNode.setHeightAuto();
        contentYogaNode.setWidthPercent(100);
        contentYogaNode.setPadding(YogaEdge.LEFT,Utils.dp2px(this,12));
        contentYogaNode.setPadding(YogaEdge.RIGHT,Utils.dp2px(this,12));
        titleRootYoga.setFlexDirection(YogaFlexDirection.ROW);

        TextView contentTv =new TextView(this);
        contentLayout.addView(contentTv);
        contentTv.setTextColor(Color.rgb(33,33,33));
        contentTv.setTextSize(16);
        contentTv.setText("The events of the past few weeks have only deepened my conviction that Hillary is the best choice for America\n"
            + "1. Google Chrome\n"
            + "2. Internet Explorer \n"
            + "3. Mozilla Firefox\n"
            + "4. Safari\n"
            + "5. Opera");
        YogaNode contentTvYogaNode = contentLayout.getYogaNodeForView(contentTv);
        contentTvYogaNode.setWidthAuto();
        contentTvYogaNode.setHeightAuto();

        //div2 分隔线2
        View div2 =new View(this);
        mRootLayout.addView(div2);
        div2.setBackgroundColor(Color.rgb(238,238,238));
        YogaNode div2YogaNode = mRootLayout.getYogaNodeForView(div2);
        div2YogaNode.setHeight(Utils.dp2px(this,0.5f));
        div2YogaNode.setWidthPercent(100);
        div2YogaNode.setMargin(YogaEdge.BOTTOM,Utils.dp2px(this,10));
        div2YogaNode.setMargin(YogaEdge.TOP,Utils.dp2px(this,12));

        //action
        YogaLayout actionLayout = new YogaLayout(this);
        mRootLayout.addView(actionLayout);
        YogaNode actionYN = mRootLayout.getYogaNodeForView(actionLayout);
        actionYN.setWidthPercent(100);
        actionYN.setHeightAuto();
        actionYN.setFlexDirection(YogaFlexDirection.ROW);
        actionYN.setPadding(YogaEdge.LEFT,Utils.dp2px(this,12));
        actionYN.setPadding(YogaEdge.RIGHT,Utils.dp2px(this,12));

        YogaLayout btn1 =new YogaLayout(this);
        actionLayout.addView(btn1);
        YogaNode btn1YN = actionLayout.getYogaNodeForView(btn1);
        btn1YN.setFlexGrow(1);
        btn1YN.setAlignItems(YogaAlign.CENTER);
        TextView textViewBtn1=new TextView(this);
        textViewBtn1.setText("接受");
        textViewBtn1.setTextColor(Color.rgb(33,33,33));
        textViewBtn1.setTextSize(16);
        btn1.setBackgroundColor(Color.WHITE);
        btn1.addView(textViewBtn1);

        View div3 = new View(this);
        actionLayout.addView(div3);
        div3.setBackgroundColor(Color.rgb(238,238,238));
        YogaNode div3YN =actionLayout.getYogaNodeForView(div3);
        div3YN.setHeight(Utils.dp2px(this,30));
        div3YN.setWidth(Utils.dp2px(this,0.5f));


        TextView btn2 =new TextView(this);
        actionLayout.addView(btn2);
        YogaNode btn2YN = actionLayout.getYogaNodeForView(btn2);
        btn2YN.setFlexGrow(1);
        btn2YN.setHeight(Utils.dp2px(this,40));
        btn2.setText("拒绝");
        btn2.setGravity(Gravity.CENTER_HORIZONTAL);
        btn2.setTextColor(Color.rgb(33,33,33));
        btn2.setTextSize(16);
        btn2.setBackgroundColor(Color.WHITE);


        View div4 = new View(this);
        actionLayout.addView(div4);
        div4.setBackgroundColor(Color.rgb(238,238,238));
        YogaNode div4YN =actionLayout.getYogaNodeForView(div4);
        div4YN.setHeight(Utils.dp2px(this,30));
        div4YN.setWidth(Utils.dp2px(this,0.5f));

        TextView btn3 =new TextView(this);
        actionLayout.addView(btn3);
        YogaNode btn3YN = actionLayout.getYogaNodeForView(btn3);
        btn3YN.setFlexGrow(1);
        btn3YN.setHeight(Utils.dp2px(this,40));
        btn3.setText("待定");
        btn3.setGravity(Gravity.CENTER_HORIZONTAL);
        btn3.setTextColor(Color.rgb(33,33,33));
        btn3.setTextSize(16);
        btn3.setBackgroundColor(Color.WHITE);



    }

    private void initContent(){

    }
    private void initYoga(){
        YogaLayout yogaLayout =new YogaLayout(this);
        YogaNode root=yogaLayout.getYogaNode();
        root.setHeight(screenHeight);
        root.setWidth(screenWidth);
        root.setFlexDirection(YogaFlexDirection.ROW);
        //root.setWidthAuto();
        //root.setHeightAuto();

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.kefuqq);
        //

        //imageView.setLayoutParams(params);


        yogaLayout.addView(imageView);

        YogaNode imageLa=yogaLayout.getYogaNodeForView(imageView);
        imageLa.setWidth(Utils.dp2px(this,10));
        imageLa.setHeight(Utils.dp2px(this,10));
        imageLa.setAlignSelf(YogaAlign.STRETCH);

        yogaLayout.setBackgroundColor(Color.rgb(255,0,0));
        //yogaLayout.addView(imageView,imageNode);


        //root.addChildAt(imageNode,0);
        //imageNode.calculateLayout(screenWidth,screenHeight);
        //root.calculateLayout(screenWidth,screenHeight);
        //yogaLayout.addView(imageView,(int)imageNode.getWidth().value,(int)imageNode.getHeight().value);
        mRootLayout.addView(yogaLayout,(int)root.getWidth().value,(int)root.getHeight().value);


        //Log.e("image","yogaLayout Width: "+yogaLayout.getWidth()+"  YogaNode width: "+imageNode.getWidth());


    }
}
