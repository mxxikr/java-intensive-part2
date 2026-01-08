package innerClassAndAnonymous.anonymousField;

class MyWindow {
    interface OnClickListener {
        public void onClick();
    }
    OnClickListener listener = new MyWindow.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("Anonymous listener");
        }
    };
    public void click() {
        listener.onClick();
    }
}