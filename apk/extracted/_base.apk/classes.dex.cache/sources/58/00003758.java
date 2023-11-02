package id;

import android.graphics.Paint;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.util.ArrayList;
import java.util.Calendar;
import p084ed.EnumC6204b;

/* renamed from: id.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7496a extends AbstractC7502g {
    public C7496a(InterfaceC5161a interfaceC5161a, C5151j c5151j) {
        super(interfaceC5161a, c5151j);
    }

    @Override // id.AbstractC7502g
    /* renamed from: e */
    public String mo20565e() {
        return this.f20718a.f14509p.m26086i() ? " a " : "";
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
        calendar.set(2000, 0, 0, 0, 0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        calendar.set(11, 0);
        arrayList.add(this.f20722e.format(calendar.getTime()));
        calendar.add(11, 12);
        arrayList.add(this.f20722e.format(calendar.getTime()));
        return arrayList;
    }

    @Override // id.AbstractC7502g
    /* renamed from: v */
    public boolean mo20562v() {
        return this.f20718a.f14509p.m26086i() && this.f20718a.m26032z() != EnumC6204b.date;
    }

    @Override // id.AbstractC7502g
    /* renamed from: w */
    public boolean mo20561w() {
        return false;
    }
}