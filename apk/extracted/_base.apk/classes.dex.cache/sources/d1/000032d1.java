package p099f8;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import java.util.List;
import p153i8.InterfaceC7444e;
import p229m7.C10344s0;
import p229m7.InterfaceC10341s;
import p260o7.AbstractC11058e;
import p260o7.AbstractC11069m;
import p260o7.InterfaceC11070n;

/* renamed from: f8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC6337h extends InterfaceC6343k {

    /* renamed from: f8.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6338a {

        /* renamed from: a */
        public final C10344s0 f17958a;

        /* renamed from: b */
        public final int[] f17959b;

        /* renamed from: c */
        public final int f17960c;

        /* renamed from: d */
        public final Object f17961d;

        public C6338a(C10344s0 c10344s0, int... iArr) {
            this(c10344s0, iArr, 0, null);
        }

        public C6338a(C10344s0 c10344s0, int[] iArr, int i, Object obj) {
            this.f17958a = c10344s0;
            this.f17959b = iArr;
            this.f17960c = i;
            this.f17961d = obj;
        }
    }

    /* renamed from: f8.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC6339b {
        /* renamed from: a */
        InterfaceC6337h[] mo22903a(C6338a[] c6338aArr, InterfaceC7444e interfaceC7444e, InterfaceC10341s.C10342a c10342a, Timeline timeline);
    }

    /* renamed from: a */
    int mo6283a();

    /* renamed from: b */
    boolean mo22912b(int i, long j);

    void disable();

    /* renamed from: e */
    void mo22911e(float f);

    void enable();

    /* renamed from: f */
    Object mo6282f();

    /* renamed from: g */
    void mo22910g();

    /* renamed from: j */
    boolean mo22909j(long j, AbstractC11058e abstractC11058e, List<? extends AbstractC11069m> list);

    /* renamed from: k */
    void mo22908k(boolean z);

    /* renamed from: l */
    void mo6281l(long j, long j2, long j3, List<? extends AbstractC11069m> list, InterfaceC11070n[] interfaceC11070nArr);

    /* renamed from: m */
    int mo22907m(long j, List<? extends AbstractC11069m> list);

    /* renamed from: o */
    int mo22906o();

    /* renamed from: p */
    Format mo22905p();

    /* renamed from: q */
    int mo6280q();

    /* renamed from: r */
    void mo22904r();
}