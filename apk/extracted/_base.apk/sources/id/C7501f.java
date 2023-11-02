package id;

import android.graphics.Paint;
import com.henninghall.date_picker.C5151j;
import com.henninghall.date_picker.pickers.InterfaceC5161a;
import java.util.ArrayList;
import java.util.Calendar;
import p084ed.EnumC6204b;

/* renamed from: id.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7501f extends AbstractC7502g {
    public C7501f(InterfaceC5161a interfaceC5161a, C5151j c5151j) {
        super(interfaceC5161a, c5151j);
    }

    @Override // id.AbstractC7502g
    /* renamed from: e */
    public String mo20565e() {
        return "LLLL";
    }

    @Override // id.AbstractC7502g
    /* renamed from: f */
    public int mo20579f() {
        return 1;
    }

    @Override // id.AbstractC7502g
    /* renamed from: l */
    public Paint.Align mo20564l() {
        return Paint.Align.LEFT;
    }

    @Override // id.AbstractC7502g
    /* renamed from: o */
    public ArrayList<String> mo20563o() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, 0);
        for (int i = 0; i <= 11; i++) {
            arrayList.add(m20576i(calendar));
            calendar.add(2, 1);
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
