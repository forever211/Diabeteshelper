package mconnect.mdiabetes.education;


import mconnect.mdiabetes.framework.R;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
public class medicine extends ListActivity{
	private String[]menu1 = {"��ҩ����","ҩƷ����","��ҩʱ�估����"};
	

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("�ڷ�����ҩ��֪");
         ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,menu1);
         setListAdapter(adapter);
         //setOnItemClickListener(this);
         setTitle("�ڷ�����ҩƷ");
    } ;
    private String a=("   2���������ȵ��ع���Ч�ʵͻ��ǲ��,�ȵ��صֿ��Ǵ����2�����򲡵Ĳ��򣬺�����ʳ�ƻ����˶����������Ǽ����ȵ��صֿ��Ļ�����\n   2��������ʱ�����ȵ�Bϸ�����ܽ�Ϊ�����˵�50%���ң��Ժ�ÿ5��ɥʧ50%���ٶ�˥�ߣ������ʱ���ÿڷ�����ҩ���������ȵ������ơ����ڽ���ҩ�̷���ʧЧ�������ȵ��ش��档");
    String[]b={"�ڷ�����ҩ����","��ǰ��Сʱ��ҩ��֪","��ǰһ���ӷ�ҩ��֪","���л�ͺ��ҩ��֪"};
    String c=("   �ܶ����򲡻����ڳԿڷ�����ҩʱ��С������������ô�ԣ���ʱ�ԣ��ö���������һ���ܴ�����⣬�Բ������ͻ���ɺ����صĺ����\n   ĿǰΪֹ���ڷ�����ҩ�����ɷ�Ϊ����ࡣ������ѡ����ҩʱ������Ӧ����������������л��֣����ֺͳ������ö���˫�ң�����ѡ�������ཱུ��ҩ��ҩ���С������ʼ���ã����ӵ��еȼ������������Ч�����ã�������һ�ཱུ��ҩ��ע��ͬ��ҩ�ﲻ�ܵ��ӣ��һ�����ҩ�ﲻ�ܺ͸�������ͬ����������໥���顣��ʹ�ö����ֿڷ�ҩЧ���Բ����룬Ӧʹ���ȵ������ơ�\n   ��Ҫע����ǣ�Ϊ��Ч���ӽ���ҩ�����ã����򲡻���Ӧ��ҽ��ָ������ʱ���ø��ֽ���ҩ��");
    String d=("   ��ǰ��Сʱ ��ҪΪ�������ཱུ��ҩ������б��壨�Ž��ǣ����������أ����������������衢������຿���Ƭ�����������ȡ�\n   ��Щҩ�дٽ��ȵ��ط��ڵ����ã���Чʱ��Ϊ��ҩ��30���ӡ���ˣ�һ��Ӧ�ڷ�ǰ30�������ҷ��á���Щҩ���ر𽲾�����ð�����ÿ��ͬһʱ���ҩ������������\n   ���⣬������Щҩ��Ӧ��1Ƭ��ʼ���Ժ������Ӽ�����ÿ�����Ӱ�Ƭ��1Ƭ��3~7�����һ�Σ�ֱ��Ѫ�ǻָ��������������ڼ仹��Ҫ�����Ѫ�ǵķ�����");
    String e=("   ��ǰ1���� �����ȵ��ط��ڴٽ�������ŵ�������������µĿ����ȵ��ط��ڴٽ���������Ѹ�ٶ����ݣ�����Ϊ��ʱѪ�ǵ��ڼ���\n   �����������ø���Ƽ���ҩ������ƽ�������ȣ���Ҫ���ڽ��Ͳͺ��Ѫ�ǡ�\n   �ڷ��ø���ҩʱ��������ÿ�͵ĵ�һ�ڷ�ͬʱ������¡������𲻵����Ͳͺ��Ѫ�ǵ����á�\n   ����һ���ȵ��������������޸���ͪ��������ͪ�ȣ�����ҩ��Ҫͨ����ǿ�ȵ������ö�����Ѫ�ǣ�����ʱ��ϳ���һ�η�ҩ���������ÿ���ά��24Сʱ����ˣ�ÿ�ս����ҩһ�Σ���ÿ�����ǰ1���ӷ�ҩЧ����á�");
    String f=("   ���л�ͺ� ��ҪΪ˫�ҽ���ҩ�������˫�ҡ�����˫�ң������飩��\n   ����˫����Ωһ�ڲ��л�ͺ���õĽ���ҩ��������Ϊ����˫���ܹ�����θ�Ĥ������θ�����ʣ������ÿ�ͷ����м���ڲͺ����̷�ҩ���ɱ���ҩ���θ�Ĵ̼������ٸ����á�����˫�����������ڽ��ǵ�ͬʱ���������أ�����ȼ������ã�Ҳ�������Ѫ�ǣ����ʹ�ýϹ㷺�������ͷ��ֵ����򲡻����������ˡ�����˫�ң������飩��������в�����������ж����ʽ������𽥱�����˫����ȡ��");
public void onListItemClick(ListView l, View v, int position, long id){
    if(position==0){
    	new AlertDialog.Builder(medicine.this)
        .setIcon(R.drawable.alert_dialog_icon)
        .setTitle("��ҩ����")
        .setMessage(a)
        .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int whichButton) {
            
            }
        })
        
        .create().show();
    }
    else if(position==1){
    	Intent in = new Intent(medicine.this,medicine1.class);
		 startActivity(in);}
    else if(position==2){
    	new AlertDialog.Builder(medicine.this)
        .setTitle("��ҩʱ�估����")
        .setItems(b, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	if (which==0){
            		new AlertDialog.Builder(medicine.this)
                    .setIcon(R.drawable.alert_dialog_icon)
                    .setTitle("��ҩ����")
                    .setMessage(c)
                    .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                    	public void onClick(DialogInterface dialog, int whichButton) {
                          
                        }
                    })
                    
                    .create().show(); 
            	   }
            	else if (which==1){
            		new AlertDialog.Builder(medicine.this)
                    .setIcon(R.drawable.alert_dialog_icon)
                    .setTitle("��ǰ��Сʱ��ҩ��֪")
                    .setMessage(d)
                    .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                    	public void onClick(DialogInterface dialog, int whichButton) {
                            
                        }
                    })
                    
                    .create().show(); 
            	   }
            	else if (which==2){
            		new AlertDialog.Builder(medicine.this)
                    .setIcon(R.drawable.alert_dialog_icon)
                    .setTitle("��ǰһ���ӷ�ҩ��֪")
                    .setMessage(e)
                    .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                    	public void onClick(DialogInterface dialog, int whichButton) {
                            
                        }
                    })
                    
                    .create().show(); 
            	   }
            	else if (which==3){
            		new AlertDialog.Builder(medicine.this)
                    .setIcon(R.drawable.alert_dialog_icon)
                    .setTitle("���л�ͺ��ҩ��֪")
                    .setMessage(f)
                    .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                    	public void onClick(DialogInterface dialog, int whichButton) {
                            
                        }
                    })
                    
                    .create().show(); 
            	}
               
            }
        })
        .create().show();
    }
 }
}

