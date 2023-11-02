package p314r4;

import com.facebook.cache.disk.DiskCacheConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p312r2.C12037d;
import p312r2.InterfaceC12034c;
import p312r2.InterfaceC12045h;

/* renamed from: r4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12050b implements InterfaceC12054f {

    /* renamed from: a */
    private InterfaceC12051c f31137a;

    public C12050b(InterfaceC12051c interfaceC12051c) {
        this.f31137a = interfaceC12051c;
    }

    /* renamed from: b */
    public static C12037d m6462b(DiskCacheConfig diskCacheConfig, InterfaceC12034c interfaceC12034c) {
        return m6461c(diskCacheConfig, interfaceC12034c, Executors.newSingleThreadExecutor());
    }

    /* renamed from: c */
    public static C12037d m6461c(DiskCacheConfig diskCacheConfig, InterfaceC12034c interfaceC12034c, Executor executor) {
        return new C12037d(interfaceC12034c, diskCacheConfig.m31755h(), new C12037d.C12040c(diskCacheConfig.m31752k(), diskCacheConfig.m31753j(), diskCacheConfig.m31757f()), diskCacheConfig.m31758e(), diskCacheConfig.m31759d(), diskCacheConfig.m31756g(), executor, diskCacheConfig.m31754i());
    }

    @Override // p314r4.InterfaceC12054f
    /* renamed from: a */
    public InterfaceC12045h mo6452a(DiskCacheConfig diskCacheConfig) {
        return m6462b(diskCacheConfig, this.f31137a.mo6460a(diskCacheConfig));
    }
}