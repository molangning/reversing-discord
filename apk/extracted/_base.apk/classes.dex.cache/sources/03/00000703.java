package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1635r extends Writer {

    /* renamed from: j */
    private final String f4344j;

    /* renamed from: k */
    private StringBuilder f4345k = new StringBuilder(128);

    public C1635r(String str) {
        this.f4344j = str;
    }

    /* renamed from: a */
    private void m36170a() {
        if (this.f4345k.length() > 0) {
            Log.d(this.f4344j, this.f4345k.toString());
            StringBuilder sb2 = this.f4345k;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m36170a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m36170a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m36170a();
            } else {
                this.f4345k.append(c);
            }
        }
    }
}