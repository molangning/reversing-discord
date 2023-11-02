package id;

import android.graphics.Paint;
import com.henninghall.date_picker.C5146f;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.util.ArrayList;
import java.util.Calendar;
import p084ed.EnumC6204b;

/* renamed from: id.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7504h extends AbstractC7502g {

    /* renamed from: f */
    private int f20724f;

    /* renamed from: g */
    private int f20725g;

    public C7504h(InterfaceC5161a interfaceC5161a, C5151j c5151j) {
        super(interfaceC5161a, c5151j);
        this.f20724f = 1900;
        this.f20725g = 2100;
    }

    /* renamed from: x */
    private int m20560x() {
        if (this.f20718a.m26035w() == null) {
            return this.f20725g;
        }
        return this.f20718a.m26035w().get(1);
    }

    /* renamed from: y */
    private int m20559y() {
        if (this.f20718a.m26034x() == null) {
            return this.f20724f;
        }
        return this.f20718a.m26034x().get(1);
    }

    @Override // id.AbstractC7502g
    /* renamed from: e */
    public String mo20565e() {
        return C5146f.m26070h(this.f20718a.m26036v());
    }

    @Override // id.AbstractC7502g
    /* renamed from: l */
    public Paint.Align mo20564l() {
        return Paint.Align.RIGHT;
    }

    @Override // id.AbstractC7502g
    /* renamed from: o */
    public ArrayList<String> mo20563o() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int m20559y = m20559y();
        int m20560x = m20560x() - m20559y;
        calendar.set(1, m20559y);
        for (int i = 0; i <= m20560x; i++) {
            arrayList.add(m20576i(calendar));
            calendar.add(1, 1);
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
        return false;
    }
}
