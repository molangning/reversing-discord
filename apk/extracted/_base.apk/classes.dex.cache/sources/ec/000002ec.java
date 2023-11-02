package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ConstraintLayoutStates {

    /* renamed from: a */
    private final ConstraintLayout f2462a;

    /* renamed from: b */
    ConstraintSet f2463b;

    /* renamed from: c */
    int f2464c = -1;

    /* renamed from: d */
    int f2465d = -1;

    /* renamed from: e */
    private SparseArray<C0663a> f2466e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<ConstraintSet> f2467f = new SparseArray<>();

    /* renamed from: g */
    private ConstraintsChangedListener f2468g = null;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0663a {

        /* renamed from: a */
        int f2469a;

        /* renamed from: b */
        ArrayList<C0664b> f2470b = new ArrayList<>();

        /* renamed from: c */
        int f2471c;

        /* renamed from: d */
        ConstraintSet f2472d;

        public C0663a(Context context, XmlPullParser xmlPullParser) {
            this.f2471c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0678f.f2650E4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0678f.f2656F4) {
                    this.f2469a = obtainStyledAttributes.getResourceId(index, this.f2469a);
                } else if (index == C0678f.f2662G4) {
                    this.f2471c = obtainStyledAttributes.getResourceId(index, this.f2471c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2471c);
                    context.getResources().getResourceName(this.f2471c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f2472d = constraintSet;
                        constraintSet.m39278f(context, this.f2471c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m39286a(C0664b c0664b) {
            this.f2470b.add(c0664b);
        }

        /* renamed from: b */
        public int m39285b(float f, float f2) {
            for (int i = 0; i < this.f2470b.size(); i++) {
                if (this.f2470b.get(i).m39284a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0664b {

        /* renamed from: a */
        float f2473a;

        /* renamed from: b */
        float f2474b;

        /* renamed from: c */
        float f2475c;

        /* renamed from: d */
        float f2476d;

        /* renamed from: e */
        int f2477e;

        /* renamed from: f */
        ConstraintSet f2478f;

        public C0664b(Context context, XmlPullParser xmlPullParser) {
            this.f2473a = Float.NaN;
            this.f2474b = Float.NaN;
            this.f2475c = Float.NaN;
            this.f2476d = Float.NaN;
            this.f2477e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0678f.f2783a5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0678f.f2790b5) {
                    this.f2477e = obtainStyledAttributes.getResourceId(index, this.f2477e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2477e);
                    context.getResources().getResourceName(this.f2477e);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f2478f = constraintSet;
                        constraintSet.m39278f(context, this.f2477e);
                    }
                } else if (index == C0678f.f2797c5) {
                    this.f2476d = obtainStyledAttributes.getDimension(index, this.f2476d);
                } else if (index == C0678f.f2804d5) {
                    this.f2474b = obtainStyledAttributes.getDimension(index, this.f2474b);
                } else if (index == C0678f.f2811e5) {
                    this.f2475c = obtainStyledAttributes.getDimension(index, this.f2475c);
                } else if (index == C0678f.f2818f5) {
                    this.f2473a = obtainStyledAttributes.getDimension(index, this.f2473a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m39284a(float f, float f2) {
            if (!Float.isNaN(this.f2473a) && f < this.f2473a) {
                return false;
            }
            if (!Float.isNaN(this.f2474b) && f2 < this.f2474b) {
                return false;
            }
            if (!Float.isNaN(this.f2475c) && f > this.f2475c) {
                return false;
            }
            if (!Float.isNaN(this.f2476d) && f2 > this.f2476d) {
                return false;
            }
            return true;
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2462a = constraintLayout;
        m39290a(context, i);
    }

    /* renamed from: a */
    private void m39290a(Context context, int i) {
        char c;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0663a c0663a = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0 && c != 1) {
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        Log.v("ConstraintLayoutStates", "unknown tag " + name);
                                        continue;
                                    } else {
                                        m39289b(context, xml);
                                        continue;
                                    }
                                } else {
                                    C0664b c0664b = new C0664b(context, xml);
                                    if (c0663a != null) {
                                        c0663a.m39286a(c0664b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                c0663a = new C0663a(context, xml);
                                this.f2466e.put(c0663a.f2469a, c0663a);
                                continue;
                            }
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m39289b(Context context, XmlPullParser xmlPullParser) {
        int i;
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.m39270n(context, xmlPullParser);
                this.f2467f.put(i, constraintSet);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m39288c(ConstraintsChangedListener constraintsChangedListener) {
        this.f2468g = constraintsChangedListener;
    }

    /* renamed from: d */
    public void m39287d(int i, float f, float f2) {
        ConstraintSet constraintSet;
        int i2;
        C0663a c0663a;
        int m39285b;
        ConstraintSet constraintSet2;
        int i3;
        int i4 = this.f2464c;
        if (i4 == i) {
            if (i == -1) {
                c0663a = this.f2466e.valueAt(0);
            } else {
                c0663a = this.f2466e.get(i4);
            }
            int i5 = this.f2465d;
            if ((i5 != -1 && c0663a.f2470b.get(i5).m39284a(f, f2)) || this.f2465d == (m39285b = c0663a.m39285b(f, f2))) {
                return;
            }
            if (m39285b == -1) {
                constraintSet2 = this.f2463b;
            } else {
                constraintSet2 = c0663a.f2470b.get(m39285b).f2478f;
            }
            if (m39285b == -1) {
                i3 = c0663a.f2471c;
            } else {
                i3 = c0663a.f2470b.get(m39285b).f2477e;
            }
            if (constraintSet2 == null) {
                return;
            }
            this.f2465d = m39285b;
            ConstraintsChangedListener constraintsChangedListener = this.f2468g;
            if (constraintsChangedListener != null) {
                constraintsChangedListener.m39250b(-1, i3);
            }
            constraintSet2.m39281c(this.f2462a);
            ConstraintsChangedListener constraintsChangedListener2 = this.f2468g;
            if (constraintsChangedListener2 != null) {
                constraintsChangedListener2.m39251a(-1, i3);
                return;
            }
            return;
        }
        this.f2464c = i;
        C0663a c0663a2 = this.f2466e.get(i);
        int m39285b2 = c0663a2.m39285b(f, f2);
        if (m39285b2 == -1) {
            constraintSet = c0663a2.f2472d;
        } else {
            constraintSet = c0663a2.f2470b.get(m39285b2).f2478f;
        }
        if (m39285b2 == -1) {
            i2 = c0663a2.f2471c;
        } else {
            i2 = c0663a2.f2470b.get(m39285b2).f2477e;
        }
        if (constraintSet == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f2465d = m39285b2;
        ConstraintsChangedListener constraintsChangedListener3 = this.f2468g;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.m39250b(i, i2);
        }
        constraintSet.m39281c(this.f2462a);
        ConstraintsChangedListener constraintsChangedListener4 = this.f2468g;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.m39251a(i, i2);
        }
    }
}