//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bodyMInd1 = service.calculate (98, (int) 1.87 );
        System.out.println("Ваш индекс массы тела" + bodyMInd1);
        System.out.println();

        int bodyMInd2 = service.calculate((int) 65.5, (int) 1.56);
        System.out.println("Ваш индекс массы тела" + bodyMInd2);
        System.out.println();

        int bodyMInd3 = service.calculate((int) 68.3 , (int) 1.78);
        System.out.println("Ваш индекс массы тела" + bodyMInd3);
        System.out.println();


    }
}