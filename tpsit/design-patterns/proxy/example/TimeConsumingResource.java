public class TimeConsumingResource extends Resource {
    public TimeConsumingResource(String url) {
        // starti downloading  resource
    }

    public boolean isReady() {
        return false;
    }
}