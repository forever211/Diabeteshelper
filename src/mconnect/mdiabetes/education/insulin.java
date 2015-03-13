package mconnect.mdiabetes.education;

import android.app.AlertDialog;
import android.app.ExpandableListActivity;
import android.content.DialogInterface;
import android.content.Intent;
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
public class insulin extends ExpandableListActivity implements OnChildClickListener{
	private String[]menu1 = {"�ȵ��ط���","�ȵ���ʹ��","ע������"};
	private String[][]menu2={
			                   {"����Դ����","��ҩЧʱ�����","����ҩװ�÷���","�ȵ��ر�ʶʶ��"},
			                   {"ҩ������","��ʼ��������","ע�䷽��"},
			                   {"��ŷ���","ע����֪"}
	                          };
    private ExpandableListAdapter mAdapter;
   
    private static final String NAME = "NAME";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setTitle("�ȵ�����֪");
        List<Map<String,String>> groupData = new ArrayList<Map<String, String>>();
        List<List<Map<String, String>>> childData = new ArrayList<List<Map<String, String>>>();
        for (int i = 0; i < 3; i++) {
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
    String a =("    �ȵ����Ƽ��ɷ�Ϊ:\n   ���ȵ��ء����ȵ��ء�ţ�ȵ��ء�\n   �����ȵ��������ȵ��ص��������ڽṹ�ϰ��������еĲ�ͬ����������ȵ��ش���һ��������ԭ�ԣ��������������������¹�����Ӧ�����⣬�����ȵ��ص�Ч�۵ͣ��ɶ����ȵ��ػ������ȵ���ʱ������Ӧ����15����20������������ӵ�Ѫ�Ƿ��ա�");
    String []c= {"ע��ʽ","��ע��ʽ"};
    String c1= ("    ע��ʽ�ȵ��ذ�����\n1.��ͨע��Һ������ƿ��\n2.�ȵ��ر�о����ʽƿ��\n3.�س�װ�ã��ֱ��Σ�\n4.�ȵ��س���Ƥ��ע��ã���ǻֲ���ͱã���");
    String c2= ("    ��ע��ʽ�ȵ���Ŀǰ�����л������з���Ʒ���У�\n1.���������Exubera���а�������˳��г���\n2.��ǻ�����\n3.�ڷ��Ƽ�\n4.��ǻ�����\n5.͸Ƥ��ҩ�Ƽ���");
    String d=  ("    �����ȵ����ж��ּ��ͺ͹��ʹ��ǰ���Ҫ���塣\n    �����ı�ʶ�У�\nһ�����ͱ�ʶ��\nRI����дR�������Ч�ȵ��أ�\nNPH����дN��������Ч�ȵ��أ�\nPZI����Ч�ȵ��أ�\n30R����70/30����ʾ��30����Ч�ȵ��غ�70����Ч�ȵ��ص�Ԥ���ȵ��أ�\n\50R����50/50����ʾ��50����Ч�ȵ��غ�50����Ч�ȵ��ص�Ԥ���ȵ��ء�\n����Ũ�ȱ�־��\nU-40��ʾ�ȵ��ص�Ũ����40U/ml��\nU-100��ʾ�ȵ��ص�Ũ����100U/ml��");
    String e=  ("    �ȵ��ض����ʴ�л�ĵ���������Ҫ���á�\n    ��������֮������֯ϸ���������Լ�����ת�����Ԫ��֬���дٽ����ã�������ʹѪ�Ǻ������ͣ�\n    ���⣬������ʹ���������ϸ�����ٶȼӿ죬�ٽ�ϸ���ڵĵ����ʺϳɡ� ");
    String []f= {"��ʼ������Ҫ��","�������Ƕ���ѡ��","����Ѫ��ֵѡ��","���ݻ����ཱུ��ҩ����ѡ��","���ݾ���ѡ��"};
    String f1= ("    �ڿ�ʼ���ȵ�����ǰ����һ���¾��ǵþ���һ�������״�����ȵ��ء�һ����˵����ʼ���ȵ���ʱ��ÿ��3��4�Σ������ǰ����������ǰ������֮�����ǰ������С�ķ���ע�䣬�����Ҫ˯ǰ�Ӵ�һ��Ļ����������С��\n    ѡ�����ע���ȵ���������ٸ���Ѫ�ǿ��Ƶ�ˮƽ��һ�����Ե�����  ");
    String f2= ("    �����ǵġ��������������ȵ��ص�ʹ�ü�����һ������һ����������һ��ע��3��4��λ�ȵ��ء� ");
    String f3= ("    ȫ���ȵ���������0.003����Ѫ�ǣ�����/��������100�������أ�ǧ�ˣ�");
    String f4= ("    ��ÿƬ�����ཱུ��ҩ��5����λ�ȵ��������㣺���緹ǰ����Ƭ�Ž��ǣ����Ը�Ϊ10����λ�ȵ��أ�");
    String f5= ("    �ɸ���Ѫ�ǵĸߵ;���������ǰ��8��4��6����10��6��8����λ���ȵ�����Ϊ�ȵ��صĳ�ʼ����������һ���Ƚϼ򵥿���ʵ�õķ�����");
    String g=  ("һ����ȷѡ��ע�䲿λ�͹��� \n    ÿ��ע�䲿λ��Ӧ�ֻ����ɰ�������ԭ��ѡ���ҶԳƵĲ�λ����ע�䣬����ѡ�����ϱۣ������ҶԳ��ֻ�ע�䡣������󣬻����Ҹ����������ɱ�����ͬ��λ�ȵ������ղ�ͬ�����Ѫ�ǲ�����\n    ����ע�䲿λ���ϱ���ࡢ������������ࡢ�β�����ͬ��λ�ȵ��������ɿ�����������Ϊ�������ϱۡ����ȡ��β������ż���Է�ʱ����ǰ����ѡ������������������֮��������Ƴ٣���ѡ�β�ע�䡣\n����ע�乤��ѡ��\n    Ӧѡ���ȵ���ר��ע�������ȵ��رʣ�����ע�乤�߲����򵥣�����׼ȷ����ͷ��ϸ������������ʹ�С�������ر�Ҫ��������ע���ȵ��ص��������ѣ�������ר��ע�������Ǳ�����ͷ����ӦΪһ����ʹ�ã��ظ�ʹ�û�ʹ��ͷ��ۣ��������۲��ײ����ȱ�ں͵�������������ʹ�У������ж����Ƥ����Ⱦ��Σ�ա�");
    String h=  ("    1���ȵ����뱣����10�����µ�������ڣ���2��~8���¶ȵı����пɱ��ֻ��Բ���2~3�꣬��ʹ�Ѳ��ֳ���ʹ�õ��ȵ���Ҳ����ˡ�ʹ��ʱ���¶Ȳ�����30��ʹ���2��ĵط����ɣ�������ܿ����⣬�Է�ʧЧ��\n    2������ʹ���е��ȵ��أ�ֻҪ���������������Ϳ����ˡ���ƿʹ���е�ƿװ�ȵ��ؿ��Է��ڱ����������У�����Լ3���¡�ʹ���е��ȵ��ر�о��Ҫ���ȵ��ر�һ��Ż�������У�������Я������4�ܡ�\n    3���������ȵ������Ǳ���ҡ����Сʱ����û���ʵ�����ʱ����ܻ��γ��ſ飬��ʱ�ȵ��ؾ�Ӧ�ö�����");
    String i=  ("    1���ȵ��ع�����ʹѪ�ǹ��͡���֢״��Ѫ�ǽ��͵ĳ̶Ⱥ��ٶȶ������ɳ��ּ����С����񲻰��������ӿ졢ͫ��ɢ�󡢽��ǡ�ͷ�Ρ�����ʧ������������ԣ��������ʡ����뼰ʱ����ʳ�����ࡣ���ֵ�Ѫ���ݿ�ʱ����ע50%��������Һ50ml����Ҫʱ���پ���5%������Һ��\n    2��ע�䲿λ����Ƥ�����졢Ƥ�½�ں�Ƥ��֬��ή���Ⱦֲ���Ӧ�����辭������ע�䲿λ��\n    3�������ɷ���ݡ����ȣ�ż�й������ݿˣ����������������ȣ��� \n    4�����������˿ɲ����ȵ��������ԣ�����û��֢ͪ���ж�������£�ÿ���ȵ�������������200��λ������Ҫԭ�����Ϊ��Ⱦ��ʹ��Ƥ�ʼ��ػ����ڴ������ȵ��ؿ��壬�ܺ��ȵ��ؽ�ϡ���ʱ�ɸ����ò�ͬ�����������Ƽ���ӷ��ڷ���Ѫ��ҩ��\n    5����Ѫ�ǡ���Ӳ�䡢��Ѫ�Ի��㡢�����ס����׵Ȳ��˼��á� \n    6��ע��Һ�жຬ�з�������һ�㲻�����ھ�ע����ע�����������ȵ����Ƽ���");
    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id){
    	if(groupPosition==0&childPosition==0){
    		new AlertDialog.Builder(insulin.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("��Դ����")
            .setMessage(a)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	
                }
            })
            
