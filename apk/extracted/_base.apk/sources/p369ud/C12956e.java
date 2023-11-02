package p369ud;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import md.C10438c;
import md.InterfaceC10436a;
import md.InterfaceC10437b;
import p248nd.C10578e;
import p387vd.C13252f;
import sd.InterfaceC12458c;
import sd.InterfaceC12459d;
import td.C12659d;
import td.C12662g;
import td.InterfaceC12660e;
import td.InterfaceC12664i;

/* renamed from: ud.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12956e extends AbstractC12954c {

    /* renamed from: t */
    private static final String f33696t = "e";

    /* renamed from: m */
    int f33697m;

    /* renamed from: n */
    int f33698n;

    /* renamed from: o */
    int f33699o;

    /* renamed from: p */
    C12662g f33700p;

    /* renamed from: q */
    private MediaFormat f33701q;

    /* renamed from: r */
    private MediaFormat f33702r;

    /* renamed from: s */
    private InterfaceC12660e f33703s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12956e(InterfaceC12458c interfaceC12458c, int i, InterfaceC12459d interfaceC12459d, int i2, MediaFormat mediaFormat, InterfaceC12664i interfaceC12664i, InterfaceC10436a interfaceC10436a, InterfaceC10437b interfaceC10437b) {
        super(interfaceC12458c, i, interfaceC12459d, i2, mediaFormat, interfaceC12664i, interfaceC10436a, interfaceC10437b);
        this.f33697m = 2;
        this.f33698n = 2;
        this.f33699o = 2;
        this.f33702r = mediaFormat;
        if (interfaceC12664i instanceof C12662g) {
            this.f33700p = (C12662g) interfaceC12664i;
            m3590l();
            return;
        }
        throw new IllegalArgumentException("Cannot use non-OpenGL video renderer in " + C12956e.class.getSimpleName());
    }

    /* renamed from: j */
    private InterfaceC12660e m3592j() {
        Number m2928b = C13252f.m2928b(this.f33701q, "frame-rate");
        Number m2928b2 = C13252f.m2928b(this.f33702r, "frame-rate");
        if (m2928b2 == null || m2928b2.intValue() < 1) {
            m2928b2 = m2928b;
        }
        if (m2928b != null && m2928b.intValue() > m2928b2.intValue()) {
            return new C12659d(m2928b.intValue(), m2928b2.intValue());
        }
        return null;
    }

    /* renamed from: k */
    private int m3591k() {
        int i;
        int sampleTrackIndex = this.f33683a.getSampleTrackIndex();
        if (sampleTrackIndex != this.f33689g && sampleTrackIndex != -1) {
            return 2;
        }
        int mo11560d = this.f33686d.mo11560d(0L);
        if (mo11560d >= 0) {
            C10438c mo11563a = this.f33686d.mo11563a(mo11560d);
            if (mo11563a != null) {
                int readSampleData = this.f33683a.readSampleData(mo11563a.f27261b, 0);
                long sampleTime = this.f33683a.getSampleTime();
                int sampleFlags = this.f33683a.getSampleFlags();
                if (readSampleData >= 0 && (sampleFlags & 4) == 0) {
                    if (sampleTime >= this.f33688f.m25544a()) {
                        mo11563a.f27262c.set(0, 0, -1L, 4);
                        this.f33686d.mo11558f(mo11563a);
                        i = m3601b();
                        Log.d(f33696t, "Selection end reached on the input stream");
                    } else {
                        mo11563a.f27262c.set(0, readSampleData, sampleTime, sampleFlags);
                        this.f33686d.mo11558f(mo11563a);
                        this.f33683a.advance();
                        return 2;
                    }
                } else {
                    mo11563a.f27262c.set(0, 0, -1L, 4);
                    this.f33686d.mo11558f(mo11563a);
                    Log.d(f33696t, "EoS reached on the input stream");
                    i = 4;
                }
                return i;
            }
            throw new C10578e(C10578e.EnumC10579a.NO_FRAME_AVAILABLE);
        } else if (mo11560d == -1) {
            return 2;
        } else {
            String str = f33696t;
            Log.e(str, "Unhandled value " + mo11560d + " when decoding an input frame");
            return 2;
        }
    }

    /* renamed from: l */
    private void m3590l() {
        this.f33701q = this.f33683a.getTrackFormat(this.f33689g);
        this.f33703s = m3592j();
        this.f33687e.mo11553c(this.f33692j);
        this.f33700p.mo4585b(this.f33687e.createInputSurface(), this.f33701q, this.f33702r);
        this.f33686d.mo11557g(this.f33701q, this.f33700p.m4590f());
    }

    /* renamed from: m */
    private int m3589m() {
        boolean z;
        int mo11562b = this.f33686d.mo11562b(0L);
        if (mo11562b >= 0) {
            C10438c mo11559e = this.f33686d.mo11559e(mo11562b);
            if (mo11559e != null) {
                MediaCodec.BufferInfo bufferInfo = mo11559e.f27262c;
                boolean z2 = false;
                if ((bufferInfo.flags & 4) != 0) {
                    Log.d(f33696t, "EoS on decoder output stream");
                    this.f33686d.mo11556h(mo11562b, false);
                    this.f33687e.mo11549g();
                    return 4;
                }
                if (bufferInfo.presentationTimeUs >= this.f33688f.m25543b()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f33686d.mo11556h(mo11562b, z);
                InterfaceC12660e interfaceC12660e = this.f33703s;
                if (interfaceC12660e == null || interfaceC12660e.mo4595a()) {
                    z2 = true;
                }
                if (z && z2) {
                    this.f33700p.mo4584c(null, TimeUnit.MICROSECONDS.toNanos(mo11559e.f27262c.presentationTimeUs - this.f33688f.m25543b()));
                    return 2;
                }
                return 3;
            }
            throw new C10578e(C10578e.EnumC10579a.NO_FRAME_AVAILABLE);
        } else if (mo11562b != -2) {
            if (mo11562b == -1) {
                return 2;
            }
            Log.e(f33696t, "Unhandled value " + mo11562b + " when receiving decoded input frame");
            return 2;
        } else {
            MediaFormat m3602a = m3602a(this.f33701q, this.f33686d.getOutputFormat());
            this.f33701q = m3602a;
            this.f33700p.mo4583d(m3602a, this.f33702r);
            Log.d(f33696t, "Decoder output format changed: " + this.f33701q);
            return 2;
        }
    }

    /* renamed from: n */
    private int m3588n() {
        int mo11554b = this.f33687e.mo11554b(0L);
        int i = 2;
        if (mo11554b >= 0) {
            C10438c mo11551e = this.f33687e.mo11551e(mo11554b);
            if (mo11551e != null) {
                MediaCodec.BufferInfo bufferInfo = mo11551e.f27262c;
                int i2 = bufferInfo.flags;
                if ((i2 & 4) != 0) {
                    Log.d(f33696t, "Encoder produced EoS, we are done");
                    this.f33694l = 1.0f;
                    i = 4;
                } else if (bufferInfo.size > 0 && (i2 & 2) == 0) {
                    this.f33684b.mo5222b(this.f33690h, mo11551e.f27261b, bufferInfo);
                    long j = this.f33693k;
                    if (j > 0) {
                        this.f33694l = ((float) mo11551e.f27262c.presentationTimeUs) / ((float) j);
                    }
                }
                this.f33687e.mo11548h(mo11554b);
            } else {
                throw new C10578e(C10578e.EnumC10579a.NO_FRAME_AVAILABLE);
            }
        } else if (mo11554b != -2) {
            if (mo11554b != -1) {
                Log.e(f33696t, "Unhandled value " + mo11554b + " when receiving encoded output frame");
            }
        } else {
            MediaFormat outputFormat = this.f33687e.getOutputFormat();
            i = 1;
            if (!this.f33691i) {
                MediaFormat m3602a = m3602a(this.f33701q, outputFormat);
                this.f33692j = m3602a;
                this.f33702r = m3602a;
                this.f33690h = this.f33684b.mo5221c(m3602a, this.f33690h);
                this.f33691i = true;
                this.f33700p.mo4583d(this.f33701q, this.f33702r);
            }
            Log.d(f33696t, "Encoder output format received " + outputFormat);
        }
        return i;
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: g */
    public int mo3595g() {
        if (this.f33687e.isRunning() && this.f33686d.isRunning()) {
            if (this.f33697m == 5) {
                this.f33697m = m3601b();
            }
            int i = this.f33697m;
            if (i != 4 && i != 5) {
                this.f33697m = m3591k();
            }
            if (this.f33698n != 4) {
                this.f33698n = m3589m();
            }
            if (this.f33699o != 4) {
                this.f33699o = m3588n();
            }
            int i2 = this.f33699o;
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
            }
            int i4 = this.f33697m;
            if ((i4 == 4 || i4 == 5) && this.f33698n == 4 && i2 == 4) {
                return 4;
            }
            if (this.f33698n == 3) {
                return 3;
            }
            return i3;
        }
        return -3;
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: h */
    public void mo3594h() {
        this.f33683a.selectTrack(this.f33689g);
        this.f33687e.start();
        this.f33686d.start();
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: i */
    public void mo3593i() {
        this.f33687e.stop();
        this.f33687e.release();
        this.f33686d.stop();
        this.f33686d.release();
        this.f33700p.release();
    }
}
