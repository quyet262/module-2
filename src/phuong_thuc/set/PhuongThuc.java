package phuong_thuc.set;

public class PhuongThuc {
/*
1. add(E e)
Thêm phần tử e vào Set. Trả về true nếu Set không chứa phần tử đã tồn tại.

java
Copy code
Set<String> set = new HashSet<>();
boolean added = set.add("element");
2. addAll(Collection<? extends E> c)
Thêm tất cả các phần tử trong Collection c vào Set. Trả về true nếu Set thay đổi sau khi thêm các phần tử.

java
Copy code
Set<String> set = new HashSet<>();
Collection<String> collection = Arrays.asList("element1", "element2");
set.addAll(collection);
3. clear()
Xóa tất cả các phần tử khỏi Set.

java
Copy code
Set<String> set = new HashSet<>();
set.clear();
4. contains(Object o)
Kiểm tra xem Set có chứa phần tử o hay không. Trả về true nếu Set chứa phần tử này.

java
Copy code
Set<String> set = new HashSet<>();
boolean contains = set.contains("element");
5. containsAll(Collection<?> c)
Kiểm tra xem Set có chứa tất cả các phần tử trong Collection c hay không. Trả về true nếu Set chứa tất cả các phần tử này.

java
Copy code
Set<String> set = new HashSet<>();
Collection<String> collection = Arrays.asList("element1", "element2");
boolean containsAll = set.containsAll(collection);
6. isEmpty()
Kiểm tra xem Set có trống không. Trả về true nếu Set không chứa phần tử nào.

java
Copy code
Set<String> set = new HashSet<>();
boolean isEmpty = set.isEmpty();
7. iterator()
Trả về một Iterator để duyệt qua các phần tử trong Set.

java
Copy code
Set<String> set = new HashSet<>();
Iterator<String> iterator = set.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
8. remove(Object o)
Xóa phần tử o khỏi Set nếu nó tồn tại. Trả về true nếu phần tử này được xóa thành công.

java
Copy code
Set<String> set = new HashSet<>();
boolean removed = set.remove("element");
9. removeAll(Collection<?> c)
Xóa tất cả các phần tử của Collection c khỏi Set. Trả về true nếu Set thay đổi sau khi xóa các phần tử.

java
Copy code
Set<String> set = new HashSet<>();
Collection<String> collection = Arrays.asList("element1", "element2");
set.removeAll(collection);
10. retainAll(Collection<?> c)
Giữ lại các phần tử trong Set mà cũng có trong Collection c. Trả về true nếu Set thay đổi sau khi thực hiện thao tác này.

java
Copy code
Set<String> set = new HashSet<>();
Collection<String> collection = Arrays.asList("element1", "element2");
set.retainAll(collection);
11. size()
Trả về số lượng phần tử trong Set.

java
Copy code
Set<String> set = new HashSet<>();
int size = set.size();
12. toArray()
Trả về một mảng chứa tất cả các phần tử trong Set.

java
Copy code
Set<String> set = new HashSet<>();
Object[] array = set.toArray();
13. toArray(T[] a)
Trả về một mảng chứa tất cả các phần tử trong Set. Nếu mảng đã cho có đủ kích thước, các phần tử sẽ được lưu trữ trong mảng này. Ngược lại, một mảng mới với cùng kiểu và kích thước sẽ được tạo ra.

java
Copy code
Set<String> set = new HashSet<>();
String[] array = set.toArray(new String[0]);
 */
}
