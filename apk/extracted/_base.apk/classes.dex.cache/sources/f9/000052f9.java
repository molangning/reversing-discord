package p449yh;

import ch.C2548g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9550o;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC12005z0;
import ph.C11638f;

/* renamed from: yh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14024a implements InterfaceC14029f {

    /* renamed from: b */
    private final List<InterfaceC14029f> f36040b;

    /* JADX WARN: Multi-variable type inference failed */
    public C14024a(List<? extends InterfaceC14029f> inner) {
        C9612q.m13917h(inner, "inner");
        this.f36040b = inner;
    }

    @Override // p449yh.InterfaceC14029f
    /* renamed from: a */
    public List<C11638f> mo873a(C2548g c2548g, InterfaceC11914e thisDescriptor) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(thisDescriptor, "thisDescriptor");
        List<InterfaceC14029f> list = this.f36040b;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC14029f interfaceC14029f : list) {
            C9550o.m14085y(arrayList, interfaceC14029f.mo873a(c2548g, thisDescriptor));
        }
        return arrayList;
    }

    @Override // p449yh.InterfaceC14029f
    /* renamed from: b */
    public void mo872b(C2548g c2548g, InterfaceC11914e thisDescriptor, List<InterfaceC11910d> result) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(thisDescriptor, "thisDescriptor");
        C9612q.m13917h(result, "result");
        for (InterfaceC14029f interfaceC14029f : this.f36040b) {
            interfaceC14029f.mo872b(c2548g, thisDescriptor, result);
        }
    }

    @Override // p449yh.InterfaceC14029f
    /* renamed from: c */
    public void mo871c(C2548g c2548g, InterfaceC11914e thisDescriptor, C11638f name, List<InterfaceC11914e> result) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(thisDescriptor, "thisDescriptor");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(result, "result");
        for (InterfaceC14029f interfaceC14029f : this.f36040b) {
            interfaceC14029f.mo871c(c2548g, thisDescriptor, name, result);
        }
    }

    @Override // p449yh.InterfaceC14029f
    /* renamed from: d */
    public void mo870d(C2548g c2548g, InterfaceC11914e thisDescriptor, C11638f name, Collection<InterfaceC12005z0> result) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(thisDescriptor, "thisDescriptor");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(result, "result");
        for (InterfaceC14029f interfaceC14029f : this.f36040b) {
            interfaceC14029f.mo870d(c2548g, thisDescriptor, name, result);
        }
    }

    @Override // p449yh.InterfaceC14029f
    /* renamed from: e */
    public void mo869e(C2548g c2548g, InterfaceC11914e thisDescriptor, C11638f name, Collection<InterfaceC12005z0> result) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(thisDescriptor, "thisDescriptor");
        C9612q.m13917h(name, "name");
        C9612q.m13917h(result, "result");
        for (InterfaceC14029f interfaceC14029f : this.f36040b) {
            interfaceC14029f.mo869e(c2548g, thisDescriptor, name, result);
        }
    }

    @Override // p449yh.InterfaceC14029f
    /* renamed from: f */
    public List<C11638f> mo868f(C2548g c2548g, InterfaceC11914e thisDescriptor) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(thisDescriptor, "thisDescriptor");
        List<InterfaceC14029f> list = this.f36040b;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC14029f interfaceC14029f : list) {
            C9550o.m14085y(arrayList, interfaceC14029f.mo868f(c2548g, thisDescriptor));
        }
        return arrayList;
    }

    @Override // p449yh.InterfaceC14029f
    /* renamed from: g */
    public List<C11638f> mo867g(C2548g c2548g, InterfaceC11914e thisDescriptor) {
        C9612q.m13917h(c2548g, "<this>");
        C9612q.m13917h(thisDescriptor, "thisDescriptor");
        List<InterfaceC14029f> list = this.f36040b;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC14029f interfaceC14029f : list) {
            C9550o.m14085y(arrayList, interfaceC14029f.mo867g(c2548g, thisDescriptor));
        }
        return arrayList;
    }
}