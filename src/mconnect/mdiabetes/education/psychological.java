package mconnect.mdiabetes.education;

import mconnect.mdiabetes.framework.R;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
public class psychological extends ListActivity{
	private String[]menu1 = {"������������","��������������","�����������Ʒ���"};
	

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,menu1);
         setListAdapter(adapter);
         //setOnItemClickListener(this);
         setTitle("������������");
    } ;
    private String a=("   �о����֣������ڷ����ϲ�����������ѧ�ϵ������йأ�������ỷ�������������йأ��繤��ѧϰ���ڹ��Ƚ��š��˼ʹ�ϵ��Э���������ϵĲ����̼��������е�ͻ�������¼��ȡ����������򲡡�\n   ���⣬����ʹ�ÿڷ�����ҩ��ע���ȵ�����Ч�����������룬���ͬʱ��������Ʒ�����ȡ�����һ������ͬ�εķ����������ƣ������յ��°빦���򵥴�ҩ��ﲻ����Ч�������˵������һ�����ļ���������������������򲡵ķ�������չ�о�����Ҫ�����á�");
    private String []b={"���ɺͷ�������","ʧ����������","���ǿ־�����","������������","������������ɱ����"}; 
    private String []c={"˵������","ת��ע�ⷨ","��־��ʤ��","��־����","���ÿ�����"};
  public void onListItemClick(ListView l, View v, int position, long id){
    if(position==0){
    	new AlertDialog.Builder(psychological.this)
        .setIcon(R.drawable.alert_dialog_icon)
        .setTitle("��������")
        .setMessage(a)
        .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int whichButton) {
             
            }
        })
        
        .create().show();
    }
    else if(position==1){
    	
    	new AlertDialog.Builder(psychological.this)
        .setTitle("������������")
        .setItems(b, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                      
            }
        })
        .create().show();
    }
    else if(position==2){
    	new AlertDialog.Builder(psychological.this)
        .setTitle("�����������Ʒ���")
        .setItems(c, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                      
            }
        })
        .create().show();
    }
  }
}
