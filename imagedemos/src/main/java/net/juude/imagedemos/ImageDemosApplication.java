package net.juude.imagedemos;

import android.app.Application;

import com.facebook.common.logging.FLog;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by sjd on 2016/11/30.
 */

public class ImageDemosApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("levsel: " + FLog.isLoggable(FLog.VERBOSE));
        Fresco.initialize(this);
    }
}
