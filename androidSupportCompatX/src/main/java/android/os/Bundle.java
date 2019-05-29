//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.os;

import android.os.Parcelable.Creator;
//import android.util.Size;
//import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.RecentlyNullable;
import java.io.Serializable;
import java.util.ArrayList;

public final class Bundle extends BaseBundle implements Cloneable, Parcelable {
    public static final Creator<Bundle> CREATOR = null;
    public static final Bundle EMPTY = null;

    public Bundle() {
        throw new RuntimeException("Stub!");
    }

    public Bundle(ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }

    public Bundle(int capacity) {
        throw new RuntimeException("Stub!");
    }

    public Bundle(Bundle b) {
        throw new RuntimeException("Stub!");
    }

//    public Bundle(PersistableBundle b) {
//        throw new RuntimeException("Stub!");
//    }

    public void setClassLoader(ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }

    public ClassLoader getClassLoader() {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public Bundle deepCopy() {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
        throw new RuntimeException("Stub!");
    }

    public void remove(String key) {
        throw new RuntimeException("Stub!");
    }

    public void putAll(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasFileDescriptors() {
        throw new RuntimeException("Stub!");
    }

    public void putByte(@RecentlyNullable String key, byte value) {
        throw new RuntimeException("Stub!");
    }

    public void putChar(@RecentlyNullable String key, char value) {
        throw new RuntimeException("Stub!");
    }

    public void putShort(@RecentlyNullable String key, short value) {
        throw new RuntimeException("Stub!");
    }

    public void putFloat(@RecentlyNullable String key, float value) {
        throw new RuntimeException("Stub!");
    }

    public void putCharSequence(@RecentlyNullable String key, @RecentlyNullable CharSequence value) {
        throw new RuntimeException("Stub!");
    }

    public void putParcelable(@RecentlyNullable String key, @RecentlyNullable Parcelable value) {
        throw new RuntimeException("Stub!");
    }

//    public void putSize(@RecentlyNullable String key, @RecentlyNullable Size value) {
//        throw new RuntimeException("Stub!");
//    }
//
//    public void putSizeF(@RecentlyNullable String key, @RecentlyNullable SizeF value) {
//        throw new RuntimeException("Stub!");
//    }

    public void putParcelableArray(@RecentlyNullable String key, @RecentlyNullable Parcelable[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putParcelableArrayList(@RecentlyNullable String key, @RecentlyNullable ArrayList<? extends Parcelable> value) {
        throw new RuntimeException("Stub!");
    }

    public void putSparseParcelableArray(@RecentlyNullable String key, @RecentlyNullable SparseArray<? extends Parcelable> value) {
        throw new RuntimeException("Stub!");
    }

    public void putIntegerArrayList(@RecentlyNullable String key, @RecentlyNullable ArrayList<Integer> value) {
        throw new RuntimeException("Stub!");
    }

    public void putStringArrayList(@RecentlyNullable String key, @RecentlyNullable ArrayList<String> value) {
        throw new RuntimeException("Stub!");
    }

    public void putCharSequenceArrayList(@RecentlyNullable String key, @RecentlyNullable ArrayList<CharSequence> value) {
        throw new RuntimeException("Stub!");
    }

    public void putSerializable(@RecentlyNullable String key, @RecentlyNullable Serializable value) {
        throw new RuntimeException("Stub!");
    }

    public void putByteArray(@RecentlyNullable String key, @RecentlyNullable byte[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putShortArray(@RecentlyNullable String key, @RecentlyNullable short[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putCharArray(@RecentlyNullable String key, @RecentlyNullable char[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putFloatArray(@RecentlyNullable String key, @RecentlyNullable float[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putCharSequenceArray(@RecentlyNullable String key, @RecentlyNullable CharSequence[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putBundle(@RecentlyNullable String key, @RecentlyNullable Bundle value) {
        throw new RuntimeException("Stub!");
    }

//    public void putBinder(@RecentlyNullable String key, @RecentlyNullable IBinder value) {
//        throw new RuntimeException("Stub!");
//    }

    public byte getByte(String key) {
        throw new RuntimeException("Stub!");
    }

    public Byte getByte(String key, byte defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public char getChar(String key) {
        throw new RuntimeException("Stub!");
    }

    public char getChar(String key, char defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public short getShort(String key) {
        throw new RuntimeException("Stub!");
    }

    public short getShort(String key, short defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public float getFloat(String key) {
        throw new RuntimeException("Stub!");
    }

    public float getFloat(String key, float defaultValue) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public CharSequence getCharSequence(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getCharSequence(@RecentlyNullable String key, CharSequence defaultValue) {
        throw new RuntimeException("Stub!");
    }

//    @RecentlyNullable
//    public Size getSize(@RecentlyNullable String key) {
//        throw new RuntimeException("Stub!");
//    }
//
//    @RecentlyNullable
//    public SizeF getSizeF(@RecentlyNullable String key) {
//        throw new RuntimeException("Stub!");
//    }

    @RecentlyNullable
    public Bundle getBundle(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public <T extends Parcelable> T getParcelable(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public Parcelable[] getParcelableArray(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public Serializable getSerializable(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public ArrayList<Integer> getIntegerArrayList(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public ArrayList<String> getStringArrayList(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public ArrayList<CharSequence> getCharSequenceArrayList(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public byte[] getByteArray(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public short[] getShortArray(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public char[] getCharArray(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public float[] getFloatArray(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

    @RecentlyNullable
    public CharSequence[] getCharSequenceArray(@RecentlyNullable String key) {
        throw new RuntimeException("Stub!");
    }

//    @RecentlyNullable
//    public IBinder getBinder(@RecentlyNullable String key) {
//        throw new RuntimeException("Stub!");
//    }

    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    public void writeToParcel(Parcel parcel, int flags) {
        throw new RuntimeException("Stub!");
    }

    public void readFromParcel(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public synchronized String toString() {
        throw new RuntimeException("Stub!");
    }
}
