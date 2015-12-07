package squadruntest.app.karan.squadruntest;

/**
 * Created by Karan on 11/27/2015.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class SolventRecyclerViewAdapter  extends RecyclerView.Adapter<SolventViewHolders> {

    //public List<> itemList;
    private String[] mDataset;
    //private Context context;
    // private Context context;

    public SolventRecyclerViewAdapter(String[] myDataset) {
        //this.itemList = itemList;
        mDataset = myDataset;
        //this.context=context;

    }

    @Override
    public SolventViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.option,parent,false);
        SolventViewHolders rcv = new SolventViewHolders(layoutView);
        //StaggeredGridLayoutManager.LayoutParams layoutParams1 = ((StaggeredGridLayoutManager.LayoutParams)layoutView.getLayoutParams());
        ///layoutParams1.setFullSpan(true);

        return rcv;
    }

    @Override
    public void onBindViewHolder(final SolventViewHolders holder, int position) {
        holder.rb.setText(mDataset[position]);



    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
