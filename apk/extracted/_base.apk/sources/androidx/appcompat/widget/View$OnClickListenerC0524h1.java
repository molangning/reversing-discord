package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0946a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p001a0.AbstractC0009c;
import p052d.C5706a;
import p052d.C5711f;

/* renamed from: androidx.appcompat.widget.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class View$OnClickListenerC0524h1 extends AbstractC0009c implements View.OnClickListener {

    /* renamed from: A */
    private int f1834A;

    /* renamed from: B */
    private ColorStateList f1835B;

    /* renamed from: C */
    private int f1836C;

    /* renamed from: D */
    private int f1837D;

    /* renamed from: E */
    private int f1838E;

    /* renamed from: F */
    private int f1839F;

    /* renamed from: G */
    private int f1840G;

    /* renamed from: H */
    private int f1841H;

    /* renamed from: u */
    private final SearchView f1842u;

    /* renamed from: v */
    private final SearchableInfo f1843v;

    /* renamed from: w */
    private final Context f1844w;

    /* renamed from: x */
    private final WeakHashMap<String, Drawable.ConstantState> f1845x;

    /* renamed from: y */
    private final int f1846y;

    /* renamed from: z */
    private boolean f1847z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0525a {

        /* renamed from: a */
        public final TextView f1848a;

        /* renamed from: b */
        public final TextView f1849b;

        /* renamed from: c */
        public final ImageView f1850c;

        /* renamed from: d */
        public final ImageView f1851d;

        /* renamed from: e */
        public final ImageView f1852e;

        public C0525a(View view) {
            this.f1848a = (TextView) view.findViewById(16908308);
            this.f1849b = (TextView) view.findViewById(16908309);
            this.f1850c = (ImageView) view.findViewById(16908295);
            this.f1851d = (ImageView) view.findViewById(16908296);
            this.f1852e = (ImageView) view.findViewById(C5711f.f16176r);
        }
    }

    public View$OnClickListenerC0524h1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1847z = false;
        this.f1834A = 1;
        this.f1836C = -1;
        this.f1837D = -1;
        this.f1838E = -1;
        this.f1839F = -1;
        this.f1840G = -1;
        this.f1841H = -1;
        this.f1842u = searchView;
        this.f1843v = searchableInfo;
        this.f1846y = searchView.getSuggestionCommitIconResId();
        this.f1844w = context;
        this.f1845x = weakHashMap;
    }

    /* renamed from: A */
    private void m39876A(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    /* renamed from: j */
    private Drawable m39871j(String str) {
        Drawable.ConstantState constantState = this.f1845x.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: k */
    private CharSequence m39870k(CharSequence charSequence) {
        if (this.f1835B == null) {
            TypedValue typedValue = new TypedValue();
            this.f1844w.getTheme().resolveAttribute(C5706a.f16044M, typedValue, true);
            this.f1835B = this.f1844w.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1835B, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: l */
    private Drawable m39869l(ComponentName componentName) {
        PackageManager packageManager = this.f1844w.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: m */
    private Drawable m39868m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1845x.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1845x.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1844w.getResources());
        }
        Drawable m39869l = m39869l(componentName);
        if (m39869l != null) {
            constantState = m39869l.getConstantState();
        }
        this.f1845x.put(flattenToShortString, constantState);
        return m39869l;
    }

    /* renamed from: n */
    public static String m39867n(Cursor cursor, String str) {
        return m39859v(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: o */
    private Drawable m39866o() {
        Drawable m39868m = m39868m(this.f1843v.getSearchActivity());
        if (m39868m != null) {
            return m39868m;
        }
        return this.f1844w.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: p */
    private Drawable m39865p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m39864q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1844w.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: r */
    private Drawable m39863r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1844w.getPackageName() + "/" + parseInt;
            Drawable m39871j = m39871j(str2);
            if (m39871j != null) {
                return m39871j;
            }
            Drawable m38399e = C0946a.m38399e(this.f1844w, parseInt);
            m39855z(str2, m38399e);
            return m38399e;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m39871j2 = m39871j(str);
            if (m39871j2 != null) {
                return m39871j2;
            }
            Drawable m39865p = m39865p(Uri.parse(str));
            m39855z(str, m39865p);
            return m39865p;
        }
    }

    /* renamed from: s */
    private Drawable m39862s(Cursor cursor) {
        int i = this.f1839F;
        if (i == -1) {
            return null;
        }
        Drawable m39863r = m39863r(cursor.getString(i));
        if (m39863r != null) {
            return m39863r;
        }
        return m39866o();
    }

    /* renamed from: t */
    private Drawable m39861t(Cursor cursor) {
        int i = this.f1840G;
        if (i == -1) {
            return null;
        }
        return m39863r(cursor.getString(i));
    }

    /* renamed from: v */
    private static String m39859v(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: x */
    private void m39857x(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: y */
    private void m39856y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: z */
    private void m39855z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1845x.put(str, drawable.getConstantState());
        }
    }

    @Override // p001a0.AbstractC0004a, p001a0.C0007b.InterfaceC0008a
    /* renamed from: a */
    public void mo39875a(Cursor cursor) {
        if (this.f1847z) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo39875a(cursor);
            if (cursor != null) {
                this.f1836C = cursor.getColumnIndex("suggest_text_1");
                this.f1837D = cursor.getColumnIndex("suggest_text_2");
                this.f1838E = cursor.getColumnIndex("suggest_text_2_url");
                this.f1839F = cursor.getColumnIndex("suggest_icon_1");
                this.f1840G = cursor.getColumnIndex("suggest_icon_2");
                this.f1841H = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p001a0.C0007b.InterfaceC0008a
    /* renamed from: b */
    public Cursor mo39874b(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.f1842u.getVisibility() == 0 && this.f1842u.getWindowVisibility() == 0) {
            try {
                Cursor m39860u = m39860u(this.f1843v, charSequence2, 50);
                if (m39860u != null) {
                    m39860u.getCount();
                    return m39860u;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p001a0.AbstractC0004a, p001a0.C0007b.InterfaceC0008a
    public CharSequence convertToString(Cursor cursor) {
        String m39867n;
        String m39867n2;
        if (cursor == null) {
            return null;
        }
        String m39867n3 = m39867n(cursor, "suggest_intent_query");
        if (m39867n3 != null) {
            return m39867n3;
        }
        if (this.f1843v.shouldRewriteQueryFromData() && (m39867n2 = m39867n(cursor, "suggest_intent_data")) != null) {
            return m39867n2;
        }
        if (!this.f1843v.shouldRewriteQueryFromText() || (m39867n = m39867n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m39867n;
    }

    @Override // p001a0.AbstractC0004a
    /* renamed from: d */
    public void mo39873d(View view, Context context, Cursor cursor) {
        int i;
        CharSequence m39859v;
        C0525a c0525a = (C0525a) view.getTag();
        int i2 = this.f1841H;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (c0525a.f1848a != null) {
            m39856y(c0525a.f1848a, m39859v(cursor, this.f1836C));
        }
        if (c0525a.f1849b != null) {
            String m39859v2 = m39859v(cursor, this.f1838E);
            if (m39859v2 != null) {
                m39859v = m39870k(m39859v2);
            } else {
                m39859v = m39859v(cursor, this.f1837D);
            }
            if (TextUtils.isEmpty(m39859v)) {
                TextView textView = c0525a.f1848a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c0525a.f1848a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c0525a.f1848a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c0525a.f1848a.setMaxLines(1);
                }
            }
            m39856y(c0525a.f1849b, m39859v);
        }
        ImageView imageView = c0525a.f1850c;
        if (imageView != null) {
            m39857x(imageView, m39862s(cursor), 4);
        }
        ImageView imageView2 = c0525a.f1851d;
        if (imageView2 != null) {
            m39857x(imageView2, m39861t(cursor), 8);
        }
        int i3 = this.f1834A;
        if (i3 != 2 && (i3 != 1 || (i & 1) == 0)) {
            c0525a.f1852e.setVisibility(8);
            return;
        }
        c0525a.f1852e.setVisibility(0);
        c0525a.f1852e.setTag(c0525a.f1848a.getText());
        c0525a.f1852e.setOnClickListener(this);
    }

    @Override // p001a0.AbstractC0009c, p001a0.AbstractC0004a
    /* renamed from: g */
    public View mo39872g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo39872g = super.mo39872g(context, cursor, viewGroup);
        mo39872g.setTag(new C0525a(mo39872g));
        ((ImageView) mo39872g.findViewById(C5711f.f16176r)).setImageResource(this.f1846y);
        return mo39872g;
    }

    @Override // p001a0.AbstractC0004a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo41403f = mo41403f(this.f1844w, mo41404c(), viewGroup);
            if (mo41403f != null) {
                ((C0525a) mo41403f.getTag()).f1848a.setText(e.toString());
            }
            return mo41403f;
        }
    }

    @Override // p001a0.AbstractC0004a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo39872g = mo39872g(this.f1844w, mo41404c(), viewGroup);
            if (mo39872g != null) {
                ((C0525a) mo39872g.getTag()).f1848a.setText(e.toString());
            }
            return mo39872g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m39876A(mo41404c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m39876A(mo41404c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1842u.m40114S((CharSequence) tag);
        }
    }

    /* renamed from: q */
    Drawable m39864q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1844w.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* renamed from: u */
    Cursor m39860u(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1844w.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: w */
    public void m39858w(int i) {
        this.f1834A = i;
    }
}
