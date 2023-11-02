package p276p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p394w2.C13379j;

/* renamed from: p2.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11374b implements InterfaceC11373a {

    /* renamed from: a */
    private final File f29614a;

    private C11374b(File file) {
        this.f29614a = (File) C13379j.m2677g(file);
    }

    /* renamed from: b */
    public static C11374b m8209b(File file) {
        return new C11374b(file);
    }

    /* renamed from: c */
    public static C11374b m8208c(File file) {
        if (file != null) {
            return new C11374b(file);
        }
        return null;
    }

    @Override // p276p2.InterfaceC11373a
    /* renamed from: a */
    public InputStream mo8210a() {
        return new FileInputStream(this.f29614a);
    }

    /* renamed from: d */
    public File m8207d() {
        return this.f29614a;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C11374b)) {
            return this.f29614a.equals(((C11374b) obj).f29614a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29614a.hashCode();
    }

    @Override // p276p2.InterfaceC11373a
    public long size() {
        return this.f29614a.length();
    }
}