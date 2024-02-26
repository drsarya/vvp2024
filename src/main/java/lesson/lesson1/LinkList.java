package lesson.lesson1;

/**
 * Односвязный список
 */
public class LinkList<T> {

    /**
     * Ссылка на начало списка
     */
    private LinkNode<T> root;

    public LinkList(LinkNode<T> root) {
        this.root = root;
    }

    /**
     * Добавить элемент в конец списка
     *
     * @param el элемент
     */
    public void add(LinkNode<T> el) {
    }

    /**
     * Получить размер списка
     *
     * @return размер списка
     */
    public int size() {
        int n = 0;
        LinkNode<T> current = root;
        while (current != null) {
            current = current.getNext();
            n++;
        }
        return n;
    }

    /**
     * Получить элемент по индексу
     *
     * @param ind индекс элемента
     * @return элемент списка
     */
    public LinkNode<T> get(int ind) {
        return null;
    }

    /**
     * Удалить элемент по индексу
     *
     * @param ind индекс
     */
    public void remove(int ind) {
        Utils.checkCorrectIndex(ind, size());
        LinkNode<T> current = root;
        LinkNode<T> prev = null;
        int currentPosition = 0;

        // искомый элемент
        while (currentPosition != ind) {
            prev = current;
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                throw new IllegalArgumentException();
            }
            currentPosition++;
        }

        if (prev == null) {
            // изменить корень
            root = current.getNext();
        } else {
            prev.setNext(current.getNext());
        }
    }
}
