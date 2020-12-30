package com.esime.pokedex.common;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceManger {
    private static final String APP_SETTING_FILE = "APP_SETTING";

    SharedPreferenceManger(){

    }

    private static SharedPreferences getSharedPreference(){
        return MyApp.getContext().
                getSharedPreferences(APP_SETTING_FILE, Context.MODE_PRIVATE);
    }

    public static void setSomeStringValue (String dataLabel, String dataValue){
        SharedPreferences.Editor editor = getSharedPreference().edit();
        editor.putString(dataLabel,dataValue);
        editor.commit();
    }
    public static void setSomeBooleanValue(String dataLabel, Boolean dataValue){
        SharedPreferences.Editor editor = getSharedPreference().edit();
        editor.putBoolean(dataLabel,dataValue);
        editor.commit();
    }

    public static  String getSomeStringValue (String dataLabel){
        return getSharedPreference().getString(dataLabel,null);
    }

    public static  Boolean getSomeBooleanValue (String dataLabel){
        return getSharedPreference().getBoolean(dataLabel,false);
    }

    public static void setSomeIntegerValue(String dataLabel, int dataValue){
        SharedPreferences.Editor editor = getSharedPreference().edit();
        editor.putInt(dataLabel,dataValue);
        editor.commit();
    }

    public static  int getSomeIntegerValue (String dataLabel){
        return getSharedPreference().getInt(dataLabel,0);
    }


}

