package p102fb;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: fb.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6380j {

    /* renamed from: a */
    private final AbstractC6369c f18027a;

    /* renamed from: b */
    private final boolean f18028b;

    /* renamed from: c */
    private final InterfaceC6384c f18029c;

    /* renamed from: d */
    private final int f18030d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fb.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6381a implements InterfaceC6384c {

        /* renamed from: a */
        final /* synthetic */ AbstractC6369c f18031a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fb.j$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C6382a extends AbstractC6383b {
            C6382a(C6380j c6380j, CharSequence charSequence) {
                super(c6380j, charSequence);
            }

            @Override // p102fb.C6380j.AbstractC6383b
            /* renamed from: f */
            int mo22817f(int i) {
                return i + 1;
            }

            @Override // p102fb.C6380j.AbstractC6383b
            /* renamed from: g */
            int mo22816g(int i) {
                return C6381a.this.f18031a.mo22847c(this.f18033l, i);
            }
        }

        C6381a(AbstractC6369c abstractC6369c) {
            this.f18031a = abstractC6369c;
        }

        @Override // p102fb.C6380j.InterfaceC6384c
        /* renamed from: b */
        public AbstractC6383b mo22815a(C6380j c6380j, CharSequence charSequence) {
            return new C6382a(c6380j, charSequence);
        }
    }

    /* renamed from: fb.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static abstract class AbstractC6383b extends AbstractC6365a<String> {

        /* renamed from: l */
        final CharSequence f18033l;

        /* renamed from: m */
        final AbstractC6369c f18034m;

        /* renamed from: n */
        final boolean f18035n;

        /* renamed from: o */
        int f18036o = 0;

        /* renamed from: p */
        int f18037p;

        protected AbstractC6383b(C6380j c6380j, CharSequence charSequence) {
            this.f18034m = c6380j.f18027a;
            this.f18035n = c6380j.f18028b;
            this.f18037p = c6380j.f18030d;
            this.f18033l = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p102fb.AbstractC6365a
        /* renamed from: e */
        public String mo22819a() {
            int mo22816g;
            int i = this.f18036o;
            while (true) {
                int i2 = this.f18036o;
                if (i2 != -1) {
                    mo22816g = mo22816g(i2);
                    if (mo22816g == -1) {
                        mo22816g = this.f18033l.length();
                        this.f18036o = -1;
                    } else {
                        this.f18036o = mo22817f(mo22816g);
                    }
                    int i3 = this.f18036o;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.f18036o = i4;
                        if (i4 > this.f18033l.length()) {
                            this.f18036o = -1;
                        }
                    } else {
                        while (i < mo22816g && this.f18034m.mo22846e(this.f18033l.charAt(i))) {
                            i++;
                        }
                        while (mo22816g > i && this.f18034m.mo22846e(this.f18033l.charAt(mo22816g - 1))) {
                            mo22816g--;
                        }
                        if (!this.f18035n || i != mo22816g) {
                            break;
                        }
                        i = this.f18036o;
                    }
                } else {
                    return m22856b();
                }
            }
            int i5 = this.f18037p;
            if (i5 == 1) {
                mo22816g = this.f18033l.length();
                this.f18036o = -1;
                while (mo22816g > i && this.f18034m.mo22846e(this.f18033l.charAt(mo22816g - 1))) {
                    mo22816g--;
                }
            } else {
                this.f18037p = i5 - 1;
            }
            return this.f18033l.subSequence(i, mo22816g).toString();
        }

        /* renamed from: f */
        abstract int mo22817f(int i);

        /* renamed from: g */
        abstract int mo22816g(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fb.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC6384c {
        /* renamed from: a */
        Iterator<String> mo22815a(C6380j c6380j, CharSequence charSequence);
    }

    private C6380j(InterfaceC6384c interfaceC6384c) {
        this(interfaceC6384c, false, AbstractC6369c.m22849f(), ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: d */
    public static C6380j m22824d(char c) {
        return m22823e(AbstractC6369c.m22850d(c));
    }

    /* renamed from: e */
    public static C6380j m22823e(AbstractC6369c abstractC6369c) {
        C6378h.m22834j(abstractC6369c);
        return new C6380j(new C6381a(abstractC6369c));
    }

    /* renamed from: g */
    private Iterator<String> m22821g(CharSequence charSequence) {
        return this.f18029c.mo22815a(this, charSequence);
    }

    /* renamed from: f */
    public List<String> m22822f(CharSequence charSequence) {
        C6378h.m22834j(charSequence);
        Iterator<String> m22821g = m22821g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m22821g.hasNext()) {
            arrayList.add(m22821g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private C6380j(InterfaceC6384c interfaceC6384c, boolean z, AbstractC6369c abstractC6369c, int i) {
        this.f18029c = interfaceC6384c;
        this.f18028b = z;
        this.f18027a = abstractC6369c;
        this.f18030d = i;
    }
}
