package p215ld;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ld.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10132b {

    /* renamed from: a */
    private List<C10131a> f26435a = new ArrayList(2);

    /* renamed from: a */
    public void m12194a(MediaFormat mediaFormat) {
        C10131a c10131a = new C10131a();
        c10131a.m12196e(mediaFormat);
        this.f26435a.add(c10131a);
    }

    /* renamed from: b */
    public List<C10131a> m12193b() {
        return this.f26435a;
    }

    /* renamed from: c */
    public void m12192c(int i, long j) {
        C10131a c10131a = this.f26435a.get(i);
        c10131a.m12198c(c10131a.m12200a() + j);
    }

    /* renamed from: d */
    public void m12191d(int i, MediaFormat mediaFormat) {
        this.f26435a.get(i).m12195f(mediaFormat);
    }

    /* renamed from: e */
    public void m12190e(int i, String str, String str2) {
        C10131a c10131a = this.f26435a.get(i);
        c10131a.m12199b(str);
        c10131a.m12197d(str2);
    }
}