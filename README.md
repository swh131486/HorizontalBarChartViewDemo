# HorizontalBarChartViewDemo
竖直方向上柱形图；
填充数据方法：

  public void notifyDataChanged() {
        ArrayList<BarEntry> entries = new ArrayList<>();
        BarEntry bar1 = new BarEntry(20, 0);
        BarEntry bar2 = new BarEntry(18, 1);
        BarEntry bar3 = new BarEntry(30, 2);
        BarEntry bar4 = new BarEntry(8, 3);
        entries.add(bar1);
        entries.add(bar2);
        entries.add(bar3);
        entries.add(bar4);

        BarDataSet mBarDataSet = new BarDataSet(entries, "");
        mBarDataSet.setColors(new int[]{Color.rgb(8, 93, 245), Color.rgb(248, 9, 9), Color.rgb(8, 93, 245), Color.rgb(248, 9, 9)});
        mBarDataSet.setBarSpacePercent(60f);
        ArrayList<BarDataSet> dataSets = new ArrayList<BarDataSet>();
        dataSets.add(mBarDataSet);
        mBarDataSet.setValueFormatter(new ValueFormatter());
        BarData data = new BarData(getXAxisValues(), dataSets);
        data.setValueTextSize(10f);
        data.setValueTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
        mBarChart.setData(data);
        mChartTitle.setText("班级总人数：" +  38);
        mBottomTitle.setText("学生出入校统计");
    }
    
   
   ![image](https://github.com/swh131486/HorizontalBarChartViewDemo/blob/master/device-2018-01-05-162355.png)   
