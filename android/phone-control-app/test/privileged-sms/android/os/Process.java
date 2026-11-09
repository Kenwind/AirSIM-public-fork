package android.os;

public final class Process {
    public static int uid = 2000;
    public static int myUid() { return uid; }
    public static int myPid() { return (int) ProcessHandle.current().pid(); }
}
