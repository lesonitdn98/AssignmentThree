package me.lesonnnn.assignmentthree.screen.main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import me.lesonnnn.assignmentthree.R;
import me.lesonnnn.assignmentthree.model.User;
import me.lesonnnn.assignmentthree.screen.detail.DetailActivity;
import me.lesonnnn.assignmentthree.screen.main.adapter.MainAdapter;

public class MainActivity extends AppCompatActivity implements MainAdapter.onClickContentViewItem {
    private static final int REQUEST_CODE = 111;
    private List<User> userList;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @SuppressLint("NewApi")
    private void initView() {

        RecyclerView recyclerView = findViewById(R.id.content);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        userList = new ArrayList<>();

        mainAdapter = new MainAdapter(addProfile(userList), this);
        mainAdapter.setClickContentViewItem(this);
        recyclerView.setAdapter(mainAdapter);
    }

    private List<User> addProfile(List<User> users) {

        User.UserBuilder userBuilder = new User.UserBuilder();

        users.add(userBuilder.id(0)
                .image(R.drawable.gai00)
                .name("Nguoi Nao Do")
                .birthday("04/12/2000")
                .build());
        users.add(userBuilder.id(1)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("16/02/2000")
                .build());
        users.add(userBuilder.id(2)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("01/03/1998")
                .build());
        users.add(userBuilder.id(3)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("15/12/1998")
                .build());
        users.add(userBuilder.id(4)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/07/1999")
                .build());
        users.add(userBuilder.id(5)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("03/09/1998")
                .build());
        users.add(userBuilder.id(6)
                .image(R.drawable.gai05)
                .name("Nguoi Nao Do")
                .birthday("14/02/1999")
                .build());
        users.add(userBuilder.id(7)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("23/09/1997")
                .build());
        users.add(userBuilder.id(8)
                .image(R.drawable.gai07)
                .name("Nguoi Nao Do")
                .birthday("08/04/1998")
                .build());
        users.add(userBuilder.id(9)
                .image(R.drawable.gai08)
                .name("Nguoi Nao Do")
                .birthday("27/09/1998")
                .build());
        users.add(userBuilder.id(10)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("08/10/1998")
                .build());
        users.add(userBuilder.id(11)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("08/09/2000")
                .build());
        users.add(userBuilder.id(12)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(13)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/03/1998")
                .build());
        users.add(userBuilder.id(14)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("08/09/1997")
                .build());
        users.add(userBuilder.id(15)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(16)
                .image(R.drawable.gai00)
                .name("Nguoi Nao Do")
                .birthday("08/09/1997")
                .build());
        users.add(userBuilder.id(17)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("08/09/1999")
                .build());
        users.add(userBuilder.id(18)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(19)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("08/09/2000")
                .build());
        users.add(userBuilder.id(20)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(21)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("08/09/2000")
                .build());
        users.add(userBuilder.id(22)
                .image(R.drawable.gai05)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(23)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(24)
                .image(R.drawable.gai07)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(25)
                .image(R.drawable.gai08)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(26)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(27)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(28)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(29)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(30)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(31)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        return users;
    }

    @SuppressLint("NewApi")
    @Override
    public void onClick(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("Info", userList.get(position));
        intent.putExtra("Hang", bundle);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_CODE && resultCode==DetailActivity.RESULT_CODE){
            assert data != null;
            mainAdapter.notifyItemChanged(data.getIntExtra("item", 0));
        }
    }
}
