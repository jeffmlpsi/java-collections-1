package collections1;

public class IterableExample implements java.lang.Iterable<String> {
    private String[] data;
    int size;

    public IterableExample() {
        data = new String[10];
        size = 0;
    }

    public void add(String value) {
        if (size < data.length) {
            data[size++] = value;
        }
    }

    @Override
    public java.util.Iterator<String> iterator() {
        return new java.util.Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public String next() {
                return data[currentIndex++];
            }
        };
    }
}
