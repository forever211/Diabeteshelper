package mconnect.mdiabetes.chart;

import java.util.ArrayList;
import java.util.List;

import org.achartengine.ChartFactory;
import org.achartengine.renderer.DefaultRenderer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;

/**
 * Budget demo pie chart.
 */
public class Category extends AbstractChart {
  /**
   * Returns the chart name.
   * @return the chart name
   */
	private double[] value;
  public String getName() {
    return "Budget chart";
  }
  
  /**
   * Returns the chart description.
   * @return the chart description
   */
  public String getDesc() {
    return "The budget per project for this year (pie chart)";
  }
  
  /**
   * Executes the chart demo.
   * @param context the context
   * @return the built intent
   */
  public Intent execute(Context context) {
    //double[] values = new double[] {12, 14, 11, 10, 19};
    int[] colors = new int[] {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.YELLOW, Color.CYAN,Color.WHITE,Color.RED };
    DefaultRenderer renderer = buildCategoryRenderer(colors);
    
    renderer.setApplyBackgroundColor(true);
    
    //renderer.setAxesColor(Color.RED);//�������������ɫ
    
    //renderer.setBackgroundColor(Color.WHITE);//���ñ�����ɫ
    
    //renderer.setChartTitle("Test");//����ͼ��ı���
    
    //renderer.setDisplayChartValues(false);//�����Ƿ���ʾ�����ֵ
    
    //renderer.setLabelsColor(Color.YELLOW);//���ñ�ǩ����ɫ
    
    //renderer.setOrientation(Orientation.VERTICAL);//����x��y��
    
    //renderer.setShowAxes(false);�����Ƿ���ʾ������
    
    //renderer.setShowGrid(true);//������ʾˮƽ������
    
    //renderer.setShowLegend(true);//�����Ƿ���ʾ���������˵����Ϣ
    
    renderer.setShowLabels(false);
    
    //renderer.
    
    renderer.setLabelsColor(Color.WHITE);
    String[] titles={"Pre-Breakfast",
	        "Post-Breakfast",
	        "Pre-Lunch",
	        "Post-Lunch",
	        "Pre-Dinner",
	        "Post-Dinner",
	        "Night"};    
    return ChartFactory.getPieChartIntent(context, buildCategoryDataset("Glucose pie chart", value,titles), renderer,"Glucose pie chart");
  }

  @Override
  public void setXV(double[] v) {
	// TODO Auto-generated method stub
	value=v;
  }

  @Override
  public void setYV(double[] v) {
	// TODO Auto-generated method stub
	
  }



}
