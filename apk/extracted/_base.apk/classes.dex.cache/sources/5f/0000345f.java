package gd;

import com.henninghall.date_picker.pickers.InterfaceC5161a;
import id.AbstractC7502g;

/* renamed from: gd.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6735g {
    /* renamed from: a */
    public void m21992a(AbstractC7502g abstractC7502g, int i) {
        InterfaceC5161a interfaceC5161a = abstractC7502g.f20721d;
        int value = interfaceC5161a.getValue();
        int maxValue = interfaceC5161a.getMaxValue();
        boolean wrapSelectorWheel = interfaceC5161a.getWrapSelectorWheel();
        int i2 = value + i;
        if (i2 <= maxValue || wrapSelectorWheel) {
            interfaceC5161a.mo26002b(i2 % (maxValue + 1));
        }
    }
}