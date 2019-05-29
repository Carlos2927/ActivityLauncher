package com.zdf.activitylauncher;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;


/**
 * Activity跳转封装类，把OnActivityResult方式改为Callback方式
 *
 * Created by XiaoFeng on 2018/9/5.
 */
public class ActivityLauncher {

    private static final String TAG = "ActivityLauncher";
    private Context mContext;
    /** V4兼容包下的Fragment */
    private RouterFragmentV4 mRouterFragmentV4;
    /** androidX兼容包下的Fragment */
    private RouterFragmentX mRouterFragmentX;
    /** 标准SDK下的Fragment */
    private RouterFragment mRouterFragment;
    private AbstractFragmentRouter mFragmentRouter;
    private static Class<? extends Activity> cls_support_fragment_activity = null;
    private static Class<? extends Activity> cls_x_fragment_activity = null;
    static {
        try {
            cls_x_fragment_activity = (Class<? extends Activity>) Class.forName("androidx.fragment.app.FragmentActivity");
        }catch (Exception e){

        }
        try {
            cls_support_fragment_activity = (Class<? extends Activity>) Class.forName("android.support.v4.app.FragmentActivity");
        }catch (Exception e){

        }
    }

    public static ActivityLauncher initFromFragment(Fragment fragment) {
        return init(fragment.getActivity());
    }
    public static ActivityLauncher initFromFragmentSupport(android.support.v4.app.Fragment fragment) {
        return init(fragment.getActivity());
    }
    public static ActivityLauncher initFromFragmentX(androidx.fragment.app.Fragment fragment) {
        return init(fragment.getActivity());
    }



    public static ActivityLauncher init(Activity activity) {
        return new ActivityLauncher(activity);
    }

    private ActivityLauncher(Activity activity) {
        mContext = activity;
        if(cls_x_fragment_activity != null && cls_x_fragment_activity.isInstance(activity)){
            mRouterFragmentX = getRouterFragmentX((androidx.fragment.app.FragmentActivity) activity);
            mFragmentRouter = mRouterFragmentX;
        }else if(cls_support_fragment_activity != null && cls_support_fragment_activity.isInstance(activity) ){
            mRouterFragmentV4 = getRouterFragmentV4((android.support.v4.app.FragmentActivity) activity);
            mFragmentRouter = mRouterFragmentV4;
        }else {
            mRouterFragment = getRouterFragment(activity);
            mFragmentRouter = mRouterFragment;
        }

    }

    private RouterFragmentX getRouterFragmentX(androidx.fragment.app.FragmentActivity activity) {
        RouterFragmentX routerFragment = findRouterFragmentX(activity);
        if (routerFragment == null) {
            routerFragment = RouterFragmentX.newInstance();
            androidx.fragment.app.FragmentManager fragmentManager = activity.getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(routerFragment, TAG)
                    .commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        return routerFragment;
    }

    private RouterFragmentV4 getRouterFragmentV4(android.support.v4.app.FragmentActivity activity) {
        RouterFragmentV4 routerFragment = findRouterFragmentV4(activity);
        if (routerFragment == null) {
            routerFragment = RouterFragmentV4.newInstance();
            android.support.v4.app.FragmentManager fragmentManager = activity.getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(routerFragment, TAG)
                    .commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        return routerFragment;
    }

    private RouterFragmentV4 findRouterFragmentV4(android.support.v4.app.FragmentActivity activity) {
        return (RouterFragmentV4) activity.getSupportFragmentManager().findFragmentByTag(TAG);
    }

    private RouterFragmentX findRouterFragmentX(androidx.fragment.app.FragmentActivity activity) {
        return (RouterFragmentX) activity.getSupportFragmentManager().findFragmentByTag(TAG);
    }

    private RouterFragment getRouterFragment(Activity activity) {
        RouterFragment routerFragment = findRouterFragment(activity);
        if (routerFragment == null) {
            routerFragment = RouterFragment.newInstance();
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(routerFragment, TAG)
                    .commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        return routerFragment;
    }

    private RouterFragment findRouterFragment(Activity activity) {
        return (RouterFragment) activity.getFragmentManager().findFragmentByTag(TAG);
    }

    public void startActivityForResult(Class<?> clazz, Callback callback) {
        Intent intent = new Intent(mContext, clazz);
        startActivityForResult(intent, callback);
    }

    public void startActivityForResult(Intent intent, Callback callback) {
        if (mFragmentRouter != null) {
            mFragmentRouter.startActivityForResult(intent, callback);
        } else {
            throw new RuntimeException("please do init first!");
        }
    }

    public interface Callback {
        void onActivityResult(int resultCode, Intent data);
    }
}
