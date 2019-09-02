package me.lesonnnn.assignmentthree.screen.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import me.lesonnnn.assignmentthree.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
    }

    private void initView() {

        mBack = findViewById(R.id.iconBack);
        mBack.setOnClickListener(this);

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
