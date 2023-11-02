package p369ud;

import android.media.MediaFormat;
import com.linkedin.android.litr.p050io.MediaRange;
import md.InterfaceC10436a;
import md.InterfaceC10437b;
import sd.InterfaceC12458c;
import sd.InterfaceC12459d;
import td.InterfaceC12664i;

/* renamed from: ud.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12954c {

    /* renamed from: a */
    protected final InterfaceC12458c f33683a;

    /* renamed from: b */
    protected final InterfaceC12459d f33684b;

    /* renamed from: c */
    protected final InterfaceC12664i f33685c;

    /* renamed from: d */
    protected final InterfaceC10436a f33686d;

    /* renamed from: e */
    protected final InterfaceC10437b f33687e;

    /* renamed from: f */
    protected final MediaRange f33688f;

    /* renamed from: g */
    protected int f33689g;

    /* renamed from: h */
    protected int f33690h;

    /* renamed from: i */
    protected boolean f33691i;

    /* renamed from: j */
    protected MediaFormat f33692j;

    /* renamed from: k */
    protected long f33693k;

    /* renamed from: l */
    protected float f33694l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC12954c(InterfaceC12458c interfaceC12458c, int i, InterfaceC12459d interfaceC12459d, int i2, MediaFormat mediaFormat, InterfaceC12664i interfaceC12664i, InterfaceC10436a interfaceC10436a, InterfaceC10437b interfaceC10437b) {
        this.f33693k = -1L;
        this.f33683a = interfaceC12458c;
        this.f33689g = i;
        this.f33690h = i2;
        this.f33684b = interfaceC12459d;
        this.f33692j = mediaFormat;
        this.f33685c = interfaceC12664i;
        this.f33686d = interfaceC10436a;
        this.f33687e = interfaceC10437b;
        MediaRange selection = interfaceC12458c.getSelection();
        this.f33688f = selection;
        MediaFormat trackFormat = interfaceC12458c.getTrackFormat(i);
        if (trackFormat.containsKey("durationUs")) {
            long j = trackFormat.getLong("durationUs");
            this.f33693k = j;
            if (mediaFormat != null) {
                mediaFormat.setLong("durationUs", j);
            }
        }
        if (selection.m25544a() >= selection.m25543b()) {
            long min = Math.min(this.f33693k, selection.m25544a());
            this.f33693k = min;
            this.f33693k = min - selection.m25543b();
            return;
        }
        throw new IllegalArgumentException("Range end should be greater than range start");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public MediaFormat m3602a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (!mediaFormat2.containsKey("durationUs") && mediaFormat.containsKey("durationUs")) {
            mediaFormat2.setLong("durationUs", mediaFormat.getLong("durationUs"));
        }
        if (!mediaFormat2.containsKey("language") && mediaFormat.containsKey("language")) {
            mediaFormat2.setString("language", mediaFormat.getString("language"));
        }
        return mediaFormat2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m3601b() {
        while (this.f33683a.getSampleTrackIndex() == this.f33689g) {
            this.f33683a.advance();
            if ((this.f33683a.getSampleFlags() & 4) != 0) {
                return 4;
            }
        }
        return 5;
    }

    /* renamed from: c */
    public String mo3600c() {
        return this.f33686d.getName();
    }

    /* renamed from: d */
    public String mo3599d() {
        return this.f33687e.getName();
    }

    /* renamed from: e */
    public float m3598e() {
        return this.f33694l;
    }

    /* renamed from: f */
    public MediaFormat m3597f() {
        return this.f33692j;
    }

    /* renamed from: g */
    public abstract int mo3595g();

    /* renamed from: h */
    public abstract void mo3594h();

    /* renamed from: i */
    public abstract void mo3593i();
}
