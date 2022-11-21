package bridge.domain;

import java.util.List;
import java.util.stream.Stream;

public class Bridges {
    List<Bridge> bridges;

    public Bridges(List<Bridge> bridges) {
        this.bridges = bridges;
    }

    public Stream<Bridge> getStream() {
        return bridges.stream();
    }
}
