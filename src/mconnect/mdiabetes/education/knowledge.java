package mconnect.mdiabetes.education;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mconnect.mdiabetes.framework.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class knowledge extends Activity{
	
	private ListView myListView;
	private String a=("   ���򲡣�diabetes����һ�ֳ������ڷ��ڼ����������Ŵ����ء����߹������ҡ�΢�����Ⱦ���䶾�ء����ɻ����ء��������صȵȸ����²����������ڻ��嵼���ȵ����ܼ��ˡ��ȵ��صֿ�(Insulin Resistance��IR)�ȶ��������ǡ������ʡ�֬����ˮ�͵���ʵ�һϵ�д�л�����ۺ�������\n   �ȵ��������������е����ٷ��ڣ��ȵ�����ʹѪ�е�������˳�������˵ĸ�������֯��ϸ���У�Ϊ�����ṩ���������������Ѫ��Ũ����Ȼ��������������������ȵ��صĵ����£���ʹ���ֲ���������һ���ķ�Χ�ڡ������ȱ���ȵ��ػ����ȵ��ز�����������ʱ���ͻ�ʹѪ�е��������޷�����ϸ���ṩ������Ѫ����˻����߲��������򲡡�\n   ���򲡵���������ΪѪҺ�������ǵ�Ũ���쳣���߼����������ǡ��������򲡵ò�ʱ����ӳ��������ڵĴ�л��������ò����ܺõĿ��ƣ���һ����չ�������ȫ��������صļ������Բ���֢������Σ���˵�������");
	private    String b=("��������");
	private String []c={"1������","2������","����������"};
	private  String c1=("   1������(������)������������ϵͳ��������������Ӧ�����������򲡡������ȵ�������������(IDDM)�����������򲡣��׳�������֢ͪ���ж�(DKA)���ֽ����귢�������򲡣�������Ϊ��������35����ǰ������ռ���򲡵�10%���¡�\n   1�������������ȵ������Ƶģ�Ҳ����˵���ߴӷ�����ʼ����ʹ���ȵ������ƣ���������ʹ�á�ԭ������1�����򲡻����������ٲ����ȵ��ص�ϸ���Ѿ������𻵣��Ӷ���ȫʧȥ�˲����ȵ��صĹ��ܡ��������ȵ��ؾ���ȱ��������£��ͻ�����Ѫ��ˮƽ�������ߣ��������򲡡� "); 
	private String c2=("   2������Ҳ�г��˷��������򲡣�����35~40��֮�󷢲���ռ���򲡻���90%���ϡ�2�����򲡻������ڲ����ȵ��ص�����������ȫɥʧ���еĻ��������ȵ��������������࣬���ȵ��ص�����Ч��ȴ����ۿۣ���˻������ڵ��ȵ�����һ�����ȱ��������ͨ��ĳЩ�ڷ�ҩ��̼������ȵ��صķ��ڡ������������в��ֲ�����Ҫ��1���������������ȵ������ơ�\n   2��������һ���ֲ������ȵ��صֿ�Ϊ�������˶���֣����ȵ��صֿ����ȵ����������½���Ѫ���ȵ��������Բ������ȵ��صֿ�������Բ��˵ĸ�Ѫ�Ƕ��ԣ��ȵ��ط�������Բ��㡣���ಡ������֢״�����ԣ�������ȷ���֮ǰ�Ϳɷ�����Ѫ�ܺ�΢Ѫ�ܲ���֢����һ���ֲ������ȵ��ط���ȱ��Ϊ�����ٴ�����Ҫ������Դ���ȵ���");
	private String c3=("   �������������򲡵�һ���������͡���ָ�����ڸ�Ů�����Ǵ�л���ڷ��ڵı仯��������򲡡�\n   �ڻ����Ժ�������̥������̥�����γɣ����ڽ϶�ĸ��ּ��أ���̥�������ء��Ƽ��ء��м��صȣ����������������Ӷ����ߣ�����30���Ժ�ﵽ�߷壬��Щ�����ܹ��ֿ��и����ڵ��ȵ��أ������и����ڷ��ڵ�������Ƥ�ʼ���Ҳ���ܹ��Կ��ȵ��أ�����и��ȵ��ع��ܱ����Ͳ��㣬�ټ��и����ڴ����ȵ��ضԿ��ĸ��ּ��ش��ڣ�ֱ��Ӱ���ȵ����ܣ������ڸ�Ů�����׷�������");
	private String []d={"����","����","��ʳ","����"};
	private  String d1=("   ����ָ��Ĵ������࣬��������Ҳ�������ӣ�24Сʱ�ڿ���20��Σ�������2��3������10��֮�ࡣ��Һ��ĭ�࣬���շ��ס���ճ������������Ѫ�����ߣ����������С�(8��9��10mmol/l)���������е������ӣ�������������������ࡣ");
	private String d2=("   ���֮��ʹ���ڵ�ˮ�ּ��٣�������Կڿ�������˷ܶ�˼����Ӧ��ָ�����ǣ����򲡵���ϱ�׼�����Ե��������У�������δ���ֶ���֮ǰ���ܾ���ȷ��Ϊ�����ˡ���һ���棬��������Ѫ��Ӳ������ʹ���������ߣ�����Ѫ�Ǻܸߣ����������ǣ�Ҳ������ֶ������ߣ������������񾭸����Լ�������������ˮ�ֶ�ʧ���ԣ����ڿ������޸о���Ҳ��˼������Ҳ���������˳����������ʺܸߵ����򲡷�֢ͪ�����Ի��Ե�ԭ��");
	private String d3=("   ����Ѫ�ǲ��ܽ���ϸ��������Ϊϸ�����ã��̼����Եļ��������˷ܶ���ʳ���ҽ�ʳ���ޱ����У���ɽ�ʳ�����ͽ�ʳ�����������ࡣ\n  Ӧ��ע�������2���������ڣ����ڸ��ȵ���Ѫ֢�Ĺ�ϵ��ʹѪ�����üӿ죬�����ֲ�ǰ�����Լ����У��������ֵ�Ѫ�ǣ���������2�����򲡵��׷�֢״��");
	private String d4=("   �������������ü��٣�֬���ֽ����ӣ������ʺϳɲ��㣬�ֽ�ӿ�ȣ����������ݣ����ж���֢״������ˮ�ֵĶ�ʧ�����������֢״��ͬ��������ʱ��Խ����Ѫ��Խ�ߣ�����Խ�أ�����Ҳ��Խ���ԡ�");
	private String []e={"�ո�Ѫ�Ǽ��","��������������","�ȵ�Bϸ�����ܲⶨ����","�ǻ�Ѫ�쵰�ײⶨ"};
	   
    @Override
    protected Dialog onCreateDialog(int id) {
    	if (id == 1) {
    		return new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("1������")
            .setMessage(c1)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create();		
    	}
    	else if (id == 2) {
    		return new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("2������")
            .setMessage(c2)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                   
                }
            })
            
            .create();
    	}
    	else if(id==3){
    		return new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("����������")
            .setMessage(c3)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                   
                }
            })
            
            .create();
    	}
    	else if (id==4){
    		return new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("����")
            .setMessage(d1)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create();
    	}
    	else if (id==5){
    		return new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("����")
            .setMessage(d2)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                   
                }
            })
            
            .create();
    	}
    	else if (id==6){
    		return new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("��ʳ")
            .setMessage(d3)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                
                }
            })
            
            .create();
    	}
    	else if (id==7){
    		return new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("����")
            .setMessage(d4)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                }
            })
            
            .create();
    	}
    	else if (id == 8) {
			return  new AlertDialog.Builder(knowledge.this)
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle("������ʲô")
            .setMessage(a)
            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
            	public void onClick(DialogInterface dialog, int whichButton) {
                    
                    
                }
            })

		.create();
		}
		else if (id == 9) {
			return new AlertDialog.Builder(knowledge.this)
            .setTitle(b)
            .setItems(c, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                           
                           if (which==0){
                        	   showDialog(1);
                           }
                           else if (which==1){
                        	   showDialog(2);
                           }
                           else if (which==2){
                        	   showDialog(3);
                           }
                }
            }) 
            .create();
		}
		else if (id == 10) {
			return new  AlertDialog.Builder(knowledge.this)
            .setTitle("����֢״����")
            .setItems(d, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                           
                           if (which==0){
                        	   showDialog(4);
                           }
                           else if (which==1){
                        	   showDialog(5);
                           }
                           else if (which==2){
                        	   showDialog(6);
                           }
                           else if (which==3){
                        	   showDialog(7);
                           }
                }
            }) 
            .create();
		}
		else if (id==11){
			return new AlertDialog.Builder(knowledge.this)
            .setTitle("�����Ŀ")
            .setItems(e, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    
                     }
                  })
              .create();
		}
				return null;

		}	
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);

		myListView = (ListView) findViewById(R.id.ListView01);

		SimpleAdapter adapter = new SimpleAdapter(this, getData(),
				R.layout.vlist, new String[] { "title", "info","img" },
				new int[] { R.id.title, R.id.info, R.id.img });
		myListView.setAdapter(adapter);
		 myListView.setOnItemClickListener(new OnItemClickListener() {

				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
		    
		        if (arg2 == 0){    showDialog(8); 	
		        	/*new AlertDialog.Builder(knowledge.this)
		            .setIcon(R.drawable.alert_dialog_icon)
		            .setTitle("������ʲô")
		            .setMessage(a)
		            .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
		            	public void onClick(DialogInterface dialog, int whichButton) {
		                    
		                    
		                }
		            })
		            
		            .create().show();*/
		        }
		        else if(arg2 == 1){   
		        	showDialog(9);
		        }
		        else if(arg2==2){
		        	showDialog(10);
		        }
		        else if(arg2==3){
		        	showDialog(11);
		        }
				}

			});
		}
		       /* else if(arg2 == 1){ 
		        	new AlertDialog.Builder(knowledge.this)
		            .setTitle(b)
		            .setItems(c, new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int which) {
		                           which=which;
		                      if(which==0){
		                    	  new AlertDialog.Builder(knowledge.this)
		                          .setIcon(R.drawable.alert_dialog_icon)
		                          .setTitle("1������")
		                          .setMessage(c1)
		                          .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
		                          	public void onClick(DialogInterface dialog, int whichButton) {
		                                  
		                              }
		                          })
		                          
		                          .create().show(); 
		                      }
		                      else if(which==1){
		                     	 new AlertDialog.Builder(knowledge.this)
		                          .setIcon(R.drawable.alert_dialog_icon)
		                          .setTitle("2������")
		                          .setMessage(c2)
		                          .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
		                          	public void onClick(DialogInterface dialog, int whichButton) {
		                                 
		                              }
		                          })
		                          
		                          .create().show(); 
		                      }
		                      else if(which==2){
		                    	  new AlertDialog.Builder(knowledge.this)
		                          .setIcon(R.drawable.alert_dialog_icon)
		                          .setTitle("����������")
		                          .setMessage(c3)
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
		        else if(arg2 == 2){ 
		        	new AlertDialog.Builder(knowledge.this)
		            .setTitle("����֢״����")
		            .setItems(d, new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int which) {
		                           which=which;
		                      if(which==0){
		                    	  new AlertDialog.Builder(knowledge.this)
		                          .setIcon(R.drawable.alert_dialog_icon)
		                          .setTitle("����")
		                          .setMessage(d1)
		                          .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
		                          	public void onClick(DialogInterface dialog, int whichButton) {
		                                  
		                              }
		                          })
		                          
		                          .create().show(); 
		                         }
		                      else if(which==1){
		                    	  new AlertDialog.Builder(knowledge.this)
		                          .setIcon(R.drawable.alert_dialog_icon)
		                          .setTitle("����")
		                          .setMessage(d2)
		                          .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
		                          	public void onClick(DialogInterface dialog, int whichButton) {
		                                 
		                              }
		                          })
		                          
		                          .create().show();  
		                      }
		                      else if(which==2){
		                    	  new AlertDialog.Builder(knowledge.this)
		                          .setIcon(R.drawable.alert_dialog_icon)
		                          .setTitle("��ʳ")
		                          .setMessage(d3)
		                          .setPositiveButton(R.string.alert_dialog_ok, new DialogInterface.OnClickListener() {
		                          	public void onClick(DialogInterface dialog, int whichButton) {
		                              
		                              }
		                          })
		                          
		                          .create().show();  
		                      }
		                      else if(which==3){
		                    	  new AlertDialog.Builder(knowledge.this)
		                          .setIcon(R.drawable.alert_dialog_icon)
		                          .setTitle("����")
		                          .setMessage(d4)
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
		        else if(arg2 == 3){ 
		        	new AlertDialog.Builder(knowledge.this)
		            .setTitle("�����Ŀ")
		            .setItems(e, new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int which) {
		                    
		                     }
		                  })
		              .create().show();
		               }	
				});
				}*/
		private List<Map<String, Object>> getData() {
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

			Map<String, Object> map = new HashMap<String, Object>();
			map = new HashMap<String, Object>();
			map.put("title", "���򲡸���");
			map.put("info", "");
			map.put("img", R.drawable.gaishu);
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("title", "��������");
			map.put("info", "");
			map.put("img", R.drawable.fenlei);
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("title", "�ٴ�����֢״");
			map.put("info", "");
			map.put("img", R.drawable.zhengzhuang);
			list.add(map);

			map = new HashMap<String, Object>();
			map.put("title", "��ϼ��");
			map.put("info", "");
			map.put("img", R.drawable.jiancha);
			list.add(map);

			return list;
	

	
	
	/*private String[]menu1 = {"���򲡸���","��������","�ٴ�����֢״","��ϼ��"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,menu1);
         setListAdapter(adapter);
         //setOnItemClickListener(this);
         setTitle("����֪ʶ");
    }  ;*/
   
    
		}
       }
		 
    
    
