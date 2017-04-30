package com.udacity.gradle.builditbigger;

import android.net.ConnectivityManager;
import android.content.Context;
import android.net.NetworkInfo;

/**
 * Created by abspk on 27/04/2017.
 */

public class CheckInternet {
    private Context context;

    public static boolean isInetAvail(Context c) {

        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }
}
