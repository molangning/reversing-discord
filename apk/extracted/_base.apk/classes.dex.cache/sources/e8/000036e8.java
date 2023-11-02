package p150i5;

import java.util.ArrayList;
import java.util.List;

/* renamed from: i5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7384b {

    /* renamed from: a */
    public static Boolean f19873a = Boolean.FALSE;

    /* renamed from: i5.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC7385a {
        /* renamed from: a */
        public abstract AbstractC7385a mo20800a(String str, int i);

        /* renamed from: b */
        public abstract AbstractC7385a mo20799b(String str, Object obj);

        /* renamed from: c */
        public abstract void mo20798c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i5.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7386b extends AbstractC7385a {

        /* renamed from: a */
        private long f19874a;

        public C7386b(long j) {
            this.f19874a = j;
        }

        @Override // p150i5.C7384b.AbstractC7385a
        /* renamed from: a */
        public AbstractC7385a mo20800a(String str, int i) {
            return this;
        }

        @Override // p150i5.C7384b.AbstractC7385a
        /* renamed from: b */
        public AbstractC7385a mo20799b(String str, Object obj) {
            return this;
        }

        @Override // p150i5.C7384b.AbstractC7385a
        /* renamed from: c */
        public void mo20798c() {
            C7382a.m20809g(this.f19874a);
        }
    }

    /* renamed from: i5.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7387c extends AbstractC7385a {

        /* renamed from: a */
        private String f19875a;

        /* renamed from: b */
        private long f19876b;

        /* renamed from: c */
        private List<String> f19877c = new ArrayList();

        public C7387c(long j, String str) {
            this.f19876b = j;
            this.f19875a = str;
        }

        /* renamed from: d */
        private void m20797d(String str, String str2) {
            List<String> list = this.f19877c;
            list.add(str + ": " + str2);
        }

        @Override // p150i5.C7384b.AbstractC7385a
        /* renamed from: a */
        public AbstractC7385a mo20800a(String str, int i) {
            m20797d(str, String.valueOf(i));
            return this;
        }

        @Override // p150i5.C7384b.AbstractC7385a
        /* renamed from: b */
        public AbstractC7385a mo20799b(String str, Object obj) {
            m20797d(str, String.valueOf(obj));
            return this;
        }

        @Override // p150i5.C7384b.AbstractC7385a
        /* renamed from: c */
        public void mo20798c() {
            String str;
            long j = this.f19876b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19875a);
            if (C7384b.f19873a.booleanValue() && this.f19877c.size() > 0) {
                str = " (" + C7388c.m20796a(", ", this.f19877c) + ")";
            } else {
                str = "";
            }
            sb2.append(str);
            C7382a.m20813c(j, sb2.toString());
        }
    }

    /* renamed from: a */
    public static AbstractC7385a m20802a(long j, String str) {
        return new C7387c(j, str);
    }

    /* renamed from: b */
    public static AbstractC7385a m20801b(long j) {
        return new C7386b(j);
    }
}