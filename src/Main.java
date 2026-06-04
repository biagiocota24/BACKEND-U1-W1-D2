import entities.Circle;

public static void main(String[] args) {

//    boolean prova = Metodi.pariDispari("sucaa");
//    System.out.println(prova);
//
//    System.out.println("è bisestile ? " + Metodi.annoBisestile(2000));
//
//    System.out.println("è bisestile ? " + Metodi.annoBisestile(2023));
//
//    Metodi.numeroInLettere(1);
//    Metodi.numeroInLettere(2);
//    Metodi.numeroInLettere(-1);
//
//    Metodi.lancioMissile();
//    Metodi.calcola();
    Circle circle1 = new Circle(25, 50, 50);
    Circle circle2 = new Circle(25, 50, 50);
//    Circle circle3 = new Circle(25, 50, 50);
//    Circle circle4 = new Circle(25, 50, 50);

//    circle1.printInfo();
//    System.out.println("--------------------------");
//    circle2.printInfo();
//    System.out.println("--------------------------");
//    circle4.printInfo();
//    System.out.println("--------------------------");

//    Circle.printNumeroCreati();

    if (circle1.equals(circle2)) {
        System.out.println("sono uguali");
    } else {
        System.out.println("sono diversi");
    }


    System.out.println(circle1);
    System.out.println(circle2);

}
