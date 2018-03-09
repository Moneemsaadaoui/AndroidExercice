package rrdl.androidexercice;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oc.rss.fake.FakeNews;
import com.oc.rss.fake.FakeNewsList;

import java.util.List;

/**
 * Created by moneem on 02/03/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    List<FakeNews> list = FakeNewsList.all;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.cell,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    holder.titre.setText(list.get(position).title);
    holder.url=list.get(position).htmlContent;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titre;
        String url;
        public ViewHolder(final View itemView) {
            super(itemView);
            //binding the widgets
            titre=itemView.findViewById(R.id.Title);
           //making everything clickable
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(itemView.getContext(),WebActivity.class);
                    intent.putExtra("link",url);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
