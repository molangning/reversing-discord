package p193k6;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p195k8.C9191p0;

/* renamed from: k6.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9124s {

    /* renamed from: a */
    private final C9125a f24009a;

    /* renamed from: b */
    private int f24010b;

    /* renamed from: c */
    private long f24011c;

    /* renamed from: d */
    private long f24012d;

    /* renamed from: e */
    private long f24013e;

    /* renamed from: f */
    private long f24014f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k6.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9125a {

        /* renamed from: a */
        private final AudioTrack f24015a;

        /* renamed from: b */
        private final AudioTimestamp f24016b = new AudioTimestamp();

        /* renamed from: c */
        private long f24017c;

        /* renamed from: d */
        private long f24018d;

        /* renamed from: e */
        private long f24019e;

        public C9125a(AudioTrack audioTrack) {
            this.f24015a = audioTrack;
        }

        /* renamed from: a */
        public long m16526a() {
            return this.f24019e;
        }

        /* renamed from: b */
        public long m16525b() {
            return this.f24016b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m16524c() {
            boolean timestamp = this.f24015a.getTimestamp(this.f24016b);
            if (timestamp) {
                long j = this.f24016b.framePosition;
                if (this.f24018d > j) {
                    this.f24017c++;
                }
                this.f24018d = j;
                this.f24019e = j + (this.f24017c << 32);
            }
            return timestamp;
        }
    }

    public C9124s(AudioTrack audioTrack) {
        if (C9191p0.f24171a >= 19) {
            this.f24009a = new C9125a(audioTrack);
            m16528g();
            return;
        }
        this.f24009a = null;
        m16527h(3);
    }

    /* renamed from: h */
    private void m16527h(int i) {
        this.f24010b = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.f24012d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f24012d = 10000000L;
                return;
            }
            this.f24012d = 10000L;
            return;
        }
        this.f24013e = 0L;
        this.f24014f = -1L;
        this.f24011c = System.nanoTime() / 1000;
        this.f24012d = 10000L;
    }

    /* renamed from: a */
    public void m16534a() {
        if (this.f24010b == 4) {
            m16528g();
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public long m16533b() {
        C9125a c9125a = this.f24009a;
        if (c9125a != null) {
            return c9125a.m16526a();
        }
        return -1L;
    }

    @TargetApi(19)
    /* renamed from: c */
    public long m16532c() {
        C9125a c9125a = this.f24009a;
        if (c9125a != null) {
            return c9125a.m16525b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m16531d() {
        return this.f24010b == 2;
    }

    @TargetApi(19)
    /* renamed from: e */
    public boolean m16530e(long j) {
        C9125a c9125a = this.f24009a;
        if (c9125a == null || j - this.f24013e < this.f24012d) {
            return false;
        }
        this.f24013e = j;
        boolean m16524c = c9125a.m16524c();
        int i = this.f24010b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (m16524c) {
                        m16528g();
                    }
                } else if (!m16524c) {
                    m16528g();
                }
            } else if (m16524c) {
                if (this.f24009a.m16526a() > this.f24014f) {
                    m16527h(2);
                }
            } else {
                m16528g();
            }
        } else if (m16524c) {
            if (this.f24009a.m16525b() < this.f24011c) {
                return false;
            }
            this.f24014f = this.f24009a.m16526a();
            m16527h(1);
        } else if (j - this.f24011c > 500000) {
            m16527h(3);
        }
        return m16524c;
    }

    /* renamed from: f */
    public void m16529f() {
        m16527h(4);
    }

    /* renamed from: g */
    public void m16528g() {
        if (this.f24009a != null) {
            m16527h(0);
        }
    }
}
