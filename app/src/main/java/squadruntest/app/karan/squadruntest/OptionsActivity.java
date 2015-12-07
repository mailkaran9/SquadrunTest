package squadruntest.app.karan.squadruntest;

import android.graphics.Point;
import android.nfc.Tag;
import android.os.Bundle;
import android.sax.Element;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karan on 11/21/2015.
 */
public class OptionsActivity extends ActionBarActivity {
    //RadioGroup rg;
    //public RadioButton rb1,rb2,rb3,rb4;
    String op1, op2, op3, op4;
    String[] myDataset = new String[4];
    //private TwoWayView twoWayView;
    //private RecyclerView myRecyclerView;
    //private RecyclerViewAdapter myRecyclerViewAdapter;

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        //twoWayView = (TwoWayView) findViewById(R.id.twoWayView);
        //RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        //recyclerView.setHasFixedSize(true);

        //gaggeredGridLayoutManager = new StaggeredGridLayoutManager(4, 1);
        //recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        //List<ItemObjects> gaggeredList = getListItemData();
        //List<Element> gaggeredList=getListItemData();

        //SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(OptionsActivity.this, gaggeredList);
        //recyclerView.setAdapter(rcAdapter);

        //myRecyclerView = (RecyclerView)findViewById(R.id.myrecyclerview);
       /* rg = (RadioGroup) findViewById(R.id.radio);*/


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            op1 = extras.getString("Option1");
            op2 = extras.getString("Option2");
            op3 = extras.getString("Option3");
            op4 = extras.getString("Option4");
        }
       /* staggeredGridLayoutManagerHorizontal =
                new StaggeredGridLayoutManager(
                        4, //The number of rows in the grid
                        LinearLayoutManager.HORIZONTAL);*/

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.myrecyclerview);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(4,LinearLayoutManager.HORIZONTAL);
        //gaggeredGridLayoutManager.setSpanCount(new StaggeredGridLayoutManager().setSpanCount(););
        gaggeredGridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        //List<ItemObjects> gaggeredList = getListItemData();
        myDataset[0]=op1;
        myDataset[1]=op2;
        myDataset[2]=op3;
        myDataset[3]=op4;
        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(myDataset);
        recyclerView.setAdapter(rcAdapter);

        //int w1,w2,w3,w4;
        //rb1.setText(op1);
        //rb2.setText(op2);
        //rb3.setText(op3);
        //rb4.setText(op4);

        //myRecyclerViewAdapter = new RecyclerViewAdapter(this);= = new String[20];
       // myRecyclerViewAdapter.setOnItemClickListener(this);
      //  myRecyclerView.setAdapter(myRecyclerViewAdapter);
       // myRecyclerView.setLayoutManager(staggeredGridLayoutManagerHorizontal);

      /*  rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb1.setChecked(true);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb1.setChecked(false);
                rb2.setChecked(true);
                rb3.setChecked(false);
                rb4.setChecked(false);
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(true);
                rb4.setChecked(false);
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(true);
            }
        });*/
       // w1=rb1.getWidth();
        //w2=rb2.getWidth();
        //w3=rb3.getWidth();
        //w4=rb4.getWidth();

       /* final LinearLayout layout = (LinearLayout)findViewById(R.id.linear);
        ViewTreeObserver vto = layout.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                layout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int width  = layout.getMeasuredWidth();
                int height = layout.getMeasuredHeight();
                System.out.println(width+"---"+height);

            }
        });
        System.out.println("-++"+params.width);
                */
       //System.out.println(w1[0] +"---"+ w2[0] +"----"+ w3[0] +"---"+ w4[0]);



       }
    }
        //System.out.println("---begins-----");

       /* int currentRowsWidth = 0,i;
        TableLayout tl = (TableLayout) findViewById(R.id.tablelayout);

        TableRow currentRow = new TableRow(this);
        currentRow.setLayoutParams(new TableRow.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT,RadioGroup.LayoutParams.WRAP_CONTENT));
        rg=new RadioGroup(this);
        System.out.println("---outside loop-----");
        final int[] w = new int[1];
        for (i=0;i<4;i++) {
        final RadioButton rb=new RadioButton(this);
           rb.setText(op1);
            rg.addView(rb);
            rb.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
            {
                @Override
                public void onGlobalLayout()
                {
                    // gets called after layout has been done but before display.
                    rb.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    w[0] =rb.getWidth();
                    // get width and height
                }
            });

           // There's where you check whether it still fits the current `TableRow` or not

            // System.out.println("--------"+rb.getText().toString()+"=="+ w[0] +"----"+params.width);
          /*  if (currentRowsWidth +rb.getWidth() < params.width) {
                currentRowsWidth += rb.getWidth();
                currentRow.addView(rb);
            }

            else {
                // It doesn't fit, add the currentRow to the table and start a new one
                tl.addView(currentRow);
                currentRow = new TableRow(this);
                currentRow.addView(rb);
                currentRowsWidth = rb.getWidth();
            }
        }
        if (currentRow.getChildCount() > 0)
            tl.addView(currentRow);
    }


}*/

   /* private List<Element> getListItemData(){
        List<Element> listViewItems = new ArrayList<Element>();
        listViewItems.add(new Element())
        listViewItems.add(new ItemObjects("Alkane", R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane", R.drawable.two));
        listViewItems.add(new ItemObjects("Alkyne", R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene", R.drawable.four));
        listViewItems.add(new ItemObjects("Amide", R.drawable.one));
        listViewItems.add(new ItemObjects("Amino Acid", R.drawable.two));
        listViewItems.add(new ItemObjects("Phenol", R.drawable.three));
        listViewItems.add(new ItemObjects("Carbonxylic", R.drawable.four));
        listViewItems.add(new ItemObjects("Nitril", R.drawable.one));
        listViewItems.add(new ItemObjects("Ether", R.drawable.two));
        listViewItems.add(new ItemObjects("Ester", R.drawable.three));
        listViewItems.add(new ItemObjects("Alcohol", R.drawable.four));

        return listViewItems;
    }*/