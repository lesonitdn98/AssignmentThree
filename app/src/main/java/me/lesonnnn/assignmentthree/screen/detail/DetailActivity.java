package me.lesonnnn.assignmentthree.screen.detail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import me.lesonnnn.assignmentthree.R;
import me.lesonnnn.assignmentthree.model.User;

public class DetailActivity extends AppCompatActivity
        implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {

    public static final int RESULT_CODE = 123;
    private SharedPreferences.Editor mEditor;
    private User mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
    }

    @SuppressLint("CommitPrefEdits")
    private void initView() {

        ImageView back = findViewById(R.id.iconBack);
        back.setOnClickListener(this);
        ImageView imageView = findViewById(R.id.imageDetail);
        TextView name = findViewById(R.id.myName);
        TextView birthday = findViewById(R.id.myBirthday);
        RatingBar ratingBar = findViewById(R.id.myRating);

        SharedPreferences preferences = getSharedPreferences("Rating", Context.MODE_PRIVATE);
        mEditor = preferences.edit();

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Hang");
        mUser = bundle.getParcelable("Info");

        if (mUser != null) {
            imageView.setImageResource(mUser.getImage());
            name.setText(mUser.getName());
            birthday.setText(mUser.getBirthday());
            float rating = preferences.getFloat(mUser.getId() + "", 0);
            ratingBar.setRating(rating);
        }

        ratingBar.setOnRatingBarChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.iconBack) {
            onBackPressed();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
        Toast.makeText(this, "You rating " + v + " star", Toast.LENGTH_SHORT).show();
        mEditor.putFloat(mUser.getId() + "", v);
        mEditor.apply();
        Intent intent = new Intent();
        intent.putExtra("item", mUser.getId());
        setResult(RESULT_CODE, intent);
    }
}
