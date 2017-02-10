package com.example.gembaf.sample3;

import io.realm.RealmObject;

/**
 * Created by gembaf on 2017/02/10.
 */

public class User extends RealmObject {
    private String          name;

    public String getName() { return name; }
    public void   setName(String name) { this.name = name; }
}
