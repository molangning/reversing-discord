package p296q6;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import p153i8.InterfaceC7451h;
import p195k8.C9208y;
import p296q6.InterfaceC11732b0;

/* renamed from: q6.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11745h implements InterfaceC11732b0 {

    /* renamed from: a */
    private final byte[] f30638a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: a */
    public /* synthetic */ void mo6170a(C9208y c9208y, int i) {
        C11730a0.m7041b(this, c9208y, i);
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: b */
    public void mo6169b(C9208y c9208y, int i, int i2) {
        c9208y.m16098Q(i);
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: c */
    public void mo6168c(Format format) {
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: d */
    public /* synthetic */ int mo6167d(InterfaceC7451h interfaceC7451h, int i, boolean z) {
        return C11730a0.m7042a(this, interfaceC7451h, i, z);
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: e */
    public int mo6166e(InterfaceC7451h interfaceC7451h, int i, boolean z, int i2) {
        int read = interfaceC7451h.read(this.f30638a, 0, Math.min(this.f30638a.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: f */
    public void mo6162f(long j, int i, int i2, int i3, InterfaceC11732b0.C11733a c11733a) {
    }
}
