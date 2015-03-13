package mconnect.mdiabetes.education;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import mconnect.mdiabetes.framework.R;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
public class Next extends Activity {
	private TextView mTextView01;
	private TextView mTextView02;
	private TextView mTextView03;
	private Button mButton1;

	private double Height;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		Bundle bun = this.getIntent().getExtras();

		Height = bun.getDouble("Height");

		// ȡ�Ø˜��w��
		String WeightMin = getWeight(Height);
		String WeightMax = getWeight1(Height);
		mTextView01 = (TextView) findViewById(R.id.TextView01);
		mTextView02 = (TextView) findViewById(R.id.TextView02);
		mTextView03 = (TextView) findViewById(R.id.TextView03);
		String result = "��������Ϊ��" + Height + "�ꣻ" + "���˶�ʱ��Ŀ�����ʷ�Χ��";
		String result2 = "Ŀ�����ʷ�Χ���ޣ�" + WeightMin + "��/ÿ��";
		String result3 = "Ŀ�����ʷ�Χ���ޣ�" + WeightMax + "��/ÿ��";
		mTextView01.setText(result);
		mTextView02.setText(result2);
		mTextView03.setText(result3);

		mButton1 = (Button) findViewById(R.id.Button03);
		mButton1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Next.this, education.class);
				startActivity(intent);
				Next.this.finish();
			}
		});
	}

	// ��������ķ���
	private String format(double num) {
		NumberFormat formatter = new DecimalFormat("0.00");
		String s = formatter.format(num);
		return s;
	}

	// ȡ���w��
	public String getWeight(double height) {
		String Weight = "";

		Weight = format((220 - height) * 0.65);
		return Weight;
	}

	public String getWeight1(double height) {
		String Weight = "";

		Weight = format((220 - height) * 0.75);
		return Weight;
	}
}
