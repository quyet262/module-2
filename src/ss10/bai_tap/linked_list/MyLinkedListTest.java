package ss10.bai_tap.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.add(1, 4);
        System.out.println("Danh sách sau khi thêm phần tử: " + list);

        list.remove(0);
        System.out.println("Danh sách sau khi xóa phần tử đầu tiên: " + list);
        list.remove((Integer) 3);
        System.out.println("Danh sách sau khi xóa phần tử 3: " + list);

        System.out.println("Phần tử tại vị trí 0: " + list.get(0));

        System.out.println("Kích thước của danh sách: " + list.size());

        System.out.println("Danh sách có chứa phần tử 2 không: " + list.contains(2));

        System.out.println("Phần tử đầu tiên: " + list.getFirst());
        System.out.println("Phần tử cuối cùng: " + list.getLast());

        list.clear();
        System.out.println("Danh sách sau khi xóa tất cả phần tử: " + list);
    }
}
