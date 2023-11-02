package p259o6;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import p259o6.InterfaceC11035n;
import p259o6.InterfaceC11045v;

/* renamed from: o6.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC11049x {

    /* renamed from: a */
    public static final InterfaceC11049x f28914a;
    @Deprecated

    /* renamed from: b */
    public static final InterfaceC11049x f28915b;

    /* renamed from: o6.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C11050a implements InterfaceC11049x {
        C11050a() {
        }

        @Override // p259o6.InterfaceC11049x
        /* renamed from: a */
        public InterfaceC11035n mo9267a(Looper looper, InterfaceC11045v.C11046a c11046a, Format format) {
            if (format.f11200x == null) {
                return null;
            }
            return new C10989a0(new InterfaceC11035n.C11036a(new C11032l0(1)));
        }

        @Override // p259o6.InterfaceC11049x
        /* renamed from: b */
        public Class<C11034m0> mo9266b(Format format) {
            if (format.f11200x != null) {
                return C11034m0.class;
            }
            return null;
        }

        @Override // p259o6.InterfaceC11049x
        /* renamed from: c */
        public /* synthetic */ void mo9265c() {
            C11048w.m9269a(this);
        }

        @Override // p259o6.InterfaceC11049x
        public /* synthetic */ void release() {
            C11048w.m9268b(this);
        }
    }

    static {
        C11050a c11050a = new C11050a();
        f28914a = c11050a;
        f28915b = c11050a;
    }

    /* renamed from: a */
    InterfaceC11035n mo9267a(Looper looper, InterfaceC11045v.C11046a c11046a, Format format);

    /* renamed from: b */
    Class<? extends InterfaceC10991b0> mo9266b(Format format);

    /* renamed from: c */
    void mo9265c();

    void release();
}