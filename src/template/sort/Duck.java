package template.sort;

public class Duck implements Comparable {
    int weight;

    public Duck(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Duck{" +
                "weight=" + weight +
                '}';
    }
}
