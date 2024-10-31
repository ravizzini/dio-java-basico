
public class ParametrosInvalidosException extends Exception {

    static void verificarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }


    }
}
