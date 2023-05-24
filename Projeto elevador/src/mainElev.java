public class mainElev {

        public static void main(String [] args){

            //Elevador Entrada elevador1
            Elevador Entrada = new Elevador (1, 15,"5, 4, 1, T, SS",1125,"T",
                    "4",5);
            Entrada.entra(10);
            Entrada.sai(5);
            Entrada.imprimirDados(Entrada);

            //Elevador Entrada elevador2
            Elevador Entrada1 = new Elevador (2, 15,"5, 4, 1, T, SS",1025,"T",
                    "4",5);
            Entrada1.entra(10);
            Entrada1.imprimirDados(Entrada1);

            //Elevador Atrio
            Elevador Atrio = new Elevador (3, 24,"5, 3, 2, 1, T, SS",1800,"T",
                    "3",5);
            Atrio.entra(10);
            Atrio.imprimirDados(Atrio);

            //Elevador Atrio
            Elevador Atrio2 = new Elevador (4, 24,"5, 3, 2, 1, T, SS",1800,"T",
                    "3",5);
            Atrio2.entra(10);
            Atrio2.imprimirDados(Atrio2);

            //Elevador Biblioteca
            Elevador Biblioteca = new Elevador (5, 15,"5, 4, 1, T, SS",1125,"T",
                    "5",5);
            Biblioteca.entra(10);
            Biblioteca.imprimirDados(Biblioteca);

            //Elevador Biblioteca
            Elevador Biblioteca2 = new Elevador (6, 15,"5, 4, 1, T, SS",1125,"T",
                    "5",5);
            Biblioteca2.entra(10);
            Biblioteca2.imprimirDados(Biblioteca2);
        }

}
