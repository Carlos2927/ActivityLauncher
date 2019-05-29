package androidx.fragment.app;

public abstract class FragmentManager {
    public abstract FragmentTransaction beginTransaction();
    public abstract boolean executePendingTransactions();
    public abstract Fragment findFragmentByTag(String tag);
}
