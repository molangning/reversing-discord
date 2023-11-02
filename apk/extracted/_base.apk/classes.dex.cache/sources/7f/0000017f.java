package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0344u {

    /* renamed from: a */
    private final Deque<WeakReference<XmlPullParser>> f1103a = new ArrayDeque();

    /* renamed from: b */
    private static boolean m40537b(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() == 3) {
                return true;
            }
            if (xmlPullParser.getEventType() == 1) {
                return true;
            }
            return false;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    /* renamed from: c */
    private static XmlPullParser m40536c(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (m40537b(xmlPullParser)) {
                deque.pop();
            } else {
                return xmlPullParser;
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m40535d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 != null && xmlPullParser != xmlPullParser2) {
            try {
                if (xmlPullParser2.getEventType() == 2) {
                    return "include".equals(xmlPullParser2.getName());
                }
                return false;
            } catch (XmlPullParserException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m40538a(AttributeSet attributeSet) {
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() == 1) {
                XmlPullParser m40536c = m40536c(this.f1103a);
                this.f1103a.push(new WeakReference<>(xmlPullParser));
                if (m40535d(xmlPullParser, m40536c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}