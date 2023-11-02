package dj;

import bj.AbstractC2345i;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Ldj/c0;", "", "", "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "c", "", "index", "g", "key", "f", "d", "b", "", "a", "toString", "", "[Ljava/lang/Object;", "currentObjectPath", "", "[I", "indicies", "I", "currentDepth", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5978c0 {

    /* renamed from: a */
    private Object[] f17015a = new Object[8];

    /* renamed from: b */
    private int[] f17016b;

    /* renamed from: c */
    private int f17017c;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Ldj/c0$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: dj.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5979a {

        /* renamed from: a */
        public static final C5979a f17018a = new C5979a();

        private C5979a() {
        }
    }

    public C5978c0() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f17016b = iArr;
        this.f17017c = -1;
    }

    /* renamed from: e */
    private final void m23969e() {
        int i = this.f17017c * 2;
        Object[] copyOf = Arrays.copyOf(this.f17015a, i);
        C9612q.m13918g(copyOf, "copyOf(this, newSize)");
        this.f17015a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f17016b, i);
        C9612q.m13918g(copyOf2, "copyOf(this, newSize)");
        this.f17016b = copyOf2;
    }

    /* renamed from: a */
    public final String m23973a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i = this.f17017c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f17015a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (C9612q.m13922c(serialDescriptor.mo12684g(), AbstractC2345i.C2347b.f6456a)) {
                    if (this.f17016b[i2] != -1) {
                        sb2.append("[");
                        sb2.append(this.f17016b[i2]);
                        sb2.append("]");
                    }
                } else {
                    int i3 = this.f17016b[i2];
                    if (i3 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.mo12686e(i3));
                    }
                }
            } else if (obj != C5979a.f17018a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: b */
    public final void m23972b() {
        int i = this.f17017c;
        int[] iArr = this.f17016b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.f17017c = i - 1;
        }
        int i2 = this.f17017c;
        if (i2 != -1) {
            this.f17017c = i2 - 1;
        }
    }

    /* renamed from: c */
    public final void m23971c(SerialDescriptor sd2) {
        C9612q.m13917h(sd2, "sd");
        int i = this.f17017c + 1;
        this.f17017c = i;
        if (i == this.f17015a.length) {
            m23969e();
        }
        this.f17015a[i] = sd2;
    }

    /* renamed from: d */
    public final void m23970d() {
        int[] iArr = this.f17016b;
        int i = this.f17017c;
        if (iArr[i] == -2) {
            this.f17015a[i] = C5979a.f17018a;
        }
    }

    /* renamed from: f */
    public final void m23968f(Object obj) {
        int[] iArr = this.f17016b;
        int i = this.f17017c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.f17017c = i2;
            if (i2 == this.f17015a.length) {
                m23969e();
            }
        }
        Object[] objArr = this.f17015a;
        int i3 = this.f17017c;
        objArr[i3] = obj;
        this.f17016b[i3] = -2;
    }

    /* renamed from: g */
    public final void m23967g(int i) {
        this.f17016b[this.f17017c] = i;
    }

    public String toString() {
        return m23973a();
    }
}