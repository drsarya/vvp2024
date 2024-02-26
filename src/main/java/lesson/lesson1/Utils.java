package lesson.lesson1;

public class Utils {

    /**
     * ��������� ������������ ��������� �������
     *
     * @param index ������
     * @param size  ������ ������
     */
    public static void checkCorrectIndex(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }
}
