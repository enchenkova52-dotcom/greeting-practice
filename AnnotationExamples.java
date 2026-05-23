public class AnnotationExamples {

    @Override
    public String toString() {
        return "Переопределённый метод";
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("Этот метод устарел");
    }

    @SuppressWarnings("unchecked")
    public void suppressWarning() {
        System.out.println("Предупреждение подавлено");
    }

    public static void main(String[] args) {
        AnnotationExamples obj = new AnnotationExamples();
        System.out.println(obj.toString());
        obj.oldMethod();
        obj.suppressWarning();
    }
}