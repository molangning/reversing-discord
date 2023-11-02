package androidx.sharetarget;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.util.Log;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.C1825a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p253o0.C10920a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {

    /* renamed from: androidx.sharetarget.ChooserTargetServiceCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1824a implements Comparable<C1824a> {

        /* renamed from: j */
        private final ShortcutInfoCompat f4994j;

        /* renamed from: k */
        private final ComponentName f4995k;

        C1824a(ShortcutInfoCompat shortcutInfoCompat, ComponentName componentName) {
            this.f4994j = shortcutInfoCompat;
            this.f4995k = componentName;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C1824a c1824a) {
            return m35299b().m38348n() - c1824a.m35299b().m38348n();
        }

        /* renamed from: b */
        ShortcutInfoCompat m35299b() {
            return this.f4994j;
        }

        /* renamed from: c */
        ComponentName m35298c() {
            return this.f4995k;
        }
    }

    /* renamed from: a */
    static List<ChooserTarget> m35301a(C10920a c10920a, List<C1824a> list) {
        IconCompat iconCompat;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        int m38348n = list.get(0).m35299b().m38348n();
        float f = 1.0f;
        for (C1824a c1824a : list) {
            ShortcutInfoCompat m35299b = c1824a.m35299b();
            Icon icon = null;
            try {
                iconCompat = c10920a.m9537k(m35299b.m38355g());
            } catch (Exception e) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e);
                iconCompat = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.intent.extra.shortcut.ID", m35299b.m38355g());
            if (m38348n != m35299b.m38348n()) {
                f -= 0.01f;
                m38348n = m35299b.m38348n();
            }
            CharSequence m38347o = m35299b.m38347o();
            if (iconCompat != null) {
                icon = iconCompat.m38113y();
            }
            arrayList.add(new ChooserTarget(m38347o, icon, f, c1824a.m35298c(), bundle));
        }
        return arrayList;
    }

    @Override // android.service.chooser.ChooserTargetService
    public List<ChooserTarget> onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        Context applicationContext = getApplicationContext();
        ArrayList<C1825a> m35296b = C1827b.m35296b(applicationContext);
        ArrayList arrayList = new ArrayList();
        for (C1825a c1825a : m35296b) {
            if (c1825a.f4997b.equals(componentName.getClassName())) {
                C1825a.C1826a[] c1826aArr = c1825a.f4996a;
                int length = c1826aArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (intentFilter.hasDataType(c1826aArr[i].f5005g)) {
                        arrayList.add(c1825a);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        C10920a m9538j = C10920a.m9538j(applicationContext);
        try {
            List<ShortcutInfoCompat> mo9546b = m9538j.mo9546b();
            if (mo9546b != null && !mo9546b.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (ShortcutInfoCompat shortcutInfoCompat : mo9546b) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C1825a c1825a2 = (C1825a) it.next();
                            if (shortcutInfoCompat.m38358d().containsAll(Arrays.asList(c1825a2.f4998c))) {
                                arrayList2.add(new C1824a(shortcutInfoCompat, new ComponentName(applicationContext.getPackageName(), c1825a2.f4997b)));
                                break;
                            }
                        }
                    }
                }
                return m35301a(m9538j, arrayList2);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e);
            return Collections.emptyList();
        }
    }
}