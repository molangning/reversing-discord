package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0670a {

    /* renamed from: a */
    String f2580a;

    /* renamed from: b */
    private EnumC0672b f2581b;

    /* renamed from: c */
    private int f2582c;

    /* renamed from: d */
    private float f2583d;

    /* renamed from: e */
    private String f2584e;

    /* renamed from: f */
    boolean f2585f;

    /* renamed from: g */
    private int f2586g;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C0671a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2587a;

        static {
            int[] iArr = new int[EnumC0672b.values().length];
            f2587a = iArr;
            try {
                iArr[EnumC0672b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2587a[EnumC0672b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2587a[EnumC0672b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2587a[EnumC0672b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2587a[EnumC0672b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2587a[EnumC0672b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2587a[EnumC0672b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC0672b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0670a(String str, EnumC0672b enumC0672b, Object obj) {
        this.f2580a = str;
        this.f2581b = enumC0672b;
        m39246d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0670a> m39249a(HashMap<String, C0670a> hashMap, View view) {
        HashMap<String, C0670a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0670a c0670a = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new C0670a(c0670a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new C0670a(c0670a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m39248b(Context context, XmlPullParser xmlPullParser, HashMap<String, C0670a> hashMap) {
        EnumC0672b enumC0672b;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0678f.f2630B2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0672b enumC0672b2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0678f.f2636C2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0678f.f2642D2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0672b2 = EnumC0672b.BOOLEAN_TYPE;
            } else {
                if (index == C0678f.f2654F2) {
                    enumC0672b = EnumC0672b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0678f.f2648E2) {
                    enumC0672b = EnumC0672b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C0678f.f2678J2) {
                    enumC0672b = EnumC0672b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C0678f.f2660G2) {
                    enumC0672b = EnumC0672b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0678f.f2666H2) {
                    enumC0672b = EnumC0672b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0678f.f2672I2) {
                    enumC0672b = EnumC0672b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0678f.f2684K2) {
                    enumC0672b = EnumC0672b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                enumC0672b2 = enumC0672b;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C0670a(str, enumC0672b2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m39247c(View view, HashMap<String, C0670a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0670a c0670a = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C0671a.f2587a[c0670a.f2581b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0670a.f2586g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0670a.f2586g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0670a.f2582c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0670a.f2583d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0670a.f2584e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0670a.f2585f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0670a.f2583d));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m39246d(Object obj) {
        switch (C0671a.f2587a[this.f2581b.ordinal()]) {
            case 1:
            case 2:
                this.f2586g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f2582c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2583d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f2584e = (String) obj;
                return;
            case 6:
                this.f2585f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f2583d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C0670a(C0670a c0670a, Object obj) {
        this.f2580a = c0670a.f2580a;
        this.f2581b = c0670a.f2581b;
        m39246d(obj);
    }
}