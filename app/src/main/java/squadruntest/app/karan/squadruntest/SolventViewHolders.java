package squadruntest.app.karan.squadruntest;

/**
 * Created by Karan on 11/27/2015.
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import org.w3c.dom.Attr;

import static android.support.v7.widget.RecyclerView.*;
import static android.view.View.MeasureSpec;

public class SolventViewHolders extends ViewHolder{

    //public RadioGroup rg;
    public RadioButton rb;
   // private int columnWidth=-1;

    public SolventViewHolders(View itemView) {
        super(itemView);
        //itemView.setOnClickListener(this);

        rb = (RadioButton) itemView.findViewById(R.id.radioButton);


    }

    /*private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            int[] attrsArray = {
                    android.R.attr.columnWidth
            };
            TypedArray array = context.obtainStyledAttributes(attrs, attrsArray);
            columnWidth = array.getDimensionPixelSize(0, -1);
            array.recycle();
        }

        manager = new GridLayoutManager(getContext(), 1);
        setLayoutManager(manager);
    }*/

    /*@Override
    protected void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec)
                - itemView.getPaddingRight();
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);

        boolean growHeight = widthMode != MeasureSpec.UNSPECIFIED;

        int width = 0;
        int height = itemView.getPaddingTop();

        int currentWidth = itemView.getPaddingLeft();
        int currentHeight = 0;

        boolean breakLine = false;
        boolean newLine = false;
        int spacing = 0;
        //ViewGroup v;

       final int count =.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = itemView.getChildAt(i);
            super.measureChild(child, widthMeasureSpec, heightMeasureSpec);

            Toolbar.LayoutParams lp = (Toolbar.LayoutParams) child.getLayoutParams();
            spacing = mHorizontalSpacing;
            if (lp.horizontalSpacing >= 0) {
                spacing = lp.horizontalSpacing;
            }

            if (growHeight
                    && (breakLine || currentWidth + child.getMeasuredWidth() > widthSize)) {
                height += currentHeight + mVerticalSpacing;
                currentHeight = 0;
                width = Math.max(width, currentWidth - spacing);
                currentWidth = getPaddingLeft();
                newLine = true;
            } else {
                newLine = false;
            }

            lp.x = currentWidth;
            lp.y = height;

            currentWidth += child.getMeasuredWidth() + spacing;
            currentHeight = Math.max(currentHeight, child.getMeasuredHeight());

            breakLine = lp.breakLine;
        }

        if (!newLine) {
            height += currentHeight;
            width = Math.max(width, currentWidth - spacing);
        }

        width += getPaddingRight();
        height += getPaddingBottom();

        setMeasuredDimension(resolveSize(width, widthMeasureSpec),
                resolveSize(height, heightMeasureSpec));
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        final int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            LayoutParams lp = (LayoutParams) child.getLayoutParams();
            child.layout(lp.x, lp.y, lp.x + child.getMeasuredWidth(), lp.y
                    + child.getMeasuredHeight());
        }*/
}

