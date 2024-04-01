package generics;

public class Box<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public T setContent(T content) {
        this.content = content;
    }
}
