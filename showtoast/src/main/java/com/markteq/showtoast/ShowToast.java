package com.markteq.showtoast;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {

    public static void Utils(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
