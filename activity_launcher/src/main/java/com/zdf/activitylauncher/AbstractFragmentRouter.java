package com.zdf.activitylauncher;

import android.content.Intent;

public interface AbstractFragmentRouter {
    void startActivityForResult(Intent intent, ActivityLauncher.Callback callback);
}
