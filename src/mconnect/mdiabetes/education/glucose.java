package mconnect.mdiabetes.education;

import mconnect.mdiabetes.framework.R;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

public class glucose extends ListActivity{
	private String[]menu1 = {"Ѫ�Ǽ��Ŀ��","Ѫ������ֵ","Ѫ�Ǽ��ʱ��","ע������"};
		

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,menu1);
         setListAdapter(adapter);
         //setOnItemClickListener(this);
         setTitle("Ѫ�����Ҽ��");
    }  ;
    String a=("    Ѫ�Ǽ�������򲡹����е���Ҫ��ɲ��֣��ɱ�������ӳ��ʳ���ơ��˶����ƺ�ҩ�����Ƶ�Ч����ָ�������Ʒ����ĵ�����\n    ���Ƶ��ȡ�������Ʒ��������Ƶ�Ŀ�ꡢ����͸��˵ľ������������Ļ�����ʽ�ǻ��ߵ�����Ѫ�Ǽ�⡣");
    String b=("    һ��Ѫ������ֵ���£�\n�ո���3.9-6.1mmol/L��\n�ͺ�2Сʱ����7.8mmol/L��\n    ���������ˣ�Ѫ�ǵ�����ֵΪ��\n�ո�����7.8mmol/L��\n�ͺ󣺡�11.1mmol/L");
    String c=("    Ѫ�Ǽ���ʱ��Ϊ��\n��1����ǰ��Сʱ�����ڼ����Ѫ�ǣ�\n��2���ͺ�2Сʱ�����ڼ����Ѫ�ǣ�\n��3��ҹ��Ѫ�Ǽ�⣺���ڷ���ҹ���Ѫ�ǻ�ո���Ѫ�ǡ� ");
    String d=("    ע�����\n��1��ע���ȵ��ػ�ʹ�ô��ȵ��ط��ڼ��Ļ��߿�ÿ�ռ��Ѫ��1-4�Σ�\n��2��1�����򲡻���Ӧÿ�����ټ��Ѫ��3-4�Σ�\n��3���鷢���������ڼ��Ѫ�ǣ�16.7mmol/L��300mg/dl��ʱ��Ӧ�ⶨѪ����ͪ�壻\n��4��Ѫ�ǿ������û��ȶ��Ĳ���Ӧÿ�ܼ��һ������죬�������ò��ȶ�Ѫ�ǿ����߼��Ĵ����ɸ��٣�\n��5��Ѫ�ǿ��Ʋ�/���ȶ��Ĳ��˻��������Բ���Ӧÿ����ֱ��Ѫ�ǵõ����ÿ��ơ�");
    
    int p1;
 
    
    public void onListItemClick(ListView l, View v, int position, long id){
    	p1=position;
        if (p1 == 0) {
        	new AlertDialog.Builder(glucose.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("Ѫ�Ǽ���Ŀ��")
            .setMessage(a)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create().show();
        }
        else if(p1 == 1){ 
        	new AlertDialog.Builder(glucose.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("Ѫ������ֵ")
            .setMessage(b)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create().show();
        }
        else if(p1 == 2){ 
        	new AlertDialog.Builder(glucose.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("Ѫ�Ǽ��ʱ��")
            .setMessage(c)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
            	
            	}  
            })
          
            .create().show();
           }	
        else if(p1 == 3){ 
        	new AlertDialog.Builder(glucose.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("Ѫ�Ǽ��ע������")
            .setMessage(d)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                   
                }
            })
            
            .create().show();
               }	
       }
    }

