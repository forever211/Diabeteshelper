package mconnect.mdiabetes.education;

import android.app.AlertDialog;
import android.app.ExpandableListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.ExpandableListView.OnChildClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mconnect.mdiabetes.framework.R;
/**
 * Demonstrates expandable lists backed by a Simple Map-based adapter
 */
public class medicine1 extends ExpandableListActivity implements OnChildClickListener{
	private String[]menu1 = {"��������(sulfonylurea)","˫����(biguanide)","��-������ø���Ƽ�(��-glucosidase inhibitor)","�ǻ������ȵ��شٽ���(sulfonylurea insulin promotion)","�ȵ���������(insulin sensitizer)"};
	private String[][]menu2={
			                   {"����ҩƷ������ԭ��","��ȱ�����"},
			                   {"����ҩƷ������ԭ��","��ȱ�����"},
			                   {"����ҩƷ������ԭ��","��ȱ�����"},
			                   {"����ҩƷ������ԭ��","��ȱ�����"},
			                   {"����ҩƷ������ԭ��","��ȱ�����"},
			                  
	                          };
    private ExpandableListAdapter mAdapter;
   
    private static final String NAME = "NAME";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<Map<String,String>> groupData = new ArrayList<Map<String, String>>();
        List<List<Map<String, String>>> childData = new ArrayList<List<Map<String, String>>>();
        for (int i = 0; i < 5; i++) {
            Map<String, String> curGroupMap = new HashMap<String, String>();
            groupData.add(curGroupMap);
            curGroupMap.put(NAME,  menu1[i]);
            
            
            List<Map<String, String>> children = new ArrayList<Map<String, String>>();
            for (int j = 0; j < menu2[i].length; j++) {
                Map<String, String> curChildMap = new HashMap<String, String>();
                children.add(curChildMap);
                curChildMap.put(NAME, menu2[i][j]);
                
            }
            childData.add(children);
        }
        mAdapter = new SimpleExpandableListAdapter(
                this,
                groupData,
                android.R.layout.simple_expandable_list_item_1,
                new String[] { NAME },
                new int[] { android.R.id.text1 },
                childData,
                android.R.layout.simple_expandable_list_item_1,
                new String[] { NAME },
                new int[] { android.R.id.text1}
                );
        
