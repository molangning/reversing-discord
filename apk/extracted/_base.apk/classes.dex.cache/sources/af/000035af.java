package p137hd;

import com.henninghall.date_picker.pickers.InterfaceC5161a;
import gd.InterfaceC6733e;
import id.AbstractC7502g;

/* renamed from: hd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7071a implements InterfaceC7081j {

    /* renamed from: a */
    private final InterfaceC6733e f19366a;

    /* renamed from: hd.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7072a implements InterfaceC5161a.InterfaceC5162a {

        /* renamed from: a */
        final /* synthetic */ AbstractC7502g f19367a;

        C7072a(AbstractC7502g abstractC7502g) {
            C7071a.this = r1;
            this.f19367a = abstractC7502g;
        }

        @Override // com.henninghall.date_picker.pickers.InterfaceC5161a.InterfaceC5162a
        /* renamed from: a */
        public void mo21450a() {
            C7071a.this.f19366a.mo21997a(this.f19367a);
        }
    }

    public C7071a(InterfaceC6733e interfaceC6733e) {
        this.f19366a = interfaceC6733e;
    }

    @Override // p137hd.InterfaceC7081j
    /* renamed from: a */
    public void mo21449a(AbstractC7502g abstractC7502g) {
        abstractC7502g.f20721d.setOnValueChangedListener(new C7072a(abstractC7502g));
    }
}