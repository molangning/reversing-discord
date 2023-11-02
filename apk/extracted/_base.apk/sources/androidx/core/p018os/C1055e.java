package androidx.core.p018os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m14357d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroid/os/Bundle;", "a", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: androidx.core.os.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1055e {
    /* renamed from: a */
    public static final Bundle m37978a(Pair<String, ? extends Object>... pairs) {
        C9612q.m13917h(pairs, "pairs");
        Bundle bundle = new Bundle(pairs.length);
        for (Pair<String, ? extends Object> pair : pairs) {
            String m14351a = pair.m14351a();
            Object m14350b = pair.m14350b();
            if (m14350b == null) {
                bundle.putString(m14351a, null);
            } else if (m14350b instanceof Boolean) {
                bundle.putBoolean(m14351a, ((Boolean) m14350b).booleanValue());
            } else if (m14350b instanceof Byte) {
                bundle.putByte(m14351a, ((Number) m14350b).byteValue());
            } else if (m14350b instanceof Character) {
                bundle.putChar(m14351a, ((Character) m14350b).charValue());
            } else if (m14350b instanceof Double) {
                bundle.putDouble(m14351a, ((Number) m14350b).doubleValue());
            } else if (m14350b instanceof Float) {
                bundle.putFloat(m14351a, ((Number) m14350b).floatValue());
            } else if (m14350b instanceof Integer) {
                bundle.putInt(m14351a, ((Number) m14350b).intValue());
            } else if (m14350b instanceof Long) {
                bundle.putLong(m14351a, ((Number) m14350b).longValue());
            } else if (m14350b instanceof Short) {
                bundle.putShort(m14351a, ((Number) m14350b).shortValue());
            } else if (m14350b instanceof Bundle) {
                bundle.putBundle(m14351a, (Bundle) m14350b);
            } else if (m14350b instanceof CharSequence) {
                bundle.putCharSequence(m14351a, (CharSequence) m14350b);
            } else if (m14350b instanceof Parcelable) {
                bundle.putParcelable(m14351a, (Parcelable) m14350b);
            } else if (m14350b instanceof boolean[]) {
                bundle.putBooleanArray(m14351a, (boolean[]) m14350b);
            } else if (m14350b instanceof byte[]) {
                bundle.putByteArray(m14351a, (byte[]) m14350b);
            } else if (m14350b instanceof char[]) {
                bundle.putCharArray(m14351a, (char[]) m14350b);
            } else if (m14350b instanceof double[]) {
                bundle.putDoubleArray(m14351a, (double[]) m14350b);
            } else if (m14350b instanceof float[]) {
                bundle.putFloatArray(m14351a, (float[]) m14350b);
            } else if (m14350b instanceof int[]) {
                bundle.putIntArray(m14351a, (int[]) m14350b);
            } else if (m14350b instanceof long[]) {
                bundle.putLongArray(m14351a, (long[]) m14350b);
            } else if (m14350b instanceof short[]) {
                bundle.putShortArray(m14351a, (short[]) m14350b);
            } else if (m14350b instanceof Object[]) {
                Class<?> componentType = m14350b.getClass().getComponentType();
                C9612q.m13920e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C9612q.m13919f(m14350b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(m14351a, (Parcelable[]) m14350b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C9612q.m13919f(m14350b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(m14351a, (String[]) m14350b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C9612q.m13919f(m14350b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(m14351a, (CharSequence[]) m14350b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(m14351a, (Serializable) m14350b);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + m14351a + '\"');
                }
            } else if (m14350b instanceof Serializable) {
                bundle.putSerializable(m14351a, (Serializable) m14350b);
            } else if (m14350b instanceof IBinder) {
                C1051b.m37986a(bundle, m14351a, (IBinder) m14350b);
            } else if (m14350b instanceof Size) {
                C1052c.m37985a(bundle, m14351a, (Size) m14350b);
            } else if (m14350b instanceof SizeF) {
                C1052c.m37984b(bundle, m14351a, (SizeF) m14350b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + m14350b.getClass().getCanonicalName() + " for key \"" + m14351a + '\"');
            }
        }
        return bundle;
    }
}
