package bd.scanner.com.adplayad;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by toukir on 8/5/17.
 */

public class AdPlayAd {

    public static final String TAG = "adplayad";

    public static void bannerAd(){
        Log.d(TAG,"This is a banner ad");
    }

    public static void bannerAd(Context context){
        Toast.makeText(context,"Banner ad",Toast.LENGTH_LONG).show();
        Log.d(TAG,"This is a banner ad");
    }
}
