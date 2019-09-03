package me.lesonnnn.assignmentthree.screen.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import me.lesonnnn.assignmentthree.R;
import me.lesonnnn.assignmentthree.model.User;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mBack;
    private ImageView mImageView;
    private TextView mName, mBirthday;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
    }

    private void initView() {

        mBack = findViewById(R.id.iconBack);
        mBack.setOnClickListener(this);
        mImageView = findViewById(R.id.imageDetail);
        mName = findViewById(R.id.myName);
        mBirthday = findViewById(R.id.myBirthday);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Hang");
        User user = bundle.getParcelable("Info");

        if (user != null){
            mImageView.setImageResource(user.getImage());
            mName.setText(user.getName());
            mBirthday.setText(user.getBirthday());
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iconBack:
                onBackPressed();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
