package p369ud;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import sd.InterfaceC12458c;
import sd.InterfaceC12459d;

/* renamed from: ud.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12953b extends AbstractC12954c {

    /* renamed from: p */
    private static final String f33679p = "b";

    /* renamed from: m */
    ByteBuffer f33680m;

    /* renamed from: n */
    MediaCodec.BufferInfo f33681n;

    /* renamed from: o */
    int f33682o;

    public C12953b(InterfaceC12458c interfaceC12458c, int i, InterfaceC12459d interfaceC12459d, int i2) {
        super(interfaceC12458c, i, interfaceC12459d, i2, null, null, null, null);
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: c */
    public String mo3600c() {
        return "passthrough";
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: d */
    public String mo3599d() {
        return "passthrough";
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: g */
    public int mo3595g() {
        int i;
        int i2;
        int i3 = this.f33682o;
        if (i3 == 4) {
            return i3;
        }
        if (i3 == 5) {
            this.f33682o = m3601b();
            return 4;
        } else if (!this.f33691i) {
            MediaFormat trackFormat = this.f33683a.getTrackFormat(this.f33689g);
            this.f33692j = trackFormat;
            long j = this.f33693k;
            if (j > 0) {
                trackFormat.setLong("durationUs", j);
            }
            this.f33690h = this.f33684b.mo5221c(this.f33692j, this.f33690h);
            this.f33691i = true;
            if (this.f33692j.containsKey("max-input-size")) {
                i2 = this.f33692j.getInteger("max-input-size");
            } else {
                i2 = 1048576;
            }
            this.f33680m = ByteBuffer.allocate(i2);
            this.f33682o = 1;
            return 1;
        } else {
            int sampleTrackIndex = this.f33683a.getSampleTrackIndex();
            if (sampleTrackIndex != -1 && sampleTrackIndex != this.f33689g) {
                this.f33682o = 2;
                return 2;
            }
            this.f33682o = 2;
            int readSampleData = this.f33683a.readSampleData(this.f33680m, 0);
            long sampleTime = this.f33683a.getSampleTime();
            int sampleFlags = this.f33683a.getSampleFlags();
            if (readSampleData >= 0 && (sampleFlags & 4) == 0) {
                if (sampleTime >= this.f33688f.m25544a()) {
                    this.f33680m.clear();
                    this.f33694l = 1.0f;
                    this.f33681n.set(0, 0, sampleTime - this.f33688f.m25543b(), this.f33681n.flags | 4);
                    this.f33684b.mo5222b(this.f33690h, this.f33680m, this.f33681n);
                    this.f33682o = m3601b();
                    Log.d(f33679p, "Reach selection end on input stream");
                } else {
                    if (sampleTime >= this.f33688f.m25543b()) {
                        if ((sampleFlags & 1) != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        long m25543b = sampleTime - this.f33688f.m25543b();
                        long j2 = this.f33693k;
                        if (j2 > 0) {
                            this.f33694l = ((float) m25543b) / ((float) j2);
                        }
                        this.f33681n.set(0, readSampleData, m25543b, i);
                        this.f33684b.mo5222b(this.f33690h, this.f33680m, this.f33681n);
                    }
                    this.f33683a.advance();
                }
            } else {
                this.f33680m.clear();
                this.f33694l = 1.0f;
                this.f33682o = 4;
                Log.d(f33679p, "Reach EoS on input stream");
            }
            return this.f33682o;
        }
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: h */
    public void mo3594h() {
        this.f33683a.selectTrack(this.f33689g);
        this.f33681n = new MediaCodec.BufferInfo();
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: i */
    public void mo3593i() {
        ByteBuffer byteBuffer = this.f33680m;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f33680m = null;
        }
    }
}