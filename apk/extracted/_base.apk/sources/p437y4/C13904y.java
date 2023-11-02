package p437y4;

import com.facebook.imagepipeline.memory.AbstractC3730h;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.C3724d;
import com.facebook.imagepipeline.memory.C3726f;
import com.facebook.imagepipeline.memory.C3729g;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;
import p314r4.C12056h;
import p394w2.C13379j;
import p414x2.C13677a;
import p455z2.C14083k;
import p455z2.InterfaceC14072a;
import p455z2.InterfaceC14074c;
import p455z2.InterfaceC14080h;

/* renamed from: y4.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13904y {

    /* renamed from: a */
    private final C13901x f35769a;

    /* renamed from: b */
    private AbstractC3730h f35770b;

    /* renamed from: c */
    private InterfaceC13883h f35771c;

    /* renamed from: d */
    private AbstractC3730h f35772d;

    /* renamed from: e */
    private C3726f f35773e;

    /* renamed from: f */
    private AbstractC3730h f35774f;

    /* renamed from: g */
    private InterfaceC14080h f35775g;

    /* renamed from: h */
    private C14083k f35776h;

    /* renamed from: i */
    private InterfaceC14072a f35777i;

    public C13904y(C13901x c13901x) {
        this.f35769a = (C13901x) C13379j.m2677g(c13901x);
    }

    /* renamed from: a */
    private AbstractC3730h m1236a() {
        if (this.f35770b == null) {
            try {
                this.f35770b = (AbstractC3730h) AshmemMemoryChunkPool.class.getConstructor(InterfaceC14074c.class, C13905z.class, InterfaceC13875a0.class).newInstance(this.f35769a.m1256i(), this.f35769a.m1258g(), this.f35769a.m1257h());
            } catch (ClassNotFoundException unused) {
                this.f35770b = null;
            } catch (IllegalAccessException unused2) {
                this.f35770b = null;
            } catch (InstantiationException unused3) {
                this.f35770b = null;
            } catch (NoSuchMethodException unused4) {
                this.f35770b = null;
            } catch (InvocationTargetException unused5) {
                this.f35770b = null;
            }
        }
        return this.f35770b;
    }

    /* renamed from: f */
    private AbstractC3730h m1231f(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return m1236a();
                }
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            return m1234c();
        }
        return m1230g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public InterfaceC13883h m1235b() {
        char c;
        InterfaceC14074c interfaceC14074c;
        if (this.f35771c == null) {
            String m1260e = this.f35769a.m1260e();
            switch (m1260e.hashCode()) {
                case -1868884870:
                    if (m1260e.equals("legacy_default_params")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106578487:
                    if (m1260e.equals("legacy")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -404562712:
                    if (m1260e.equals("experimental")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -402149703:
                    if (m1260e.equals("dummy_with_tracking")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 95945896:
                    if (m1260e.equals("dummy")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            this.f35771c = new C3724d(this.f35769a.m1256i(), this.f35769a.m1262c(), this.f35769a.m1261d(), this.f35769a.m1253l());
                        } else {
                            this.f35771c = new C3724d(this.f35769a.m1256i(), C13888k.m1304a(), this.f35769a.m1261d(), this.f35769a.m1253l());
                        }
                    } else {
                        int m1263b = this.f35769a.m1263b();
                        int m1264a = this.f35769a.m1264a();
                        C13899v m1266h = C13899v.m1266h();
                        if (this.f35769a.m1252m()) {
                            interfaceC14074c = this.f35769a.m1256i();
                        } else {
                            interfaceC14074c = null;
                        }
                        this.f35771c = new C13894q(m1263b, m1264a, m1266h, interfaceC14074c);
                    }
                } else {
                    this.f35771c = new C13893p();
                }
            } else {
                this.f35771c = new C13892o();
            }
        }
        return this.f35771c;
    }

    /* renamed from: c */
    public AbstractC3730h m1234c() {
        if (this.f35772d == null) {
            try {
                this.f35772d = (AbstractC3730h) BufferMemoryChunkPool.class.getConstructor(InterfaceC14074c.class, C13905z.class, InterfaceC13875a0.class).newInstance(this.f35769a.m1256i(), this.f35769a.m1258g(), this.f35769a.m1257h());
            } catch (ClassNotFoundException unused) {
                this.f35772d = null;
            } catch (IllegalAccessException unused2) {
                this.f35772d = null;
            } catch (InstantiationException unused3) {
                this.f35772d = null;
            } catch (NoSuchMethodException unused4) {
                this.f35772d = null;
            } catch (InvocationTargetException unused5) {
                this.f35772d = null;
            }
        }
        return this.f35772d;
    }

    /* renamed from: d */
    public C3726f m1233d() {
        if (this.f35773e == null) {
            this.f35773e = new C3726f(this.f35769a.m1256i(), this.f35769a.m1259f());
        }
        return this.f35773e;
    }

    /* renamed from: e */
    public int m1232e() {
        return this.f35769a.m1259f().f35784g;
    }

    /* renamed from: g */
    public AbstractC3730h m1230g() {
        if (this.f35774f == null) {
            try {
                this.f35774f = (AbstractC3730h) NativeMemoryChunkPool.class.getConstructor(InterfaceC14074c.class, C13905z.class, InterfaceC13875a0.class).newInstance(this.f35769a.m1256i(), this.f35769a.m1258g(), this.f35769a.m1257h());
            } catch (ClassNotFoundException e) {
                C13677a.m1853k("PoolFactory", "", e);
                this.f35774f = null;
            } catch (IllegalAccessException e2) {
                C13677a.m1853k("PoolFactory", "", e2);
                this.f35774f = null;
            } catch (InstantiationException e3) {
                C13677a.m1853k("PoolFactory", "", e3);
                this.f35774f = null;
            } catch (NoSuchMethodException e4) {
                C13677a.m1853k("PoolFactory", "", e4);
                this.f35774f = null;
            } catch (InvocationTargetException e5) {
                C13677a.m1853k("PoolFactory", "", e5);
                this.f35774f = null;
            }
        }
        return this.f35774f;
    }

    /* renamed from: h */
    public InterfaceC14080h m1229h() {
        return m1228i(!C12056h.m6420a() ? 1 : 0);
    }

    /* renamed from: i */
    public InterfaceC14080h m1228i(int i) {
        if (this.f35775g == null) {
            AbstractC3730h m1231f = m1231f(i);
            C13379j.m2676h(m1231f, "failed to get pool for chunk type: " + i);
            this.f35775g = new C13898u(m1231f, m1227j());
        }
        return this.f35775g;
    }

    /* renamed from: j */
    public C14083k m1227j() {
        if (this.f35776h == null) {
            this.f35776h = new C14083k(m1226k());
        }
        return this.f35776h;
    }

    /* renamed from: k */
    public InterfaceC14072a m1226k() {
        if (this.f35777i == null) {
            this.f35777i = new C3729g(this.f35769a.m1256i(), this.f35769a.m1255j(), this.f35769a.m1254k());
        }
        return this.f35777i;
    }
}
