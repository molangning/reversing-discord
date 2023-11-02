package id;

import android.graphics.Paint;
import com.henninghall.date_picker.C5146f;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.util.ArrayList;
import java.util.Calendar;
import p084ed.EnumC6204b;

/* renamed from: id.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7497b extends AbstractC7502g {
    public C7497b(InterfaceC5161a interfaceC5161a, C5151j c5151j) {
        super(interfaceC5161a, c5151j);
    }

    @Override // id.AbstractC7502g
    /* renamed from: e */
    public String mo20565e() {
        return C5146f.m26077a(this.f20718a.m26036v());
    }

    @Override // id.AbstractC7502g
    /* renamed from: l */
    public Paint.Align mo20564l() {
        return Paint.Align.RIGHT;
    }

    @Override // id.AbstractC7502g
    /* renamed from: o */
    public ArrayList<String> mo20563o() {
        Calendar calendar = Calendar.getInstance();
        ArrayList<String> arrayList = new ArrayList<>();
        calendar.set(2, 0);
        calendar.set(5, 1);
        for (int i = 1; i <= 31; i++) {
            arrayList.add(m20576i(calendar));
            calendar.add(5, 1);
        }
        return arrayList;
    }

    @Override // id.AbstractC7502g
    /* renamed from: v */
    public boolean mo20562v() {
        return this.f20718a.m26032z() == EnumC6204b.date;
    }

    @Override // id.AbstractC7502g
    /* renamed from: w */
    public boolean mo20561w() {
        return true;
    }
}