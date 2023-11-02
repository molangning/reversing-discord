package p360u3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: u3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12828a {

    /* renamed from: a */
    InterfaceC12829a f33330a;

    /* renamed from: b */
    final float f33331b;

    /* renamed from: c */
    boolean f33332c;

    /* renamed from: d */
    boolean f33333d;

    /* renamed from: e */
    long f33334e;

    /* renamed from: f */
    float f33335f;

    /* renamed from: g */
    float f33336g;

    /* renamed from: u3.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12829a {
        /* renamed from: b */
        boolean mo3846b();
    }

    public C12828a(Context context) {
        this.f33331b = ViewConfiguration.get(context).getScaledTouchSlop();
        m3852a();
    }

    /* renamed from: c */
    public static C12828a m3850c(Context context) {
        return new C12828a(context);
    }

    /* renamed from: a */
    public void m3852a() {
        this.f33330a = null;
        m3848e();
    }

    /* renamed from: b */
    public boolean m3851b() {
        return this.f33332c;
    }

    /* renamed from: d */
    public boolean m3849d(MotionEvent motionEvent) {
        InterfaceC12829a interfaceC12829a;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f33332c = false;
                        this.f33333d = false;
                    }
                } else if (Math.abs(motionEvent.getX() - this.f33335f) > this.f33331b || Math.abs(motionEvent.getY() - this.f33336g) > this.f33331b) {
                    this.f33333d = false;
                }
            } else {
                this.f33332c = false;
                if (Math.abs(motionEvent.getX() - this.f33335f) > this.f33331b || Math.abs(motionEvent.getY() - this.f33336g) > this.f33331b) {
                    this.f33333d = false;
                }
                if (this.f33333d && motionEvent.getEventTime() - this.f33334e <= ViewConfiguration.getLongPressTimeout() && (interfaceC12829a = this.f33330a) != null) {
                    interfaceC12829a.mo3846b();
                }
                this.f33333d = false;
            }
        } else {
            this.f33332c = true;
            this.f33333d = true;
            this.f33334e = motionEvent.getEventTime();
            this.f33335f = motionEvent.getX();
            this.f33336g = motionEvent.getY();
        }
        return true;
    }

    /* renamed from: e */
    public void m3848e() {
        this.f33332c = false;
        this.f33333d = false;
    }

    /* renamed from: f */
    public void m3847f(InterfaceC12829a interfaceC12829a) {
        this.f33330a = interfaceC12829a;
    }
}