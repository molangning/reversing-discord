package p256o3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.image.ImageInfo;
import java.io.Closeable;
import p056d3.InterfaceC5739b;
import p114g4.C6544a;
import p114g4.InterfaceC6545b;
import p240n3.C10499i;
import p240n3.InterfaceC10498h;
import p394w2.C13379j;

/* renamed from: o3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10978a extends C6544a<ImageInfo> implements Closeable {

    /* renamed from: k */
    private final InterfaceC5739b f28768k;

    /* renamed from: l */
    private final C10499i f28769l;

    /* renamed from: m */
    private final InterfaceC10498h f28770m;

    /* renamed from: n */
    private final Supplier<Boolean> f28771n;

    /* renamed from: o */
    private final Supplier<Boolean> f28772o;

    /* renamed from: p */
    private Handler f28773p;

    /* renamed from: o3.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class HandlerC10979a extends Handler {

        /* renamed from: a */
        private final InterfaceC10498h f28774a;

        public HandlerC10979a(Looper looper, InterfaceC10498h interfaceC10498h) {
            super(looper);
            this.f28774a = interfaceC10498h;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C10499i c10499i = (C10499i) C13379j.m2677g(message.obj);
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    this.f28774a.mo11384b(c10499i, message.arg1);
                    return;
                }
                return;
            }
            this.f28774a.mo11385a(c10499i, message.arg1);
        }
    }

    public C10978a(InterfaceC5739b interfaceC5739b, C10499i c10499i, InterfaceC10498h interfaceC10498h, Supplier<Boolean> supplier, Supplier<Boolean> supplier2) {
        this.f28768k = interfaceC5739b;
        this.f28769l = c10499i;
        this.f28770m = interfaceC10498h;
        this.f28771n = supplier;
        this.f28772o = supplier2;
    }

    /* renamed from: H */
    private boolean m9426H() {
        boolean booleanValue = this.f28771n.get().booleanValue();
        if (booleanValue && this.f28773p == null) {
            m9419o();
        }
        return booleanValue;
    }

    /* renamed from: I */
    private void m9425I(C10499i c10499i, int i) {
        if (m9426H()) {
            Message obtainMessage = ((Handler) C13379j.m2677g(this.f28773p)).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i;
            obtainMessage.obj = c10499i;
            this.f28773p.sendMessage(obtainMessage);
            return;
        }
        this.f28770m.mo11385a(c10499i, i);
    }

    /* renamed from: Q */
    private void m9424Q(C10499i c10499i, int i) {
        if (m9426H()) {
            Message obtainMessage = ((Handler) C13379j.m2677g(this.f28773p)).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = i;
            obtainMessage.obj = c10499i;
            this.f28773p.sendMessage(obtainMessage);
            return;
        }
        this.f28770m.mo11384b(c10499i, i);
    }

    /* renamed from: o */
    private synchronized void m9419o() {
        if (this.f28773p != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
        handlerThread.start();
        this.f28773p = new HandlerC10979a((Looper) C13379j.m2677g(handlerThread.getLooper()), this.f28770m);
    }

    /* renamed from: q */
    private C10499i m9418q() {
        return this.f28772o.get().booleanValue() ? new C10499i() : this.f28769l;
    }

    /* renamed from: v */
    private void m9415v(C10499i c10499i, long j) {
        c10499i.m11383A(false);
        c10499i.m11362t(j);
        m9424Q(c10499i, 2);
    }

    /* renamed from: A */
    public void m9428A(C10499i c10499i, long j) {
        c10499i.m11383A(true);
        c10499i.m11356z(j);
        m9424Q(c10499i, 1);
    }

    /* renamed from: D */
    public void m9427D() {
        m9418q().m11380b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m9427D();
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: i */
    public void mo9422i(String str, Throwable th2, InterfaceC6545b.C6546a c6546a) {
        long now = this.f28768k.now();
        C10499i m9418q = m9418q();
        m9418q.m11369m(c6546a);
        m9418q.m11376f(now);
        m9418q.m11374h(str);
        m9418q.m11370l(th2);
        m9425I(m9418q, 5);
        m9415v(m9418q, now);
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: j */
    public void mo9421j(String str, Object obj, InterfaceC6545b.C6546a c6546a) {
        long now = this.f28768k.now();
        C10499i m9418q = m9418q();
        m9418q.m11379c();
        m9418q.m11371k(now);
        m9418q.m11374h(str);
        m9418q.m11378d(obj);
        m9418q.m11369m(c6546a);
        m9425I(m9418q, 0);
        m9428A(m9418q, now);
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: m */
    public void mo9420m(String str, InterfaceC6545b.C6546a c6546a) {
        long now = this.f28768k.now();
        C10499i m9418q = m9418q();
        m9418q.m11369m(c6546a);
        m9418q.m11374h(str);
        int m11381a = m9418q.m11381a();
        if (m11381a != 3 && m11381a != 5 && m11381a != 6) {
            m9418q.m11377e(now);
            m9425I(m9418q, 4);
        }
        m9415v(m9418q, now);
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: s */
    public void mo9423h(String str, ImageInfo imageInfo, InterfaceC6545b.C6546a c6546a) {
        long now = this.f28768k.now();
        C10499i m9418q = m9418q();
        m9418q.m11369m(c6546a);
        m9418q.m11375g(now);
        m9418q.m11364r(now);
        m9418q.m11374h(str);
        m9418q.m11368n(imageInfo);
        m9425I(m9418q, 3);
    }

    @Override // p114g4.C6544a, p114g4.InterfaceC6545b
    /* renamed from: t */
    public void onIntermediateImageSet(String str, ImageInfo imageInfo) {
        long now = this.f28768k.now();
        C10499i m9418q = m9418q();
        m9418q.m11372j(now);
        m9418q.m11374h(str);
        m9418q.m11368n(imageInfo);
        m9425I(m9418q, 2);
    }
}