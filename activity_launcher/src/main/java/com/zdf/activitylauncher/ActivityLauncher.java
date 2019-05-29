package com.zdf.activitylauncher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

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

    public static ActivityLauncher init(Fragment fragment) {
        return init((FragmentActivity) fragment.getActivity());
    }
    public static ActivityLauncher init(android.app.Fragment fragment) {
        return init((Activity) fragment.getActivity());
    }
    public static ActivityLauncher init(androidx.fragment.app.Fragment fragment) {
        return init((androidx.fragment.app.FragmentActivity)fragment.getActivity());
    }

    public static ActivityLauncher init(FragmentActivity activity) {
        return new ActivityLauncher(activity);
    }

    public static ActivityLauncher init(androidx.fragment.app.FragmentActivity activity) {
        return new ActivityLauncher(activity);
    }

    public static ActivityLauncher init(Activity activity) {
        return new ActivityLauncher(activity);
    }

    private ActivityLauncher(FragmentActivity activity) {
        mContext = activity;
        mRouterFragmentV4 = getRouterFragmentV4(activity);
        mFragmentRouter = mRouterFragmentV4;
    }

    private ActivityLauncher(androidx.fragment.app.FragmentActivity activity) {
        mContext = activity;
        mRouterFragmentX = getRouterFragmentX(activity);
        mFragmentRouter = mRouterFragmentX;
    }

    private ActivityLauncher(Activity activity) {
        mContext = activity;
        mRouterFragment = getRouterFragment(activity);
        mFragmentRouter = mRouterFragment;
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

    private RouterFragmentV4 getRouterFragmentV4(FragmentActivity activity) {
        RouterFragmentV4 routerFragment = findRouterFragmentV4(activity);
        if (routerFragment == null) {
            routerFragment = RouterFragmentV4.newInstance();
            FragmentManager fragmentManager = activity.getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .add(routerFragment, TAG)
                    .commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        return routerFragment;
    }

    private RouterFragmentV4 findRouterFragmentV4(FragmentActivity activity) {
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
