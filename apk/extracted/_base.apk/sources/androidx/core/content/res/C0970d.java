package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0970d {

    /* renamed from: a */
    private final Shader f3297a;

    /* renamed from: b */
    private final ColorStateList f3298b;

    /* renamed from: c */
    private int f3299c;

    private C0970d(Shader shader, ColorStateList colorStateList, int i) {
        this.f3297a = shader;
        this.f3298b = colorStateList;
        this.f3299c = i;
    }

    /* renamed from: a */
    private static C0970d m38285a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return m38283c(C0969c.m38292b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return m38282d(C0977f.m38252b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0970d m38284b(int i) {
        return new C0970d(null, null, i);
    }

    /* renamed from: c */
    static C0970d m38283c(ColorStateList colorStateList) {
        return new C0970d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0970d m38282d(Shader shader) {
        return new C0970d(shader, null, 0);
    }

    /* renamed from: g */
    public static C0970d m38279g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m38285a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int m38281e() {
        return this.f3299c;
    }

    /* renamed from: f */
    public Shader m38280f() {
        return this.f3297a;
    }

    /* renamed from: h */
    public boolean m38278h() {
        return this.f3297a != null;
    }

    /* renamed from: i */
    public boolean m38277i() {
        ColorStateList colorStateList;
        return this.f3297a == null && (colorStateList = this.f3298b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m38276j(int[] iArr) {
        if (m38277i()) {
            ColorStateList colorStateList = this.f3298b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3299c) {
                this.f3299c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m38275k(int i) {
        this.f3299c = i;
    }

    /* renamed from: l */
    public boolean m38274l() {
        return m38278h() || this.f3299c != 0;
    }
}
