package com.zdf.activitylauncher;

import android.content.Intent;

public interface AbstractFragment {
    void startActivityForResult(Intent intent, ActivityLauncher.Callback callback);
    void onActivityResult(int requestCode, int resultCode, Intent data);
}
