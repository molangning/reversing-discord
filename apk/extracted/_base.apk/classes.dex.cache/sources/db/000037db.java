package p162ij;

import java.util.List;
import p162ij.InterfaceC7656l0;
import p162ij.InterfaceC7671w;

/* renamed from: ij.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7626a<U extends InterfaceC7671w> implements InterfaceC7656l0<U> {
    /* renamed from: b */
    public boolean m20221b() {
        List<InterfaceC7656l0.C7657a<U>> mo10257a = mo10257a();
        int size = mo10257a.size();
        for (int i = 0; i < size; i++) {
            if (((InterfaceC7656l0.C7657a) mo10257a.get(i)).m20137a() > 0) {
                return false;
            }
        }
        return true;
    }
}