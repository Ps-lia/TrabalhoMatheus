import javax.swing.*;

public class Menu {

    private static Integer outMenu;

    public static Integer exibirMenu() {
        boolean verify;

        String option =  JOptionPane.showInputDialog(null, "===== Menu ===== \n"
                + "1. Aplicar desconto % num valor \n"
                + "2. Incrementar  \n"
                + "3. Opção 3 \n"
                + "4. Opção 4 \n"
                + "5. Opção 5 \n"
                + "6. Opção 6 \n"
                + "7. Opção 7 \n"
                + "8. Opção 8 \n"
                + "9. Opção 9 \n"
                + "10. Sair \n"
                + "================");

        verify =  option.matches("^\\d+$");
        if (!verify) return null;

        outMenu =  Integer.valueOf(option);
        return outMenu;
    }

    private void validarMenu(Integer outMenu) {

    }

}
