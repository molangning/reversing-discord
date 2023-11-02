package p305qg;

import java.util.Collection;

/* renamed from: qg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC11902b extends InterfaceC11897a, InterfaceC11911d0 {

    /* renamed from: qg.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC11903a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: a */
        public boolean m6727a() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* renamed from: D0 */
    void mo4336D0(Collection<? extends InterfaceC11902b> collection);

    /* renamed from: X */
    InterfaceC11902b mo4317X(InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, EnumC11903a enumC11903a, boolean z);

    @Override // p305qg.InterfaceC11897a, p305qg.InterfaceC11947m
    /* renamed from: a */
    InterfaceC11902b mo4221a();

    @Override // p305qg.InterfaceC11897a
    /* renamed from: d */
    Collection<? extends InterfaceC11902b> mo4310d();

    /* renamed from: g */
    EnumC11903a mo4305g();
}
