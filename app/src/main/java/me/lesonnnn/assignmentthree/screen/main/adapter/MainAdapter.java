package me.lesonnnn.assignmentthree.screen.main.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import com.bumptech.glide.Glide;
import java.util.List;
import me.lesonnnn.assignmentthree.R;
import me.lesonnnn.assignmentthree.model.User;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<User> mUserArrayList;
    private Context mContext;
    public static onClickContentViewItem mClickContentViewItem;

    public MainAdapter(List<User> userArrayList, Context context) {
        mUserArrayList = userArrayList;
        mContext = context;
    }

    public void setClickContentViewItem(onClickContentViewItem clickContentViewItem) {
        mClickContentViewItem = clickContentViewItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        SharedPreferences preferences = mContext.getSharedPreferences("Rating", Context.MODE_PRIVATE);

        User user = mUserArrayList.get(i);
        Glide.with(mContext).load(user.getImage()).into(viewHolder.mView);
        viewHolder.mRatingBar.setRating(preferences.getFloat( i + "", 0));
        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickContentViewItem.onClick(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mUserArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mView;
        private RatingBar mRatingBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mView = itemView.findViewById(R.id.image);
            mRatingBar = itemView.findViewById(R.id.myRatingg);
        }
    }

    public interface onClickContentViewItem {
        void onClick(int position);
    }
}
