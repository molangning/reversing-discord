package com.facebook.hermes.intl;

import android.text.TextUtils;
import com.facebook.hermes.intl.C3683k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p128h4.C6947l;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3679h implements InterfaceC6895b<Locale> {

    /* renamed from: a */
    private Locale f10227a;

    /* renamed from: b */
    private C3683k f10228b;

    /* renamed from: c */
    private boolean f10229c;

    private C3679h(Locale locale) {
        this.f10228b = null;
        this.f10229c = false;
        this.f10227a = locale;
    }

    /* renamed from: i */
    public static InterfaceC6895b<Locale> m31267i() {
        return new C3679h(Locale.getDefault());
    }

    /* renamed from: j */
    public static InterfaceC6895b<Locale> m31266j(String str) {
        return new C3679h(str);
    }

    /* renamed from: k */
    private void m31265k() {
        if (this.f10229c) {
            try {
                m31261o();
                this.f10229c = false;
            } catch (RuntimeException e) {
                throw new C6947l(e.getMessage());
            }
        }
    }

    /* renamed from: l */
    private void m31264l() {
        if (this.f10228b == null) {
            this.f10228b = C3676f.m31284f(this.f10227a.toLanguageTag());
        }
    }

    /* renamed from: o */
    private void m31261o() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = this.f10228b.f10233a.f10240a;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append(this.f10228b.f10233a.f10240a);
        }
        String str2 = this.f10228b.f10233a.f10241b;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append(this.f10228b.f10233a.f10241b);
        }
        String str3 = this.f10228b.f10233a.f10242c;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append(this.f10228b.f10233a.f10242c);
        }
        C3676f.m31277m(stringBuffer2, stringBuffer3, stringBuffer4);
        if (stringBuffer2.length() > 0) {
            stringBuffer.append(stringBuffer2.toString());
        }
        if (stringBuffer3.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (stringBuffer4.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(C3676f.m31276n(stringBuffer4));
        }
        ArrayList<String> arrayList = this.f10228b.f10233a.f10243d;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f10228b.f10233a.f10243d));
        }
        TreeMap<Character, ArrayList<String>> treeMap = this.f10228b.f10238f;
        if (treeMap != null) {
            for (Map.Entry<Character, ArrayList<String>> entry : treeMap.entrySet()) {
                stringBuffer.append("-");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("-");
                stringBuffer.append(TextUtils.join("-", entry.getValue()));
            }
        }
        C3683k c3683k = this.f10228b;
        if (c3683k.f10236d != null || c3683k.f10237e != null) {
            stringBuffer.append("-");
            stringBuffer.append('t');
            stringBuffer.append("-");
            StringBuffer stringBuffer5 = new StringBuffer();
            C3683k.C3684a c3684a = this.f10228b.f10236d;
            if (c3684a != null) {
                stringBuffer5.append(c3684a.f10240a);
                if (this.f10228b.f10236d.f10241b != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f10228b.f10236d.f10241b);
                }
                if (this.f10228b.f10236d.f10242c != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f10228b.f10236d.f10242c);
                }
                ArrayList<String> arrayList2 = this.f10228b.f10236d.f10243d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(TextUtils.join("-", this.f10228b.f10236d.f10243d));
                }
            }
            TreeMap<String, ArrayList<String>> treeMap2 = this.f10228b.f10237e;
            if (treeMap2 != null) {
                for (Map.Entry<String, ArrayList<String>> entry2 : treeMap2.entrySet()) {
                    stringBuffer5.append("-" + entry2.getKey());
                    Iterator<String> it = entry2.getValue().iterator();
                    while (it.hasNext()) {
                        stringBuffer5.append("-" + it.next());
                    }
                }
                if (stringBuffer5.length() > 0 && stringBuffer5.charAt(0) == '-') {
                    stringBuffer5.deleteCharAt(0);
                }
            }
            stringBuffer.append(stringBuffer5.toString());
        }
        C3683k c3683k2 = this.f10228b;
        if (c3683k2.f10234b != null || c3683k2.f10235c != null) {
            stringBuffer.append("-");
            stringBuffer.append('u');
            stringBuffer.append("-");
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList<CharSequence> arrayList3 = this.f10228b.f10234b;
            if (arrayList3 != null) {
                stringBuffer6.append(TextUtils.join("-", arrayList3));
            }
            TreeMap<String, ArrayList<String>> treeMap3 = this.f10228b.f10235c;
            if (treeMap3 != null) {
                for (Map.Entry<String, ArrayList<String>> entry3 : treeMap3.entrySet()) {
                    stringBuffer6.append("-" + entry3.getKey());
                    Iterator<String> it2 = entry3.getValue().iterator();
                    while (it2.hasNext()) {
                        stringBuffer6.append("-" + it2.next());
                    }
                }
            }
            if (stringBuffer6.length() > 0 && stringBuffer6.charAt(0) == '-') {
                stringBuffer6.deleteCharAt(0);
            }
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.f10228b.f10239g != null) {
            stringBuffer.append("-");
            stringBuffer.append('x');
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f10228b.f10239g));
        }
        try {
            this.f10227a = Locale.forLanguageTag(stringBuffer.toString());
            this.f10229c = false;
        } catch (RuntimeException e) {
            throw new C6947l(e.getMessage());
        }
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: a */
    public HashMap<String, String> mo21551a() {
        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String, ArrayList<String>> treeMap = this.f10228b.f10235c;
        if (treeMap != null) {
            for (String str : treeMap.keySet()) {
                hashMap.put(str, TextUtils.join("-", this.f10228b.f10235c.get(str)));
            }
        }
        return hashMap;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: b */
    public ArrayList<String> mo21550b(String str) {
        ArrayList<String> arrayList;
        m31265k();
        m31264l();
        TreeMap<String, ArrayList<String>> treeMap = this.f10228b.f10235c;
        if (treeMap != null && (arrayList = treeMap.get(str)) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: d */
    public InterfaceC6895b<Locale> mo21548d() {
        m31265k();
        return new C3679h(this.f10227a);
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: e */
    public String mo21547e() {
        return mo21549c().toLanguageTag();
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: f */
    public void mo21546f(String str, ArrayList<String> arrayList) {
        m31265k();
        m31264l();
        C3683k c3683k = this.f10228b;
        if (c3683k.f10235c == null) {
            c3683k.f10235c = new TreeMap<>();
        }
        if (!this.f10228b.f10235c.containsKey(str)) {
            this.f10228b.f10235c.put(str, new ArrayList<>());
        }
        this.f10228b.f10235c.get(str).clear();
        this.f10228b.f10235c.get(str).addAll(arrayList);
        this.f10229c = true;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: g */
    public String mo21545g() {
        return mo21544h().toLanguageTag();
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: m */
    public Locale mo21544h() {
        m31265k();
        return this.f10227a;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: n */
    public Locale mo21549c() {
        m31265k();
        m31264l();
        C3683k c3683k = new C3683k();
        c3683k.f10233a = this.f10228b.f10233a;
        return new C3679h(c3683k).mo21544h();
    }

    private C3679h(String str) {
        this.f10227a = null;
        this.f10228b = null;
        this.f10229c = false;
        this.f10228b = C3676f.m31284f(str);
        m31261o();
    }

    private C3679h(C3683k c3683k) {
        this.f10227a = null;
        this.f10229c = false;
        this.f10228b = c3683k;
        m31261o();
    }
}
