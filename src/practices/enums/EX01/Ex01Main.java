package practices.enums.EX01;

public class Ex01Main {

    public static void main(String[] args) {
        //verilen ay nosuna gore ayin kac gun oldugunu yazdiriniz

        Aylar ay = Aylar.KASIM;

        System.out.println("ay " +ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());//enum yapisindaki index sirasi
        //int ay =  5;
        switch (ay) {

            case OCAK:
                System.out.println("ocak");
                break;

            case SUBAT:
                System.out.println("subat");
                break;

            case MART:
                System.out.println("mart");
                break;

            case NISAN:
                System.out.println("nisan");
                break;

            case KASIM:
                System.out.println("mayis");
                break;

        }

    }

}
