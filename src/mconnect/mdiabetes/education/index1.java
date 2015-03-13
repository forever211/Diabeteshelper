package mconnect.mdiabetes.education;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import mconnect.mdiabetes.framework.R;
import android.app.Activity;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
public class index1 extends Activity {
	/** Called when the activity is first created. */
	private static String AUTHORITY = "com.chen.provider.diabeteshelper";
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	Uri CONTENT_URI =Uri.parse("content://" + AUTHORITY + "/BMITable");
	setContentView(R.layout.index1);
	 setTitle("��������ָ��");
	Bundle bunde = this.getIntent().getExtras();
	double height = bunde.getDouble("height");
	double weight = bunde.getDouble("weight");
	String sex = bunde.getString("sex");
	String index = this.getindex(weight,height);
	ContentValues initialValues = new ContentValues();
	initialValues.put("sex", sex);
	initialValues.put("bmi", index);
	getContentResolver().insert(CONTENT_URI, initialValues);
	TextView tv1 = (TextView) findViewById(R.id.t1);
	tv1.setText( "��������ǣ�" + height +
	"��\n���������ǣ�"+ weight+"����\n��������ָ����BMI���ǣ�"+index );
	TextView tv2 = (TextView) findViewById(R.id.t2);
	tv2.setText("    ���ֵ������׼��:BMI��18.5��24.9ʱ��������Χ��BMI����25Ϊ���أ�BMI����30Ϊ����\n    �����˵ķ��ֱ�׼�ǣ�BMI��18.5--22.9ʱΪ����ˮƽ��BMI����23Ϊ���أ�BMI����30Ϊ���֡�\n    ���ֵ��й���׼�ǣ����ֵӦ����20--22��BMI����22.6Ϊ���أ�BMI����30Ϊ���֡� ");
	}
	
	private String format(double num) {
	NumberFormat formatter = new DecimalFormat("0.00");
	String s = formatter.format(num);
	return s;
	}
	private String getindex(double weight, double height) {
		String index = "";
		
		index = format(weight/(height*height));
		return index;
		}
}