package chap57;

public class GenericBox<T> {
    // T 타입의 물건 하나를 보관할 변수
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}
