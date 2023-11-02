package p229m7;

import android.os.Handler;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p259o6.InterfaceC11045v;

/* renamed from: m7.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10341s {

    /* renamed from: m7.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10342a extends C10332q {
        public C10342a(Object obj) {
            super(obj);
        }

        /* renamed from: c */
        public C10342a m11723c(Object obj) {
            return new C10342a(super.m11752a(obj));
        }

        public C10342a(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public C10342a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C10342a(C10332q c10332q) {
            super(c10332q);
        }
    }

    /* renamed from: m7.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10343b {
        /* renamed from: a */
        void mo11722a(InterfaceC10341s interfaceC10341s, Timeline timeline);
    }

    /* renamed from: a */
    void mo11736a(InterfaceC10343b interfaceC10343b);

    /* renamed from: b */
    void mo11735b(Handler handler, InterfaceC10353z interfaceC10353z);

    /* renamed from: c */
    void mo11734c(InterfaceC10343b interfaceC10343b);

    /* renamed from: d */
    void mo11733d(InterfaceC10353z interfaceC10353z);

    /* renamed from: e */
    MediaItem mo11732e();

    /* renamed from: g */
    InterfaceC10329p mo11731g(C10342a c10342a, InterfaceC7440b interfaceC7440b, long j);

    /* renamed from: i */
    void mo11730i(InterfaceC10343b interfaceC10343b, InterfaceC7472x interfaceC7472x);

    /* renamed from: l */
    void mo11729l(Handler handler, InterfaceC11045v interfaceC11045v);

    /* renamed from: m */
    void mo11728m();

    /* renamed from: n */
    boolean mo11727n();

    /* renamed from: p */
    Timeline mo11726p();

    /* renamed from: q */
    void mo11725q(InterfaceC10329p interfaceC10329p);

    /* renamed from: r */
    void mo11724r(InterfaceC10343b interfaceC10343b);
}
