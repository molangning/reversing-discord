package p134ha;

import com.google.android.gms.tasks.Task;

/* renamed from: ha.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7044b extends IllegalStateException {
    private C7044b(String str, Throwable th2) {
        super(str, th2);
    }

    /* renamed from: a */
    public static IllegalStateException m21488a(Task<?> task) {
        String str;
        String str2;
        if (!task.mo27970n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception mo27974j = task.mo27974j();
        if (mo27974j != null) {
            str = "failure";
        } else if (task.mo27969o()) {
            str = "result ".concat(String.valueOf(task.mo27973k()));
        } else if (task.mo27971m()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        if (str.length() != 0) {
            str2 = "Complete with: ".concat(str);
        } else {
            str2 = new String("Complete with: ");
        }
        return new C7044b(str2, mo27974j);
    }
}
