package p219lh;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import mh.AbstractC10456a;
import p304qf.AbstractC11883p;

/* renamed from: lh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10188a extends AbstractC10456a {

    /* renamed from: g */
    public static final C10189a f26495g = new C10189a(null);

    /* renamed from: h */
    public static final C10188a f26496h = new C10188a(1, 0, 7);

    /* renamed from: i */
    public static final C10188a f26497i = new C10188a(new int[0]);

    /* renamed from: lh.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10189a {
        private C10189a() {
        }

        public /* synthetic */ C10189a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10188a m12135a(InputStream stream) {
            int m14093t;
            int[] m14076B0;
            C9612q.m13917h(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            m14093t = C9546k.m14093t(intRange, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((AbstractC11883p) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            m14076B0 = C9553r.m14076B0(arrayList);
            return new C10188a(Arrays.copyOf(m14076B0, m14076B0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10188a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        C9612q.m13917h(numbers, "numbers");
    }

    /* renamed from: h */
    public boolean m12136h() {
        return m11502f(f26496h);
    }
}