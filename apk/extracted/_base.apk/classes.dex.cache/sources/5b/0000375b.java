package id;

import android.graphics.Paint;
import com.henninghall.date_picker.C5145e;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.util.ArrayList;
import java.util.Calendar;
import p084ed.EnumC6204b;

/* renamed from: id.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7499d extends AbstractC7502g {

    /* renamed from: f */
    private final C5145e f20717f;

    public C7499d(InterfaceC5161a interfaceC5161a, C5151j c5151j) {
        super(interfaceC5161a, c5151j);
        this.f20717f = new C5145e(this.f20718a);
    }

    @Override // id.AbstractC7502g
    /* renamed from: e */
    public String mo20565e() {
        return this.f20718a.f14509p.m26086i() ? "h" : "HH";
    }

    @Override // id.AbstractC7502g
    /* renamed from: l */
    public Paint.Align mo20564l() {
        return Paint.Align.RIGHT;
    }

    @Override // id.AbstractC7502g
    /* renamed from: o */
    public ArrayList<String> mo20563o() {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 0, 0, 0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f20718a.f14509p.m26086i()) {
            i = 12;
        } else {
            i = 24;
        }
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.f20722e.format(calendar.getTime()));
            calendar.add(11, 1);
        }
        return arrayList;
    }

    @Override // id.AbstractC7502g
    /* renamed from: t */
    public String mo20567t(String str) {
        return this.f20717f.m26079b(str);
    }

    @Override // id.AbstractC7502g
    /* renamed from: v */
    public boolean mo20562v() {
        return this.f20718a.m26032z() != EnumC6204b.date;
    }

    @Override // id.AbstractC7502g
    /* renamed from: w */
    public boolean mo20561w() {
        return true;
    }
}