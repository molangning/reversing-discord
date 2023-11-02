package p346t4;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Collections;
import java.util.List;
import p380v4.C13068h;
import p380v4.InterfaceC13069i;
import p394w2.C13379j;

/* renamed from: t4.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12583g implements InterfaceC12581e {

    /* renamed from: a */
    private final InterfaceC12586c f32656a;

    /* renamed from: t4.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C12585b implements InterfaceC12586c {
        private C12585b() {
        }

        @Override // p346t4.C12583g.InterfaceC12586c
        /* renamed from: a */
        public List<Integer> mo4757a() {
            return Collections.EMPTY_LIST;
        }

        @Override // p346t4.C12583g.InterfaceC12586c
        /* renamed from: b */
        public int mo4756b() {
            return 0;
        }
    }

    /* renamed from: t4.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12586c {
        /* renamed from: a */
        List<Integer> mo4757a();

        /* renamed from: b */
        int mo4756b();
    }

    public C12583g() {
        this(new C12585b());
    }

    @Override // p346t4.InterfaceC12581e
    /* renamed from: a */
    public int mo4759a(int i) {
        List<Integer> mo4757a = this.f32656a.mo4757a();
        if (mo4757a != null && !mo4757a.isEmpty()) {
            for (int i2 = 0; i2 < mo4757a.size(); i2++) {
                if (mo4757a.get(i2).intValue() > i) {
                    return mo4757a.get(i2).intValue();
                }
            }
            return ViewDefaults.NUMBER_OF_LINES;
        }
        return i + 1;
    }

    @Override // p346t4.InterfaceC12581e
    /* renamed from: b */
    public InterfaceC13069i mo4758b(int i) {
        boolean z;
        if (i >= this.f32656a.mo4756b()) {
            z = true;
        } else {
            z = false;
        }
        return C13068h.m3324d(i, z, false);
    }

    public C12583g(InterfaceC12586c interfaceC12586c) {
        this.f32656a = (InterfaceC12586c) C13379j.m2677g(interfaceC12586c);
    }
}
