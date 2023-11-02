package p001a0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p001a0.C0007b;

/* renamed from: a0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0004a extends BaseAdapter implements Filterable, C0007b.InterfaceC0008a {

    /* renamed from: j */
    protected boolean f2j;

    /* renamed from: k */
    protected boolean f3k;

    /* renamed from: l */
    protected Cursor f4l;

    /* renamed from: m */
    protected Context f5m;

    /* renamed from: n */
    protected int f6n;

    /* renamed from: o */
    protected C0005a f7o;

    /* renamed from: p */
    protected DataSetObserver f8p;

    /* renamed from: q */
    protected C0007b f9q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0005a extends ContentObserver {
        C0005a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC0004a.this.m41406h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0006b extends DataSetObserver {
        C0006b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0004a abstractC0004a = AbstractC0004a.this;
            abstractC0004a.f2j = true;
            abstractC0004a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0004a abstractC0004a = AbstractC0004a.this;
            abstractC0004a.f2j = false;
            abstractC0004a.notifyDataSetInvalidated();
        }
    }

    public AbstractC0004a(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        m41407e(context, cursor, i);
    }

    @Override // p001a0.C0007b.InterfaceC0008a
    /* renamed from: a */
    public void mo39875a(Cursor cursor) {
        Cursor m41405i = m41405i(cursor);
        if (m41405i != null) {
            m41405i.close();
        }
    }

    @Override // p001a0.C0007b.InterfaceC0008a
    /* renamed from: c */
    public Cursor mo41404c() {
        return this.f4l;
    }

    @Override // p001a0.C0007b.InterfaceC0008a
    public abstract CharSequence convertToString(Cursor cursor);

    /* renamed from: d */
    public abstract void mo39873d(View view, Context context, Cursor cursor);

    /* renamed from: e */
    void m41407e(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f3k = true;
        } else {
            this.f3k = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f4l = cursor;
        this.f2j = z;
        this.f5m = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f6n = i2;
        if ((i & 2) == 2) {
            this.f7o = new C0005a();
            this.f8p = new C0006b();
        } else {
            this.f7o = null;
            this.f8p = null;
        }
        if (z) {
            C0005a c0005a = this.f7o;
            if (c0005a != null) {
                cursor.registerContentObserver(c0005a);
            }
            DataSetObserver dataSetObserver = this.f8p;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: f */
    public abstract View mo41403f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: g */
    public abstract View mo39872g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f2j && (cursor = this.f4l) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f2j) {
            this.f4l.moveToPosition(i);
            if (view == null) {
                view = mo41403f(this.f5m, this.f4l, viewGroup);
            }
            mo39873d(view, this.f5m, this.f4l);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f9q == null) {
            this.f9q = new C0007b(this);
        }
        return this.f9q;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (this.f2j && (cursor = this.f4l) != null) {
            cursor.moveToPosition(i);
            return this.f4l;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f2j || (cursor = this.f4l) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f4l.getLong(this.f6n);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f2j) {
            if (this.f4l.moveToPosition(i)) {
                if (view == null) {
                    view = mo39872g(this.f5m, this.f4l, viewGroup);
                }
                mo39873d(view, this.f5m, this.f4l);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    protected void m41406h() {
        Cursor cursor;
        if (this.f3k && (cursor = this.f4l) != null && !cursor.isClosed()) {
            this.f2j = this.f4l.requery();
        }
    }

    /* renamed from: i */
    public Cursor m41405i(Cursor cursor) {
        Cursor cursor2 = this.f4l;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0005a c0005a = this.f7o;
            if (c0005a != null) {
                cursor2.unregisterContentObserver(c0005a);
            }
            DataSetObserver dataSetObserver = this.f8p;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f4l = cursor;
        if (cursor != null) {
            C0005a c0005a2 = this.f7o;
            if (c0005a2 != null) {
                cursor.registerContentObserver(c0005a2);
            }
            DataSetObserver dataSetObserver2 = this.f8p;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f6n = cursor.getColumnIndexOrThrow("_id");
            this.f2j = true;
            notifyDataSetChanged();
        } else {
            this.f6n = -1;
            this.f2j = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
