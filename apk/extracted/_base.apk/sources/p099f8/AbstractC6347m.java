package p099f8;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p151i6.InterfaceC7407r;
import p153i8.InterfaceC7444e;
import p195k8.C9149a;
import p229m7.InterfaceC10341s;

/* renamed from: f8.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6347m {

    /* renamed from: a */
    private InterfaceC6348a f17986a;

    /* renamed from: b */
    private InterfaceC7444e f17987b;

    /* renamed from: f8.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC6348a {
        /* renamed from: b */
        void mo22876b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC7444e m22881a() {
        return (InterfaceC7444e) C9149a.m16448e(this.f17987b);
    }

    /* renamed from: b */
    public final void m22880b(InterfaceC6348a interfaceC6348a, InterfaceC7444e interfaceC7444e) {
        this.f17986a = interfaceC6348a;
        this.f17987b = interfaceC7444e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m22879c() {
        InterfaceC6348a interfaceC6348a = this.f17986a;
        if (interfaceC6348a != null) {
            interfaceC6348a.mo22876b();
        }
    }

    /* renamed from: d */
    public abstract void mo22878d(Object obj);

    /* renamed from: e */
    public abstract C6349n mo22877e(InterfaceC7407r[] interfaceC7407rArr, TrackGroupArray trackGroupArray, InterfaceC10341s.C10342a c10342a, Timeline timeline);
}
