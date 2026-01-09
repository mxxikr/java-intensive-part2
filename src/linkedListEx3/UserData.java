package linkedListEx3;

import linkedListEx3.linkedList.MyNode;

class UserData extends MyNode {
    private String name;
    private String phone;

    UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }

    @Override
    public String getKey() {
        return name;
    }

    @Override
    public void printNode() {
        System.out.println(name + "\t" + phone);
    }
}
