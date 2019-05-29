package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class Fragment {
    public FragmentActivity getActivity(){
        return null;
    }
    public boolean isRemoving(){
        return false;
    }

    public boolean isDetached(){
        return false;
    }

    public Context getContext(){
        return null;
    }

    public void onCreate(Bundle savedInstanceState){}
    public void setRetainInstance(boolean retain){}

    public void startActivityForResult(Intent intent, int requestCode) {

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }
}
