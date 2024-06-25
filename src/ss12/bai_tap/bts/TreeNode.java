package ss12.bai_tap.bts;

import ss11.thuc_hanh.myLinked_list_queue.Node;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    public TreeNode(E e) {
        element = e;
    }
}
