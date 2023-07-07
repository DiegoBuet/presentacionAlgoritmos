public class PoolString {
    public static void main(String[] args) {
        //En el pool String es el lugar de memoria donde se almacenan los literales string
        String valor1 = "Hola mundo!";
        String valor2 = "Hola mundo!";
        String valor3 = "Hola " + "mundo!";
        String valor4 = "Hola ";
        String valor5 = "mundo!";
        String valor6 = valor4+valor5;

        //Apuntan a la misma referencia en memoria
        System.out.println(valor1==valor2);


        //System.out.println(valor1==valor3);
        System.out.println(valor1=="Hola mundo! ".trim());
        //System.out.println(valor1=="Hola mundo! ".trim().intern());
       // System.out.println(valor1==valor4+valor5);
       // System.out.println(valor6==valor1);
        //System.out.println(valor6.equals(valor1));




    }
}
