import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random aleatorio  = new Random();

        int numeroAleatorio = aleatorio.nextInt(6) + 1 ;

        switch (numeroAleatorio) {
            case 1:
                System.out.println("+-------+");
                System.err.println("|       |");
                System.err.println("|   *   |");
                System.err.println("|       |");
                System.out.println("+-------+");
                break;
            

            case 2:
                System.out.println("+-------+");
                System.err.println("| *     |");
                System.err.println("|       |");
                System.err.println("|     * |");
                System.out.println("+-------+");
                break;
            
            case 3:
                System.out.println("+-------+");
                System.err.println("| *     |");
                System.err.println("|   *   |");
                System.err.println("|     * |");
                System.out.println("+-------+");
                break;
            case 4:
                System.out.println("+-------+");
                System.err.println("| *   * |");
                System.err.println("|       |");
                System.err.println("| *   * |");
                System.out.println("+-------+");
                break;
            case 5:
                System.out.println("+-------+");
                System.err.println("| *   * |");
                System.err.println("|   *   |");
                System.err.println("| *   * |");
                System.out.println("+-------+");
                break;
            
            case 6:
                System.out.println("+-------+");
                System.err.println("| *   * |");
                System.err.println("| *   * |");
                System.err.println("| *   * |");
                System.out.println("+-------+");
                break;
            
            default:
                break;
        }
        System.out.println(numeroAleatorio);
    }
}

  