            .create().show();
    	}
       else if(groupPosition==0&childPosition==1){
    		Intent in = new Intent(insulin.this,insulin1.class);
    		 startActivity(in);
    }
       else if(groupPosition==0&childPosition==2){
    	   new AlertDialog.Builder(insulin.this)
           .setTitle("��ҩװ�÷���")
           .setItems(c, new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int p) {
                   if(p==0){
                	   new AlertDialog.Builder(insulin.this)
                       .setIcon(R.drawable.alert_dialog_icon)
                       .setTitle("ע��ʽ�ȵ���")
                       .setMessage(c1)
                       .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                           public void onClick(DialogInterface dialog, int whichButton) {     
                           }
                       })
                       
                       .create().show();
                	   
                   }
                   else if(p==1){
                	   new AlertDialog.Builder(insulin.this)
                       .setIcon(R.drawable.alert_dialog_icon)
                       .setTitle("��ע��ʽ�ȵ���")
                       .setMessage(c2)
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
        else if(groupPosition==0&childPosition==3){
        	new AlertDialog.Builder(insulin.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("���ʶ���ȵ��ر�ʶ")
            .setMessage(d)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {    
                }
            })
            
            .create().show();
    	}
        else if(groupPosition==1&childPosition==0){
        	new AlertDialog.Builder(insulin.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("ҩ������")
            .setMessage(e)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {    
                }
            })
            
            .create().show();
        }
        else if(groupPosition==1&childPosition==1){
        	new AlertDialog.Builder(insulin.this)
            .setTitle("��ʼ����ѡ��ο�����")
            .setItems(f, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int p) {
                	 if(p==0){
                  	   new AlertDialog.Builder(insulin.this)
                         .setIcon(R.drawable.ic_popup_reminder)
                         .setTitle("��ʼ����ѡ����֪")
                         .setMessage(f1)
                         .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog, int whichButton) {   
                             }
                         })
                         
                         .create().show();
                  	   
                     } 
                	   else if(p==1){
                 	    new AlertDialog.Builder(insulin.this)
                        .setIcon(R.drawable.ic_popup_reminder)
                        .setTitle("��������")
                        .setMessage(f2)
                        .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {     
                            }
                        })
                        
                        .create().show();
                 	   
                    }
                    /* User clicked so do some stuff */
                      else if(p==2){
                 	     new AlertDialog.Builder(insulin.this)
                        .setIcon(R.drawable.ic_popup_reminder)
                        .setTitle("Ѫ������")
                        .setMessage(f3)
                        .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {   
                            }
                        })
                        
                        .create().show();
                 	   
                    } 
                      else if(p==3){
                  	    new AlertDialog.Builder(insulin.this)
                         .setIcon(R.drawable.ic_popup_reminder)
                         .setTitle("����ҩ����")
                         .setMessage(f4)
                         .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog, int whichButton) {   
                             }
                         })
                         
                         .create().show();
                  	   
                     } 
                       else if(p==4){
                  	     new AlertDialog.Builder(insulin.this)
                         .setIcon(R.drawable.ic_popup_reminder)
                         .setTitle("��������")
                         .setMessage(f5)
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
        else if(groupPosition==1&childPosition==2){
        	new AlertDialog.Builder(insulin.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("�����ȷ����ȫ��ע���ȵ���")
            .setMessage(g)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {     
                }
            })
            
            .create().show();
     	   }
        else if(groupPosition==2&childPosition==0){
        	new AlertDialog.Builder(insulin.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("�ȵ��ش��")
            .setMessage(h)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {     
                }
            })
            
            .create().show();
     	   }
        else if(groupPosition==2&childPosition==1){
        	new AlertDialog.Builder(insulin.this)
            .setIcon(R.drawable.ic_popup_reminder)
            .setTitle("ע����֪")
            .setMessage(i)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {     
                }
            })
            
            .create().show();
     	   }
    return true;
    }
}