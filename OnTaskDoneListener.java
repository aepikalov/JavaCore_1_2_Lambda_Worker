package JavaCore_1_2_Lambda_Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
