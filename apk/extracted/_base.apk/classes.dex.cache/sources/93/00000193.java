package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuC0409o;
import androidx.appcompat.view.menu.MenuItemC0395j;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import p391w.InterfaceMenuC13351a;
import p391w.InterfaceMenuItemC13352b;

/* renamed from: androidx.appcompat.view.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0362e extends android.view.ActionMode {

    /* renamed from: a */
    final Context f1153a;

    /* renamed from: b */
    final ActionMode f1154b;

    /* renamed from: androidx.appcompat.view.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0363a implements ActionMode.Callback {

        /* renamed from: a */
        final ActionMode.Callback f1155a;

        /* renamed from: b */
        final Context f1156b;

        /* renamed from: c */
        final ArrayList<C0362e> f1157c = new ArrayList<>();

        /* renamed from: d */
        final SimpleArrayMap<Menu, Menu> f1158d = new SimpleArrayMap<>();

        public C0363a(Context context, ActionMode.Callback callback) {
            this.f1156b = context;
            this.f1155a = callback;
        }

        /* renamed from: f */
        private Menu m40460f(Menu menu) {
            Menu menu2 = this.f1158d.get(menu);
            if (menu2 == null) {
                MenuC0409o menuC0409o = new MenuC0409o(this.f1156b, (InterfaceMenuC13351a) menu);
                this.f1158d.put(menu, menuC0409o);
                return menuC0409o;
            }
            return menu2;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: a */
        public void mo40465a(ActionMode actionMode) {
            this.f1155a.onDestroyActionMode(m40461e(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: b */
        public boolean mo40464b(ActionMode actionMode, Menu menu) {
            return this.f1155a.onCreateActionMode(m40461e(actionMode), m40460f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: c */
        public boolean mo40463c(ActionMode actionMode, MenuItem menuItem) {
            return this.f1155a.onActionItemClicked(m40461e(actionMode), new MenuItemC0395j(this.f1156b, (InterfaceMenuItemC13352b) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: d */
        public boolean mo40462d(ActionMode actionMode, Menu menu) {
            return this.f1155a.onPrepareActionMode(m40461e(actionMode), m40460f(menu));
        }

        /* renamed from: e */
        public android.view.ActionMode m40461e(ActionMode actionMode) {
            int size = this.f1157c.size();
            for (int i = 0; i < size; i++) {
                C0362e c0362e = this.f1157c.get(i);
                if (c0362e != null && c0362e.f1154b == actionMode) {
                    return c0362e;
                }
            }
            C0362e c0362e2 = new C0362e(this.f1156b, actionMode);
            this.f1157c.add(c0362e2);
            return c0362e2;
        }
    }

    public C0362e(Context context, ActionMode actionMode) {
        this.f1153a = context;
        this.f1154b = actionMode;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1154b.mo40479c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1154b.mo40478d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0409o(this.f1153a, (InterfaceMenuC13351a) this.f1154b.mo40477e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1154b.mo40476f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1154b.mo40475g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1154b.m40497h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1154b.mo40474i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1154b.m40496j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1154b.mo40473k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1154b.mo40472l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1154b.mo40471m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1154b.mo40469o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1154b.m40495p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1154b.mo40467r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f1154b.mo40466s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f1154b.mo40470n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f1154b.mo40468q(i);
    }
}