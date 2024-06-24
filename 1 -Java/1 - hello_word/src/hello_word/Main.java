public class BonecoMovimentoTerminal {

    public static void main(String[] args) {
        char[][] campo = new char[10][10]; 
        int x = 4, y = 4; 

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == y && j == x) {
                        System.out.print('B'); 
                    } else {
                        System.out.print('.');
                    }
                }
                System.out.println();
            }

            System.out.println("Use WASD para mover o boneco. Pressione Q para sair.");
            char movimento = lerEntrada();

            if (movimento == 'w' && y > 0) {
                y--;
            } else if (movimento == 's' && y < 9) {
                y++;
            } else if (movimento == 'a' && x > 0) {
                x--;
            } else if (movimento == 'd' && x < 9) {
                x++;
            } else if (movimento == 'q') {
                break; // Sai do loop para encerrar o programa
            }
        }
    }

    // Método para ler a entrada do usuário
    private static char lerEntrada() {
        try {
            // Lê um caractere do input do usuário
            return (char) System.in.read();
        } catch (Exception e) {
            return ' ';
        }
    }
}
``
