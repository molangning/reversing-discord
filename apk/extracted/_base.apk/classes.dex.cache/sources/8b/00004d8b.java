package p353tb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p300qb.C11815b;
import p300qb.InterfaceC11819d;
import p300qb.InterfaceC11820e;
import p300qb.InterfaceC11821f;
import p321rb.InterfaceC12120a;
import p321rb.InterfaceC12121b;
import p353tb.C12635h;

/* renamed from: tb.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12635h {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC11819d<?>> f32738a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC11821f<?>> f32739b;

    /* renamed from: c */
    private final InterfaceC11819d<Object> f32740c;

    /* renamed from: tb.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12636a implements InterfaceC12121b<C12636a> {

        /* renamed from: d */
        private static final InterfaceC11819d<Object> f32741d = new InterfaceC11819d() { // from class: tb.g
            @Override // p300qb.InterfaceC11819d
            /* renamed from: a */
            public final void mo3313a(Object obj, Object obj2) {
                C12635h.C12636a.m4666e(obj, (InterfaceC11820e) obj2);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, InterfaceC11819d<?>> f32742a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC11821f<?>> f32743b = new HashMap();

        /* renamed from: c */
        private InterfaceC11819d<Object> f32744c = f32741d;

        /* renamed from: e */
        public static /* synthetic */ void m4666e(Object obj, InterfaceC11820e interfaceC11820e) {
            throw new C11815b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C12635h m4668c() {
            return new C12635h(new HashMap(this.f32742a), new HashMap(this.f32743b), this.f32744c);
        }

        /* renamed from: d */
        public C12636a m4667d(InterfaceC12120a interfaceC12120a) {
            interfaceC12120a.mo3320a(this);
            return this;
        }

        @Override // p321rb.InterfaceC12121b
        /* renamed from: f */
        public <U> C12636a mo4670a(Class<U> cls, InterfaceC11819d<? super U> interfaceC11819d) {
            this.f32742a.put(cls, interfaceC11819d);
            this.f32743b.remove(cls);
            return this;
        }
    }

    C12635h(Map<Class<?>, InterfaceC11819d<?>> map, Map<Class<?>, InterfaceC11821f<?>> map2, InterfaceC11819d<Object> interfaceC11819d) {
        this.f32738a = map;
        this.f32739b = map2;
        this.f32740c = interfaceC11819d;
    }

    /* renamed from: a */
    public static C12636a m4673a() {
        return new C12636a();
    }

    /* renamed from: b */
    public void m4672b(Object obj, OutputStream outputStream) {
        new C12632f(outputStream, this.f32738a, this.f32739b, this.f32740c).m4679q(obj);
    }

    /* renamed from: c */
    public byte[] m4671c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m4672b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}