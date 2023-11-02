package p296q6;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p152i7.C7420e;
import p152i7.C7429j;
import p195k8.C9191p0;

/* renamed from: q6.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11762u {

    /* renamed from: c */
    private static final Pattern f30660c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f30661a = -1;

    /* renamed from: b */
    public int f30662b = -1;

    /* renamed from: b */
    private boolean m6961b(String str) {
        Matcher matcher = f30660c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) C9191p0.m16243j(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) C9191p0.m16243j(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f30661a = parseInt;
                    this.f30662b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6962a() {
        return (this.f30661a == -1 || this.f30662b == -1) ? false : true;
    }

    /* renamed from: c */
    public boolean m6960c(Metadata metadata) {
        for (int i = 0; i < metadata.m29247e(); i++) {
            Metadata.InterfaceC4429b m29248d = metadata.m29248d(i);
            if (m29248d instanceof C7420e) {
                C7420e c7420e = (C7420e) m29248d;
                if ("iTunSMPB".equals(c7420e.f19950l) && m6961b(c7420e.f19951m)) {
                    return true;
                }
            } else if (m29248d instanceof C7429j) {
                C7429j c7429j = (C7429j) m29248d;
                if ("com.apple.iTunes".equals(c7429j.f19962k) && "iTunSMPB".equals(c7429j.f19963l) && m6961b(c7429j.f19964m)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m6959d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f30661a = i2;
        this.f30662b = i3;
        return true;
    }
}
