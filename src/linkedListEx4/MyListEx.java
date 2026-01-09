package linkedListEx4;

import linkedListEx4.linkedList.MyNode;
import linkedListEx4.linkedList.MyList;

class MyListEx extends MyList {
    MyListEx(UserData dummyHead) {
        super(dummyHead);
    }

    @Override
    public void onRemoveNode(MyNode node) {
        UserData user = (UserData)node;
        System.out.print("MyListEx.onRemoveNode(");
        System.out.println(node.getKey() + ")");
    }
}