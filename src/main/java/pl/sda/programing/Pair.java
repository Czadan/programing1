package pl.sda.programing;

public class Pair {

    private final int index;
    private final int value;

    public Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (index != pair.index) return false;
        return value == pair.value;
    }

    @Override
    public int hashCode() {
        int result = index;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "index=" + index +
                ", value=" + value +
                '}';
    }
}
