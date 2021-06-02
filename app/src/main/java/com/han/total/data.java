package com.han.total;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;


public class data {

    private final static String PREF_NAME = "pref_sharedpreferences_data";
    private static final String NEW_NOTIFY_YN_KEY = "new_notify_yn_key";
    private static final String NEW_NOTE_KEY = "new_note_key";

    private static SharedPreferences mSharedPreferences;
    private static SharedPreferences.Editor mEditor;
    private static Context mContext;

    private static data mInstance;
    public synchronized static data getInstance(Context ctx) {
        mContext = ctx;
        if (mInstance == null) {
            mInstance = new data();
            mSharedPreferences = ctx.getSharedPreferences(PREF_NAME, Activity.MODE_PRIVATE);
            mEditor = mSharedPreferences.edit();
        }
        return mInstance;
    }

    //
//    /*------ this is for new notify  --------*/
//    public void setNewNotify(String flag){
//        mEditor.putString(NEW_NOTIFY_YN_KEY, flag);
//        mEditor.commit();
//    }
//
//    public String getNewNotify(){
//        return mSharedPreferences.getString(NEW_NOTIFY_YN_KEY, "N");
//    }
//
    /*------ this is for new notify  --------*/
    public void setNote(String flag){
        mEditor.putString(NEW_NOTE_KEY, flag);
        mEditor.commit();
    }

    public String getNote() {
        return mSharedPreferences.getString(NEW_NOTE_KEY, "N");
    }


}
