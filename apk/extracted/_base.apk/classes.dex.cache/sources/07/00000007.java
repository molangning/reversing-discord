package p001a0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: a0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0007b extends Filter {

    /* renamed from: a */
    InterfaceC0008a f12a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0008a {
        /* renamed from: a */
        void mo39875a(Cursor cursor);

        /* renamed from: b */
        Cursor mo39874b(CharSequence charSequence);

        /* renamed from: c */
        Cursor mo41404c();

        CharSequence convertToString(Cursor cursor);
    }

    public C0007b(InterfaceC0008a interfaceC0008a) {
        this.f12a = interfaceC0008a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f12a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo39874b = this.f12a.mo39874b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo39874b != null) {
            filterResults.count = mo39874b.getCount();
            filterResults.values = mo39874b;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo41404c = this.f12a.mo41404c();
        Object obj = filterResults.values;
        if (obj != null && obj != mo41404c) {
            this.f12a.mo39875a((Cursor) obj);
        }
    }
}