        //mAdapter.isChildSelectable(groupPosition, childPosition);
        setListAdapter(mAdapter);
        getExpandableListView().setOnChildClickListener(this);
        /*getExpandableListView().setOnChildClickListener(new OnChildClickListener(){

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				return false;
			}
        	
        });*/
    } 
    String a =("   �����������õý����һ�ཱུ��ҩ����һ���Уģ��������ױ��Ƕ��壩���ȻǱ���ȣ�������ü����󣬽����������������ô��ٴ��ϻ�������̭���ڶ����и��б��壨�Ž��ǣ���������ຣ���������������أ������������������壨��Ī�����ȣ��ٴ�Ӧ�ý�Ϊ�㷺����ͨ��\n   ����ԭ����Ҫ������ͨ���̼��ȵ���ϸ�������ȵ��ض����ǡ�Ӧ�ô���ҩ��ǰ�������ǻ����ȵ�ϸ����һ���Ĺ��ܣ�����ָ���������ᡢ�жȻ��ߡ�");
    String b= ("   �ŵ��ȱ�㣺\n   �ŵ��Ǵ���ҩ��������ǿ������ʱ��죬����ҩ�۸�������ױ����߽��ܵȡ�\n   ȱ���Ǵ���ҩ������������Ѫ��Ũ�ȣ����׵�Ѫ�ǣ��׵��¸��ͷ��֣������ȵ���ϸ�����ɣ������ȵ�����˥�ߣ���Чҩ�������صĵ�Ѫ�����Ծ����ȡ�\n   Ӧ�ô���ҩ��Ӧע���������ԣ�ÿ��ҩ�����ص㣬������ƽֻ�У��������л��������С�������������ʱ��̣���Ѫ�Ƿ�������С���ʺ������ˣ����������и���΢ѭ�����õȣ��ٴ�Ӧ��Ӧ���ݻ��ߵ��ȵ�����״���͸����ص�ѡ��һ����С������ʼ���𽥼�����");
    String c= ("   ˫�������Ӧ�ò��ǽ��Ƕ��Ǽ���ҩ��������Ӧ�õ��������򡣵�һ��ҩ���Ǳ���˫�ң������顢����Ƭ�������׵������������ж��������ʴ�������ϣ�����̭���ڶ���ҩ���Ƕ���˫�ң���ֹ�����Ͽ����ϻ��ƶ����׸������������\n   ����ԭ����������������֯�缡�⡢֬���ȶ��ǵ����ã���������������ԭ�ֽ⣻�����ȵ��صֿ��������ȵ��������Ե����á������ڷ��֣������򲡻��ߣ�������Ѫ����Ӱ�졣");
    String d= ("   �ŵ��ȱ�㣺\n   �ŵ��ǿ��Դٽ�������֯�������ǵ���ȡ�������ȵ��ص������ԡ�\n   ȱ���Ƕ�θ�����̼���������θ������������������Ӧ���׵������ݣ�����Ӫ��������ʹ����ֿ����½���\n   ��ˣ�������θ�����������ߡ����������ߡ������ز����񾭲���������㼰�и��Ͳ����ڸ�Ů���ٴ�Ӧ��Ӧע�⣬����ҩӦ�ü���������������������ж��������ܲ�ȫ��Ӧ���û���á�");
    String e= ("   ������ø���Ƽ���Ҫ�����������ǣ�����ƽ���������в��ǣ������������ڿ���Ѫ�Ǽ���\n   ����ԭ��̼ˮ�����������Ҫ��С���Ĥˢ״Ե�Ħ�?����ø�����ֽܷ�Ϊ���Ƕ�������Ѫ������ҩ����������һ�����ã����ӻ�̼ˮ����������ն��𵽽������ã������ڲͺ�Ѫ�Ǹ��ߡ�");
    String f= ("   �ŵ��ȱ�㣺\n   �ŵ��ǰ�ȫ�ɿ����ɽ��Ͳͺ�Ѫ�ǵȡ�\n   ȱ���ǿ�����θ������Ӧ�縹�ͣ������ȣ�������֫���ݡ�Ӫ�������ȡ�\n   �ٴ�Ӧ��Ӧע����������ͬʱ���ã�����ʳ̼ˮ�������������á�����һ�㲻�������Ѫ�ǣ���������ҩӦ��һ�����ֵ�Ѫ��Ӧֱ�ӿڷ������ǻ��������ǣ���ʳһ��ʳ����Ч��");
    String g= ("   �ǻ������ȵ��شٽ�����Ҫ����������Σ�ŵ�����������ϣ����Ǹ����Σ�����������ҩ�������ȵ�ϸ���������������ȵ��ط��ڼ���\n   ����ԭ���������ҩ���ƣ�����ѧ�ṹ��û�л����ಿ�֣����ȵ��ط��ڿ�����ݣ�ģ���ȵ��ط��ڡ���ҪӦ���ڿ��Ʋͺ��Ѫ�ǡ�");
    String h= ("   �ŵ��ȱ�㣺\n   �ŵ��ǲ������ȵ�ϸ���������޵�Ѫ�Ƿ�Ӧ������ʳ����ҩ�ȡ�\n   ȱ���Ǽ۸�ߣ������ѽ��ܡ�");
    String i= ("   �ȵ��������ֳ��������ͪ��ҩ�������޸���ͪ���ĵ��š�̫�ޡ�ά���壩��������ͪ����͡����ͮ�������ף���\n   ����ԭ��Ϊ�����ȵ��ص������ԣ������ȵ��صֿ����ɵ���Ӧ�û�����������ҩӦ�á�");
    String j= ("   �ŵ��ȱ�㣺\n   �ŵ��Ǹ�ҩֱ�����������򲡵Ĳ������أ�����ȵ��������ԡ�\n   ȱ���Ǽ۸�ߣ�Ӧ��ǰ�����ȵ������пɶ��ȵ����������ʵ����ߡ��ζ��Դ��ߡ� ");
    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id){
    	if(groupPosition==0&childPosition==0){
    			new AlertDialog.Builder(medicine1.this)
                .setIcon(R.drawable.alert_dialog_icon)
                .setTitle("�������ೣ��ҩ")
                .setMessage(a)
                .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                	public void onClick(DialogInterface dialog, int whichButton) {
                        
                    }
                })
                
                .create().show(); 
    		}
    	else if(groupPosition==0&childPosition==1){
    			new AlertDialog.Builder(medicine1.this)
                .setIcon(R.drawable.alert_dialog_icon)
                .setTitle("��������ҩƷ��ȱ��")
                .setMessage(b)
                .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                	public void onClick(DialogInterface dialog, int whichButton) {
                        
                    }
                })
                
                .create().show(); 
    		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("˫���ೣ��ҩ")
            .setMessage(c)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                 
                }
            })
            
            .create().show(); 
		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("˫����ҩƷ��ȱ��")
            .setMessage(d)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create().show(); 
		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("��-������ø���Ƽ�����ҩ")
            .setMessage(e)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                  
                }
            })
            
            .create().show(); 
		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("��-������ø���Ƽ�ҩƷ��ȱ��")
            .setMessage(f)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                  
                }
            })
            
            .create().show(); 
		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("�ǻ������ȵ��شٽ�������ҩ")
            .setMessage(g)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                   
                }
            })
            
            .create().show(); 
		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("�ǻ������ȵ��شٽ�����ҩƷ��ȱ��")
            .setMessage(h)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create().show(); 
		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("�ȵ�������������ҩ")
            .setMessage(i)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                   
                }
            })
            
            .create().show(); 
		}
    	else if(groupPosition==0&childPosition==1){
			new AlertDialog.Builder(medicine1.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("�ȵ���������ҩƷ��ȱ��")
            .setMessage(j)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create().show(); 
		}
    	return true;
    }
   
}
    
