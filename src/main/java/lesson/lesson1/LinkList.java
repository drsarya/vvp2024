package lesson.lesson1;

/**
 * ����������� ������
 */
public class LinkList<T> {

    /**
     * ������ �� ������ ������
     */
    private LinkNode<T> root;

    public LinkList(LinkNode<T> root) {
        this.root = root;
    }

    /**
     * �������� ������� � ����� ������
     *
     * @param el �������
     */
    public void add(LinkNode<T> el) {
    }

    /**
     * �������� ������ ������
     *
     * @return ������ ������
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
     * �������� ������� �� �������
     *
     * @param ind ������ ��������
     * @return ������� ������
     */
    public LinkNode<T> get(int ind) {
        return null;
    }

    /**
     * ������� ������� �� �������
     *
     * @param ind ������
     */
    public void remove(int ind) {
        Utils.checkCorrectIndex(ind, size());
        LinkNode<T> current = root;
        LinkNode<T> prev = null;
        int currentPosition = 0;

        // ������� �������
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
            // �������� ������
            root = current.getNext();
        } else {
            prev.setNext(current.getNext());
        }
    }
}
