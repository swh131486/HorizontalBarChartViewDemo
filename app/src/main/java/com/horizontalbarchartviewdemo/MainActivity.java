package com.horizontalbarchartviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.LinearLayout;

import com.horizontalbarchartviewdemo.widget.HorizontalBarChartView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content = (LinearLayout) findViewById(R.id.content);
        setUpAttendanceToViews();
    }


    /**
     * 数据刷新UI更新
     *
     * @param attendanceInfos server返回来的数据出入校数据列表
     */
    private void setUpAttendanceToViews() {
        content.removeAllViews();
        HorizontalBarChartView chartView = new HorizontalBarChartView(this);
        chartView.notifyDataChanged();
        content.addView(chartView);
    }


}
