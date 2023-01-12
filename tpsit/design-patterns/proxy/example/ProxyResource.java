public class ProxyResource extends Resource {
    private Resource res;
    private TimeConsumingResource original;

    public ProxyResource(String url) {
        original = new TimeConsumingResource(url);
        res = this;
    }

    Resource get() {
        if (original.isReady()) {
            res = original;
        }
        return res;
    }
}