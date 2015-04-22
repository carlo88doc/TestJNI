package reply.jnitest;

public class NativeConnector {

    public native String getText();

    public String getNativeText(){
        return getText();
    }
}
