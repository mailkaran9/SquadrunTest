package squadruntest.app.karan.squadruntest;

import android.content.Context;
import android.sax.Element;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Karan on 11/27/2015.
 */
/*public class ElementListAdapter extends RecyclerView.Adapter<ElementListAdapter.ViewHolder> {

    private List<Element> elements = new ArrayList<>();
    private Context context;

    private int[] state;

    public ElementListAdapter(Context context, List<Element> elements) {
        this.context = context;
        this.elements = elements;

        this.state = new int[elements.size()];
        Arrays.fill(this.state, -1);
    }

    @Override
    public ElementListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.option, parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Element ele = elements.get(position);





        holder.radioGroup.setVisibility(View.VISIBLE);


        setRadio(holder, this.state[position]);






    }

    private void setRadio(final ViewHolder holder, int selection) {

        System.out.println("SELECT:" + selection);
        RadioButton b1 = holder.rb1;
        RadioButton b2 = holder.rb2;
        RadioButton b3 = holder.rb3;
        RadioButton b4 = holder.rb4;

        b1.setChecked(false);
        b2.setChecked(false);
        b3.setChecked(false);
        b4.setChecked(false);

        if (selection == 0) b1.setChecked(true);
        if (selection == 1) b2.setChecked(true);
        if (selection == 2) b3.setChecked(true);
        if (selection == 3) b4.setChecked(true);
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View view;


        public RadioGroup radioGroup;
        public RadioButton rb1, rb2, rb3, rb4;


        public ViewHolder(View itemView) {
            super(itemView);

            view = itemView;


            radioGroup = (RadioGroup) itemView.findViewById(R.id.radio);
            rb1 = (RadioButton) itemView.findViewById(R.id.radioButton);
            rb2 = (RadioButton) itemView.findViewById(R.id.radioButton2);
            rb3 = (RadioButton) itemView.findViewById(R.id.radioButton3);
            rb4 = (RadioButton) itemView.findViewById(R.id.radioButton4);

        }
    }

}*/
