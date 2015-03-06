package in.srain.cube;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;

public class Cube {

    private static Cube instance;

    private Application mApplication;

    public static void onCreate(Application app) {
        instance = new Cube(app);
    }

    private Cube(Application application) {
        mApplication = application;
    }

    public static Cube getInstance() {
        return instance;
    }

    public Context getContext() {
        return mApplication;
    }

    public String getAndroidId() {
        String id = Settings.Secure.getString(mApplication.getContentResolver(), Settings.Secure.ANDROID_ID);
        return id;
    }
}
