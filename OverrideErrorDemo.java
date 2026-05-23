class Parent {
    public void showMessage() {
        System.out.println("Сообщение из Parent");
    }
}

class Child extends Parent {
    // Хотели переопределить showMessage(), но ошиблись в имени
    @Override
    public void showMsg() {
        System.out.println("Сообщение из Child");
    }
}