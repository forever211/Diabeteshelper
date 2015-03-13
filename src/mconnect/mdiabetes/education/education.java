package mconnect.mdiabetes.education;

import mconnect.mdiabetes.framework.R;
import android.app.Dialog;
import android.app.ExpandableListActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.ExpandableListContextMenuInfo;



// ExpandableList - ��չ��/�����б�

// �̳� ExpandableListActivity ��ʵ���б�Ŀ�չ��/�����Ĺ���



public class education extends ExpandableListActivity {

    

    private ExpandableListAdapter mAdapter;
    private Intent intent;
    private double height;
	private EditText mEditText;
    @Override
    protected Dialog onCreateDialog(int id) {
		if (id == 1) {
			return new AlertDialog.Builder(education.this)
	          .setIcon(R.drawable.check)
			.setTitle(R.string.alert_dialog_two_buttons_title)
			.setMessage(R.string.alert_dialog_two_buttons2_msg)
			.setPositiveButton(
					R.string.alert_dialog_ok,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int whichButton) {

							/* User clicked OK so do some stuff */
						}
					})
			// .setNegativeButton(R.string.alert_dialog_cancel, new
			// DialogInterface.OnClickListener() {
					// public void onClick(DialogInterface dialog, int
					// whichButton) {

					/* User clicked Cancel so do some stuff */
					// }
					// })
					.create();
		} else if (id == 2) {
			return new AlertDialog.Builder(education.this)
					.setTitle(R.string.select_dialog1)
					.setItems(R.array.select_dialog_items2,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int which) {
									if (which == 0) {
										intent = new Intent(
												education.this,
												k1200.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 1) {
										intent = new Intent(
												education.this,
												k1400.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 2) {
										intent = new Intent(
												education.this,
												k1600.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 3) {
										intent = new Intent(
												education.this,
												k1800.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 4) {
										intent = new Intent(
												education.this,
												k2000.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 5) {
										intent = new Intent(
												education.this,
												k2200.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									}
									/* User clicked so do some stuff */
									// String[] items =
									// getResources().getStringArray(R.array.select_dialog_items);
									// new
									// AlertDialog.Builder(whatIsDiabetes.this)
									// .setMessage("You selected: " + which +
									// " , " + items[which])
									// .show();
								}
							}).create();

		} else if (id == 3) {
			LayoutInflater factory = LayoutInflater.from(this);
			final View textEntryView = factory.inflate(
					R.layout.alert_dialog_text_entry, null);

			return new AlertDialog.Builder(education.this).setIcon(
					R.drawable.alert_dialog_icon).setTitle(
					R.string.alert_dialog_text_entry).setView(textEntryView)
					.setPositiveButton(R.string.alert_dialog_ok,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {

									mEditText = (EditText) textEntryView
											.findViewById(R.id.username_edit);
									if (mEditText.getText().toString().length() == 0) {

										new AlertDialog.Builder(
												education.this)
												.setMessage("��ݔ����������")
												.setTitle("��ʾ")
												.setNeutralButton(
														"ȷ��",
														new DialogInterface.OnClickListener() {
															@Override
															public void onClick(
																	DialogInterface dialog,
																	int which) {
																// TODO
																// Auto-generated
																// method stub
																mEditText
																		.setHighlightColor(Color.RED);
															}
														}).create().show();
										return;
									}

									height = Double.parseDouble(mEditText
											.getText().toString());

									Intent intent1 = new Intent();

									intent1.setClass(
											education.this,
											Next.class);

									Bundle bun = new Bundle();
									bun.putDouble("Height", height);

									intent1.putExtras(bun);
									startActivity(intent1);
									education.this.finish();
								}
							}).setNegativeButton(R.string.alert_dialog_cancel,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {

									/* User clicked cancel so do some stuff */
								}
							}).create();
		} else if (id == 4) {
			return new AlertDialog.Builder(education.this)
					.setTitle(R.string.select_dialog2).setItems(
							R.array.select_dialog_items3,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int which) {
									if (which == 0) {
										intent = new Intent(
												education.this,
												walk.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 1) {
										intent = new Intent(
												education.this,
												swimming.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 2) {
										intent = new Intent(
												education.this,
												taiji.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 3) {
										intent = new Intent(
												education.this,
												jog.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 4) {
										intent = new Intent(
												education.this,
												yoga.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									} else if (which == 5) {
										intent = new Intent(
												education.this,
												atHome.class);
										startActivity(intent);
										overridePendingTransition(R.anim.fade,
												R.anim.hold);
									}
									/* User clicked so do some stuff */
									// String[] items =
									// getResources().getStringArray(R.array.select_dialog_items);
									// new
									// AlertDialog.Builder(whatIsDiabetes.this)
									// .setMessage("You selected: " + which +
									// " , " + items[which])
									// .show();
								}
							}).create();

		} else
			return null;

	}
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        // TODO Auto-generated method stub

        super.onCreate(savedInstanceState);



        setTitle("����֪ʶ");

        
        mAdapter=new MyExpandableListAdapter();
        

        setListAdapter(mAdapter);

        registerForContextMenu(this.getExpandableListView());

    }



    // Ϊ�б��ÿһ��������Ĳ˵���������������Ĳ˵��� 

    @Override

    public void onCreateContextMenu(ContextMenu menu, View v,

            ContextMenuInfo menuInfo) {

        menu.setHeaderTitle("ContextMenu");

        menu.add(0, 0, 0, "ContextMenu");

    }



    // ���������Ĳ˵�����߼�

    @Override

    public boolean onContextItemSelected(MenuItem item) {

        ExpandableListContextMenuInfo info = (ExpandableListContextMenuInfo) item.getMenuInfo();

        String title = ((TextView) info.targetView).getText().toString();



        int type = ExpandableListView.getPackedPositionType(info.packedPosition);

        if (type == ExpandableListView.PACKED_POSITION_TYPE_CHILD) {

            int groupPos = ExpandableListView.getPackedPositionGroup(info.packedPosition);

            int childPos = ExpandableListView.getPackedPositionChild(info.packedPosition);

            

            Toast.makeText(this, title + " - Group Index: " + groupPos + " Child Index: " + childPos, Toast.LENGTH_SHORT).show();

            

            return true;

        } else if (type == ExpandableListView.PACKED_POSITION_TYPE_GROUP) {

            int groupPos = ExpandableListView.getPackedPositionGroup(info.packedPosition);

            Toast.makeText(this, title + " - Group Index: " + groupPos, Toast.LENGTH_SHORT).show();

            

            return true;

        }



        return false;

    }
    
       
    
    public class MyExpandableListAdapter extends BaseExpandableListAdapter {



        // ���б�����

        private String[] groups = 

        { 

        		"����֪ʶ","��ʳ����","�˶�����","ҽҩ����","���Ҽ��"

        };

        // ���б�����

        private String[][] children = 

        {

        		{"����ǳ֪","������������"},
                {"��ʳ��֪","��ʳ������","�����Ƽ�"},
                {"�˶���֪","�˶�ǿ�ȿ���","�Ƽ��˶�"},
                {"�ڷ�����ҩ","�ȵ���"},
                {"Ѫ�Ǽ��","���ؼ��"},
        };

        

        @Override

        public Object getChild(int groupPosition, int childPosition) {

            return children[groupPosition][childPosition];

        }



        @Override

        public long getChildId(int groupPosition, int childPosition) {

            return childPosition;

        }



        @Override

        public int getChildrenCount(int groupPosition) {

            return children[groupPosition].length;

        }



        // ȡ���б��е�ĳһ��� View

        @Override

        public View getChildView(int groupPosition, int childPosition,

        		boolean isLastChild,View convertView, ViewGroup parent) {

            TextView textView = getGenericView();

            textView.setText(getChild(groupPosition, childPosition).toString());
            return textView;
            

        }



        @Override

        public Object getGroup(int groupPosition) {

            return groups[groupPosition];

        }



        @Override

        public int getGroupCount() {

            return groups.length;

        }



        @Override

        public long getGroupId(int groupPosition) {

            return groupPosition;

        }



        // ȡ���б��е�ĳһ��� View

        @Override

        public View getGroupView(int groupPosition, boolean isExpanded,

                View convertView, ViewGroup parent) {

            TextView textView = getGenericView();

            textView.setText(getGroup(groupPosition).toString());

            return textView;

        }



        @Override

        public boolean hasStableIds() {

            return true;

        }
        
       String []a={"��׼���ؼ���","����ָ������"};   
       @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
        //public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id){	
            if(groupPosition==0&childPosition==0){
        		Intent in = new Intent(education.this,knowledge.class);
	         		 startActivity(in);}
        	else if(groupPosition==0&childPosition==1){
        		Intent in1 = new Intent(education.this,psychological.class);
        		 startActivity(in1);
        		}
        	else if(groupPosition==1&childPosition==0){
        		Intent in = new Intent(education.this,dietPlan.class);
				startActivity(in);
				//overridePendingTransition(R.anim.fade, R.anim.hold);
        	    }
            else if(groupPosition==1&childPosition==1){
            	Intent intent = new Intent(education.this,
						dietCounting.class);
				startActivity(intent);
				overridePendingTransition(R.anim.fade, R.anim.hold);
        	    }
           else if(groupPosition==1&childPosition==2){
        	   showDialog(2);
                }
            else if(groupPosition==2&childPosition==0){
            	Intent intent = new Intent(education.this,
						exerciseTip.class);
				startActivity(intent);
        	    }
            else if(groupPosition==2&childPosition==1){
            	showDialog(3);
                }
            else if(groupPosition==2&childPosition==2){
            	showDialog(4);
                }
            else if(groupPosition==3&childPosition==0){
            	 Intent in = new Intent(education.this,medicine.class);
         		 startActivity(in);
         		 }
            else if(groupPosition==3&childPosition==1){
           	 Intent in = new Intent(education.this,insulin.class);
        		 startActivity(in);
        		 }
            else if(groupPosition==4&childPosition==0){
            	Intent in = new Intent(education.this,glucose.class);
       		         startActivity(in);
       		      }
            
            else if(groupPosition==4&childPosition==1){
            	new AlertDialog.Builder(education.this)
                .setTitle("���ؼ��")
                .setItems(a, new DialogInterface.OnClickListener() {
                  public void onClick(DialogInterface dialog, int which) {
                	  if(which==0){
                   	   Intent in = new Intent(education.this,weight.class);
                 		 startActivity(in);
                 		 }
                	  else if(which==1){
                   	   Intent in = new Intent(education.this,index.class);
                 		 startActivity(in);
                 		 }   
                       
                       
                    }
                })
                .create().show();
            }
            	 
            	 /*new AlertDialog.Builder(eduction.this)
                   .setIcon(R.drawable.alert_dialog_icon)
                   .setTitle("�ڷ�����ҩƷ")
        		   .setSingleChoiceItems(a,0,new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int p1) {
                                
                                   
                               }
                           })
                         .create().show();*/
        		   
            return true;
       }
                         
                

       // ��ȡĳһ��� View ���߼�

        private TextView getGenericView() {

            AbsListView.LayoutParams lp = new AbsListView.LayoutParams(

                    ViewGroup.LayoutParams.FILL_PARENT, 64);

            TextView textView = new TextView(education.this);

            textView.setLayoutParams(lp);

            textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);

            textView.setPadding(72, 12, 0, 12);
            textView.setTextSize(32);

            return textView;

        }
       
  
    }
    
}