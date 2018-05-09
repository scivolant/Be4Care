package rrdl.be4care.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import rrdl.be4care.Models.Doctor;
import rrdl.be4care.Models.User;
import rrdl.be4care.R;

public class RepertoireAdapter extends BaseAdapter {
    private Context mContext;
    private User user;
    private List<Doctor> doctors;
    private Doctor buffer;
    public RepertoireAdapter(Context context, List<Doctor> doctors) {
        mContext = context;
        this.doctors=doctors;
    }


    @Override
    public int getCount() {
        return doctors.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Doctor buffer;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View element = inflater.inflate(R.layout.repertoire_item, viewGroup, false);
        TextView title = element.findViewById(R.id.Title);
        ImageView fav=element.findViewById(R.id.fav);
        buffer=doctors.get(i);
        title.setText( buffer.getFullName().toString());
        if(buffer.getStar()==true){fav.setVisibility(View.VISIBLE);}
        return element;
    }
}