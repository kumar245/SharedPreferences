package com.kumar.user.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by User on 5/19/2017.
 */

public class sharedPreference  {
    SharedPreferences sharpreference;

    public sharedPreference(Context context) {
        sharpreference=context.getSharedPreferences("My Refs",Context.MODE_PRIVATE);
    }
    public void saveData(String Username,String Password){
        SharedPreferences.Editor editor=sharpreference.edit();
        editor.putString("UserName",Username);
        editor.putString("Password",Password);
        editor.commit();
    }
    public String LoadData(){
        String FileContent="UserName : " + sharpreference.getString("UserName","No UserName");
        FileContent+=" Password :"+ sharpreference.getString("Password","No Password");
        return FileContent;
    }
}
