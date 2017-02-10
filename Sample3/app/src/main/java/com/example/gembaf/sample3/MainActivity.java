package com.example.gembaf.sample3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmQuery;

public class MainActivity extends AppCompatActivity {
    Realm realm;
    TextView userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userList = (TextView) findViewById(R.id.userList);
        Realm.setDefaultConfiguration(new RealmConfiguration.Builder(this).build());
        realm = Realm.getDefaultInstance();
        setUserList();
    }

    public void addUser(View view) {
        realm.beginTransaction();
        User user = realm.createObject(User.class);
        user.setName("gembaf");
        realm.commitTransaction();
        setUserList();
    }

    public void deleteUser(View view) {
        realm.beginTransaction();
        RealmQuery<User> query = realm.where(User.class);
        query.findAll().removeLast();
        realm.commitTransaction();
        setUserList();
    }

    private void setUserList() {
        String list = "";
        RealmQuery<User> query = realm.where(User.class);

        for (User user : query.findAll()) {
            list += user.getName() + '\n';
        }
        userList.setText(list);
    }
}
